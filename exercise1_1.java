import java.util.Scanner;

public class exercise1_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter marks obtained in Subject 1 ");
        float a = sc.nextFloat();
        System.out.println("Enter marks obtained in Subject 2 ");
        float b = sc.nextFloat();
        System.out.println("Enter marks obtained in Subject 3 ");
        float c = sc.nextFloat();
        System.out.println("Enter marks obtained in Subject 4 ");
        float d = sc.nextFloat();
        System.out.println("Enter marks obtained in Subject 5 ");
        float e = sc.nextFloat();
        System.out.println("Your percentage is");
        float total = (a+b+c+d+e);
        float per = (total/500)*100;
        System.out.println(per);

    }
}
