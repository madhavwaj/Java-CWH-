import java.util.Scanner;
public class Methods {
    public static void add(int a , int b){
        int z = a+b;
        System.out.println(z);
    }
    public static void product(int e , int f){
        int g = e*f;
        System.out.println(g);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        add(x,y);
        product(x,y);

    }
}
