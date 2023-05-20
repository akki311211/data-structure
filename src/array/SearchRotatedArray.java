package array;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int N = 9;
        int A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        System.out.println("Index : "+search(A, N, key));
    }
    private static int search(int [] arr, int n, int key){
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[s] <= arr[mid] ){
              if(key >= arr[s] && key <= arr[mid]){
                  e = mid-1;
              }else{
                  s = mid+1;
              }
            }else {
                if(key >= arr[mid] && key <= arr[e]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }
}
