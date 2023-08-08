import java.util.Scanner;

public class CWH_percentage {
    public static void main (String args[]){
        System.out.println("Enter the marks of 5 subjects");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter  the marks of subject a");
        float b = sc.nextFloat();
        System.out.println("Enter the value of subject b");
        float c = sc.nextFloat();
        System.out.println("Enter the value of subject c");
        float d = sc.nextFloat();
        System.out.println("Enter the value of subject d");
        float e = sc.nextFloat();
        System.out.println("The percentage is : ");
        float total = (a+b+c+d+e);
        float Percentage = (total/500)*100;
        System.out.println(Percentage);
    }
}
