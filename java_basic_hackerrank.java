import java.util.Scanner;
public class java_basic_hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String myString = sc.next();
//        int myint = sc.nextInt();
//        sc.close();
//        System.out.println(a);
//        System.out.println(""+myString);
//        System.out.println(""+myint);

      /*  int no = 122;
        int temp = no;
        int rev=0,rem;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(no==rev){
            System.out.println("palindrome no");
        }
        else{
            System.out.println("not palindrome");
        }

       */
//        for (int i =1;i<5;i++){
//            for(int j=i;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//    }

        int t = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                a = a + b;
                System.out.print(a + " ");
                b = b * 2;
            }
            System.out.println(" ");
        }
    }
}
