public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }


    static void foo(int a){
        System.out.println("Good Morning bro");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + "bro!");
        System.out.println("Good morning " + b + "bro");

    }

   static void change(int a){
       a =98;
   }
   static void change2(int [] arr){
       arr[0] = 98;
   }

    static void telljoke() {
        System.out.println("I invented a new word!\n"+"Plagirism!");


    }

    public static void main(String[] args) {
      //   telljoke();
//        int[] marks = {52, 73,  77, 89, 98, 94 };
        //Case 1 : Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " +x);

        //Changing the array
//        int[] marks = {52, 73,  77, 89, 98, 94 };
//        change2(marks);
//        System.out.println("The value of x after running change is:" + marks[0]);


        //Method overloading
        foo();
        foo(3000);
        foo(3000, 4000); // Arguments are acutal (int a, int b = parameters)(3000, 4000 arguments)





   }

}
