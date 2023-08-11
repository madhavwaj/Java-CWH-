
import java.util.Scanner;
public class Array_practice {
    public static void main(String[] args) {
//        boolean isSorted = false;
//        int [] arr = {22, 44, 21, 40, 12};
//        float [] marks = {55.3f, 44.5f, 67.3f, 77.9f, 88.2f};
//            }
//        }
//        if(isSorted){
//            System.out.println("Array is Sorted");
//        }
//        else{
//            System.out.println("Array is not Sorted");
//        }

//        int [] arr = {56, 22, 44, 21, 40, 12};
//        int max =0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("The maximum element present is"+max);

//        int [] arr = {56, 22, 44, 21, 40, 12};
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if (arr[i]<=min){
//                min=arr[i];
//            }
//
//        }
//        System.out.println("The minimum value is"+min);
//
//        float [] marks = {55.3f, 44.5f, 67.3f, 77.9f, 88.2f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum+element;
//        }
//        System.out.println("The avg marks is"+sum/marks.length);

//        int [] arr = {55, 44, 67, 77, 88};
//        boolean isinarray=false;
//        int num = 77;
//        for(float i=0; i<arr.length; i++){
//            if(num == arr[(int) i]){
//                isinarray=true;
//                break;
//
//            }
//        }
//        if(isinarray){
//            System.out.println("THe value is present in array");
//        }
//        else{
//            System.out.println("THe value is not present in array");
//       }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length of array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("enter the elements of array");
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int m = sc.nextInt();
//            arr[i] = m;
//            sum = sum + arr[i];
//        }
//        System.out.println("THe avg is " + sum/ arr.length);

//        int [] arr = new int[n];//dubba bn ra
//        System.out.println("Enter the element of the array");
//        int max =0;
//        for (int i=0; i<arr.length; i++){
//            int m = sc.nextInt();//value input hora jitna chaiye
//            arr[i]=m;//dubba me uper wala value bhar ra
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("The largest number present in array is"+max);



        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        int [] arr = new int [n];     //array bana jisme user value daalega
        System.out.println("Enter the element of array");     // ye line print hoga
        int max = 0; //
        for(int i=0;i<arr.length; i++){       //array chalane ke liye loop laga
            int m = sc.nextInt();            // jitna user value dalega utna baar number input hoga
            arr[i]=m;                       // agar user input
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum value is"+max);
    }
}



