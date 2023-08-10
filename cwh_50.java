import java.util.Random;
import java.util.Scanner;
class game {
    int m, n;
    int Noofguess = 0;

    public int getN0ofguess() {
        return Noofguess;
    }

    public void setNoofguess(int noofguess) {
        Noofguess = noofguess;
    }

    game() {
        Random rand = new Random();
         this.n = rand.nextInt(10);
    }
    public void takeuserinput() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        this.m = sc.nextInt();
    }
    public boolean iscorrectnumber() {
        Noofguess++;
        if (m == n) {
            System.out.println("Right guess");
            System.out.println( Noofguess+" attempts");
            return true;
        } else if (m < n) {
            System.out.println("Your guess is low");
        } else if (m > n) {
            System.out.println("Your guess is high");
        }
        return false;
    }
}
public class cwh_50 {
    public static void main(String[] args) {
        game obj = new game();
        boolean b = false;
        while(!b) {
            obj.takeuserinput();
           b= obj.iscorrectnumber();
        }
    }
}


