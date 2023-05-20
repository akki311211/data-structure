package array;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int N = 5;
        int arr[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
    }
    private static void sort(int[] arr){
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        while(mid <= end){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                mid++;
                start++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
