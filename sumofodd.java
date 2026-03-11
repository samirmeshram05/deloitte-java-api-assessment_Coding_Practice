public class sumofodd{
    public static int um(int n){
        int sum=0;
        for(int i=1;i<=n;i +=2){
            sum=sum+i;
        }
        System.out.println("sum of odd Number:"+sum);
        return sum;

    }

    public static void main(String[] args) {
        int n=5;
        um(n);
        
    }
}