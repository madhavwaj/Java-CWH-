public class min {
    public static void main(String[] args) {
        int[] arr = {11, 22, 21, 33, 9, 8};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for(int i =1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];

            }
        }
        return min;

    }
}
