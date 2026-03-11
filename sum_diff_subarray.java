import java.util.*;
class sum_diff_subarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int[] arr= new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();

        }

        
        System.out.println(arr);
        Arrays.sort(arr);
        for (int i=0;i<n/2;i++) {
            sum=sum+(arr[n-i-1]-arr[i]);
        }
        System.out.println(sum);
        s.close();
    }
}