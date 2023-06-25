public class Firstprog{
    private static void solve(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }
        //System.out.print(arr[idx]+" ");
        solve(arr,idx+1);
         System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       solve(arr,0);
    }

    
}