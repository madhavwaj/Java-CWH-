import java.util.Scanner;

public class celcius_to_fah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value in Celcius");
        int n = sc.nextInt();
        float fah = (n*9.0f/5.0f)+32.0f;
        System.out.println(n+" celcius= "+fah+" Fahernheit ");





      //  (c*9/5)+32 = 32f



    }
}
