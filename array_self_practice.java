public class array_self_practice {
    public static void main(String[] args) {
       /* int marks[] = {1, 3, 5, 6, 88, 9};
        //  System.out.println(marks.length);
        //  System.out.println(marks[4]);

        //Q2
        for (int i = 5; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for (int i = marks.length - 1; i > 0; i--) {
            System.out.println(marks[i]);
        }
        */

        /*Question 2
       float [] marks = {11.2f, 33.4f, 44.6f, 44.5f, 22.4f};
       float sum = 0;
       for(float element:marks){
           sum = sum + element;
       }
        System.out.println("The value of the sum is "+sum);

         */

       /* float[] marks = {22.4f, 55.6f, 44.6f, 44.5f, 22.4f};
        float num = 44.6f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) ;
            isInArray = true;
            break;
        }

        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in array");
        }
        */
        // repeating question 2
      /*  float[] marks = {22.4f, 55.6f, 44.6f, 44.5f, 22.4f};
        float num = 22.4f;
        boolean isInArray = false;
        for (float element:marks){
            if (num == element);
            isInArray = true;
            break;
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in array");
        }

       */
        //repeating its once again

      /*  float[] marks = {22.4f, 55.6f, 44.6f, 44.5f, 22.4f};
        float num = 22.4f;
        boolean isInArray= false;
        for(float element:marks){
            if(num == element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array ");
        }
        else{
            System.out.println("The value is not present in array");
        }
        }
        */
//question 3

        /*float[] marks = {22.4f, 55.6f, 44.6f, 44.5f, 22.4f};
        float sum =0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The value of avg marks is"+sum/marks.length);

         */
        //question 4
       /* int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                          {0, 0, 0}};
        for(int i =0; i<mat1.length;i++){
             for(int j=0; j<mat1[i].length;j++){
                 System.out.format("Setting values for i=%d and j=%d\n",i, j);
                 result[i][j] = mat1 [i][j] +mat2[i][j];

             }
        }
        */

//        int[][] mat1 = {{1, 2, 3},
//                      {4, 5, 6}};
//        int[][] mat2 = {{12, 6, 13},
//                         {3, 4, 8}};
//        int [][] result = {{0, 0, 0},
//                        { 0, 0, 0}};
//        for(int i =0;i<mat1.length;i++){
//            for(int j =0;j<mat1[i].length;j++){
//                System.out.format("Setting values for i=%d and j=%d\n",i,j);
//                result[i][j] = mat1[i][j]+mat2[i][j];
//            }
//        }
        //printing the element of 2d array
        /*for(int i =0;i<mat1.length;i++){
            for(int j =0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
            System.out.println(" ");
        }

         */
     /*   float[] marks = {22.4f, 55.6f, 44.6f, 44.5f, 22.4f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value is "+sum);
*/


    }
}

