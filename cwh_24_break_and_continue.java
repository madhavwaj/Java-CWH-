public class cwh_24_break_and_continue {
    public static void main(String[] args) {
//         using break statement
//        int i =0;
//        for (i = 0; i <= 10; i++) {
//            System.out.println("Java is great");
//            System.out.println(i);
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;

//            }
//
//        }
//            int i=0;
//            while (i<5){
//                System.out.println(i);
//                System.out.println("Java is great");
//                if(i==2){
//                    System.out.println("Ending the loop");
//                    break;
//                }
//                i++;
//            }
//
//        System.out.println("loop ends here");

        for (int i=4; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
