public class cwh_35_ps7_methods {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);

        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

        static void pattern1_rec(int n){
                if(n>0){
                    pattern1_rec(n-1);
                    for(int i=0; i<i+i;i++){
                        System.out.println(("*"));

                    }
                    System.out.println();
                }

        }


        // sum(3) = 3+ sum(2)
        // sum(3) = 3+2+sum(1)
        // sum(3) = 3+2+1
    static int sumrect(int n) {
        //Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumrect(n - 1);
    }

    static void pattern2(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i-1.; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

          static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;

        }
        else{
            return fib(n-1)+ fib(n-2);
        }
          }



    public static void main(String[] args) {
        //problem 1
        // multiplication(5);

        //problem 2

        // pattern1(4);

        //problem 3

//           int c = sumrect(5);
//           System.out.println(c);

        //problem 4

        pattern2(8);

        //problem 5
       // fibonacci series; 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        int result = fib(7);
        System.out.println(result);

        //problem 8

        pattern1_rec(5);


        //(c*9/5)+32 = 32f


    }

}
