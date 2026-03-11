import java.util.*;

public class matrix{

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter the values of m:");
        int m=s.nextInt();
        System.out.println("Enter the values of n:");
        int n=s.nextInt();
        System.out.println("Enter the values of  k:");
        int k=s.nextInt();

        int[][]arr1=new int[m][n];
        int[][]arr2=new int[n][k];
         System.out.println("Enter the values of matrix 1:");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] = s.nextInt();            
            }
        }

         System.out.println("Enter the values of matrix 2:");
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                arr2[i][j] = s.nextInt();
            }
        }

        int[][] ans=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                ans[i][j]=0;
            }
        }
        
    for(int i=0;i<m;i++){
        for(int j=0;j<k;j++){
            for(int l=0;l<n;l++){
                ans[i][j]+=arr1[i][l]*arr2[l][j];

            }
        }
    }

    for(int i=0;i<m;i++){
        for(int j=0;j<k;j++){
            System.out.println(ans[i][j]+" ");
        
        }
    }
    
    }
}
