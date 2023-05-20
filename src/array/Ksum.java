package array;

public class Ksum {
    public static void main(String[] args) {
        int s = 15;
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        sum(A, s);

    }
    private static void sum(int[] arr, int k){
        int n = arr.length;
        int sum = arr[0];
        int start = 0;
        int s=0, e=0;
        for(int i=1; i<=n; i++){

            while(sum > k && start < i-1){
                sum = sum - arr[start];
                start++;
            }
            if(sum== k){
                s = start+1;
                e = i;
                break;
            }
            if(i < n){
                sum = sum+arr[i];
            }
        }
        if(s ==0 && e ==0){
            System.out.println(-1);
        }else
            System.out.println(s+" "+e);
    }
}
