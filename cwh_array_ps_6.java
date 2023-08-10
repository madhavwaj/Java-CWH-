//Q  uestion 1
//public class cwh_array_ps_6 {
//    public static void main(String[] args) {
//        float [] marks = {45.7f, 67.8f, 87.3f, 44.8f, 55.9f};
//        float sum =0;
//        for(float element:marks){
//            sum = sum+element;
//
//        }
//        System.out.println("the value of sum is"+sum);
//    }
//}

//Question 2

import java.io.OptionalDataException;

public class cwh_array_ps_6 {
        public static void main(String[] args) {
//            float[] marks = {45.7f, 67.8f, 87.3f, 44.8f, 55.9f};
//            float num = 67.8f;
//            boolean isInArray = false;
//            for (float element : marks) {
//                if (num == element) {
//                    isInArray = true;
//                    break;
//                }
//                }
//            if(isInArray) {
//                System.out.println("The value is array");
//            }
//            else{
//                System.out.println("the value is not array");
//
//
//
//            }
            //Question 3

           /* float [] marks = {45.7f, 67.8f, 87.3f, 44.8f, 55.9f};
            float sum = 0;
            for(float element:marks) {
                sum = sum + element;
            }
            System.out.println("The value of the avg marks is"+sum/marks.length);

            //Question 7
            boolean isSorted = true;
            int[] arr ={1, 2, 3, 4, 5, 34, 67};
            for (int i =0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]) {
                    isSorted = false;
                    break;
                }
                if (isSorted) {
                    System.out.println("The array is sorted");
                }
                else{
                    System.out.println("The array is not sorted");
                }
            }
*/         // q1

           /* float [] marks = {45.7f, 67.8f, 87.3f, 44.8f, 55.9f};
            float sum = 0;
            for(float element:marks){
                sum = sum+element;
            }
            System.out.println("The value of the sum is"+sum);
            */

            //q2

           /* float [] marks = {45.7f, 67.8f, 87.3f, 44.8f, 55.9f};
            float num = 45.7f;
            boolean IsinArray = false;
            for(float element:marks){
                if(num == element){
                    IsinArray = true;
                    break;
                }
            }
            if (IsinArray){
                System.out.println("The value of is present IsinArray");
            }
            else{
                System.out.println("the value is not present in array ");

            }

            */

//            float[] marks = {45.7f, 67.8f, 87.3f, 44.8f, 55.9f};
//            float sum = 0;
//            for (float element : marks) {
//                sum = sum + element;
//
//            }
//            System.out.println("The avg marks obtained by student is " + sum / marks.length);

            //Question 4

            int [][] mat1 = {{1, 2, 3},
                             {4, 5, 6}};
            int [] [] mat2 = {{2, 6, 13},
                              {3, 7, 1}};
          int [] [] result = {{0, 0, 0},
                                {0, 0, 0}};
          System.out.println(mat1.length);
            for (int i=0;i<mat1.length;i++){
               for(int j=0;j<mat1[i].length;j++){
                 System.out.printf("Setting value for i=%d and j=%d\n", i, j);
                    result[i][j] = mat1[i][j] + mat2[i][j];

                }
            }
            //Printing the element of a 2-D Array
//            for (int i = 0; i<mat1.length;i++){
//                for(int j=0;j<mat1[i].length;j++){
//                    System.out.print(result[i][j]+" ");
//                    result[i][j] = mat1[i][j] + mat2[i][j];
//                }
//                System.out.println("");
//            }

            //Question 5
//            int [] arr = {1, 2, 3, 4, 5, 6};
//            int l = arr.length;
//            int n = Math.floorDiv(l, 2);
//            int temp;
//            for(int i=0;i<n; i++){
//                //Swap a[i] and a[l-1-i]
//                //a  b  temp
//                // |4| |3| ||
//                temp = arr[i];
//                arr[i] = arr[l-i-1];
//                arr[l-i-1] = temp;
//            }
//            for(int element: arr){
//                System.out.println(element + " ");
//            }

//            int [] arr;
//            arr = new int[5];
//            arr[0] = 10;
//            arr[1] = 20;
//            arr[2] = 30;
//            arr[3] = 40;
//            arr[4] = 50;
//
//            for(int i =0;i<arr.length; i++){
//                System.out.println("Element at index " + i + " : " + arr[i]);
//            }


//            int [] arr = {1, 21, 3, 455, 34, 67};
//            int max = 0;
//            for(int e: arr){
//                if(e>max){
//                    max = e;
//                }
//            }
//            System.out.println("The maximum vale of the array is"+max);

            //Question 7
//            int [] arr = {1, 2, 3, 4, 5, 34,  67};
//            boolean isSorted = true;
//            for(int i =0;i<arr.length-1;i++){
//                if(arr[i]>arr[i+1]){
//                    isSorted = false;
//                    break;
//
//                }
//            }
//            if(isSorted){
//                System.out.println("The Array is sorted");
//            }
//            else{
//                System.out.println("Array is not sorted");
//            }

            int [] arr = {10, 21, 3, 455, 34, 67};
            int min = arr[0];
             for(int element:arr){
                if(element<min){
                    min=element;
                }
            }
            System.out.println("The minimum value of the element is "+min);
        }
    }