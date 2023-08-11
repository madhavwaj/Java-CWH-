public class Assignment_06 {
    public static int additionSimple (int x , int y){
        int a = x+y;
        return a;
    }
    public static int subtraction (int x , int y) {
        int a = x-y;
        return a;
    }
    public static int multiplication(int x , int y){
        int a = x*y;
        return a;
    }
    public static double divisionSimple(int x , int y){
        double a = x/y;
        return a;
    }
    public static int reminderSimple(int n , int m){
        int a = n%m;
        return a;
    }
    public static double squareRootSimple(int n){
        double a = Math.sqrt(n);
        return a;
    }
    public static void main (String args[]){

        int a = additionSimple(9,9);
        int b = subtraction(9 ,9);
        int c = multiplication(9,9);
        double d = divisionSimple(9 , 9);
        double e = squareRootSimple(9);
        int f = reminderSimple(9,3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
    }
