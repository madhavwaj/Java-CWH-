public class fibonacci_series {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        System.out.println(a+ +b);
//        int i =1;
//        while(i<=5){
//            int c = a+b;
//            System.out.println(c);
//            a =b;
//            b =c;
//            i++;
//        }

        //for loop
//        int a =0;
//        int b =1;
//        System.out.print(a+" "+b);
//        int c;
//        for(int i=3;i<=10;i++){
//            c = a+b;
//            System.out.print(" "+c);
//            a = b;
//            b=c;
//
//        }

        int a = 0, b = 1;
        System.out.print(a+" "+b);
        int c;
        for(int i =3;i<=10;i++){
            c =a+b;
            System.out.print(", "+c);
            a =b;
            b=c;
        }

    }
}
