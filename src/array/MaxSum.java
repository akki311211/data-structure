package array;

public class MaxSum {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,-2,5};
        sum(arr, n);
        sum(new int[]{-1, -2, -3, -4}, 4);
        sum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}, 8);
    }
    private static void sum(int[] arr, int n){
        int sum = 0;
        int max = Integer.MIN_VALUE;
          for(int i=0;i <n; i++){
              sum = sum + arr[i];
              max = Math.max(sum, max);
              if(sum < 0){
                  sum = 0;
              }
          }
          System.out.println("max sum : "+max);
    }
}
