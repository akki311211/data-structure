public class TrappingRain {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {3,0,0,2,0,4};
        System.out.println("trapped water :"+max(arr, N));
    }
    private static int max(int[] arr, int n){
        int max = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i=1; i < n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        for(int i=n-2; i >=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        for(int i = 0; i< n; i++){
            max = max + (Math.min(right[i], left[i])-arr[i]);
        }
        return max;
    }
}
