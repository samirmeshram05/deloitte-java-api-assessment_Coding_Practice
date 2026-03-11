public class Symetric_matrix{
    static boolean isSymetric(int mat[][],int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(mat[i][j]!=mat[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int mat [][]={{1,3,5},{3,2,4},{5,4,1}};
        if(isSymetric(mat,3))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}