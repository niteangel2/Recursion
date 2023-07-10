public class FindLast {
        public static int solve(int[] arr,int target,int i) {
        if( i < 0) {
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }
        else{
            return solve(arr,target,--i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5,2,2,2,3};
        int idx = solve(arr,2,arr.length-1);
        System.out.println(idx); 
    }
}
