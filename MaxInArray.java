class MaxInArray{
    public static int solve(int[] arr,int i) {
        if(i >= arr.length) {
            return Integer.MIN_VALUE;
        }
        int maxi = arr[i++];
        int maxi1 = solve(arr,i);
        return Math.max(maxi,maxi1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 9, 21, 36, 10};
        int max = solve(arr,0);
        System.out.println("Maximum element in array :" + " " + max);

    }
}