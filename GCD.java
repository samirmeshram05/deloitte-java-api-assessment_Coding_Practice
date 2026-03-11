import java.util.*;

public class GCD{
    public static int cal(int x, int y){
        if(y==0){
            return x;

        }
        else{
            return cal(y ,x%y);
        }
    }

    public static void main(String[] args) {
        int x=10;
        int y=20;
        int gd=cal(x,y);
        System.out.println("the GCD is \t"+ x +"and \t"+ y + "is:\t"+ gd);
    }
}