import java.sql.SQLOutput;
import java.util.Scanner;

public class methods_2 {
    public static int add(int a , int b){
        int z = a+b;
        return z;
    }
    public static int product(int h , int j){
        int l = h*j;
//        System.out.println(l);
        return l;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int q = add(x,y);
        System.out.println("-------------------");
        int u = product(x,y);
        System.out.println(u);



    }
}
