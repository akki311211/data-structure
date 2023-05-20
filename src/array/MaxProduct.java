package array;

public class MaxProduct {
  public static void main(String[] args) {

    int arr[] = {6, -3, -10, 0, 2};
    prod(arr);
    prod(new int[]{-1, -3, -10, 0, 60});
  }
  private static void prod(int[] arr){
    int min = arr[0];
    int max = arr[0];
    int ans = 0 ;
    int temp = 0;
    for(int i=1; i < arr.length ; i++){
      if(arr[i] < 0){
        temp = min;
        min = max;
        max = temp;
      }
      min = Math.min(arr[i], min*arr[i]);
      max = Math.max(arr[i], max*arr[i]);
      ans = Math.max(max, ans);
    }
    System.out.println("Max product : "+ans);
  }
}
