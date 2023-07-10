import java.util.ArrayList;
public class FindAll {
    static ArrayList<Integer> res = new ArrayList<>();
    public static void solve(int[] arr,int target,int i) {
        if( i == arr.length) {
            return;
        }
        if(arr[i] == target) {
            res.add(i);
        }
        solve(arr,target,++i);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5,2,2,2,3};
        solve(arr,2,0);
        System.out.println(res); 
    }
}
