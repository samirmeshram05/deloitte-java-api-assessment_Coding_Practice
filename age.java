import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter age:");
        int age=s.nextInt();

        if (age< 18){
            System.out.println("Adult");

        }else{
            System.out.println("Not Adult");
        }
        s.close();
    }
}