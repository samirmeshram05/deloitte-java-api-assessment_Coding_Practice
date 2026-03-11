import java.util.*;
public class matrixsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] m=new int [3][3];
        int sum=0;
        System.out.println("Enter all the 9 element of matrix:");
        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                m[i][j]=s.nextInt();
                sum+=m[i][j];
            }
        }
        System.out.println(sum);
        s.close();

    }
}