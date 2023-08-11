import java.util.Scanner;
public class Assignment_6_q2 {
    public static int getPentagonalNumber(int n){
    int a = n*((3*n)-1)/2;
    return a;
    }
    public static void main (String args []){
//        Scanner sc = new Scanner ( System.in);
//        int n = sc.nextInt();
//        int t = getPentagonalNumber(n);
//        System.out.println(t);
        int count = 0;
        for(int i=1; i<=100 ;i++ ) {
            int t = getPentagonalNumber(i);
            System.out.print(t + " ");
            count++;
            if (count == 10)
                System.out.println();
            count = 0;
        }
    }
}
