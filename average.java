import java.util.*;

public class average{
    public static void main(String[] args){
        cal_average();

    }
    public static void cal_average(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a, b &c:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();


        int average=(a+b+c)/3;
        System.out.println("Average is:"+ average);
        s.close();
    }
}