import java.util.Arrays;

public class MinPlatform {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(" min platform : "+min(n ,arr, dep));
    }
    private static int min(int n, int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 1;
        int max = 1;
        int i = 1;
        int j = 0;
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                count++;
                max = Math.max(max, count);
                i++;
            }else{
                j++;
                count--;
            }
        }
        return max;
    }
}
