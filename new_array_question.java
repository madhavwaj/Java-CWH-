public class new_array_question {
    public static void main(String[] args) {
        int [] arr = {12, 2, 33, 46, 5, 6};
        int min = 0;
        for(int element:arr){ // element me 12 2 33 46 ... store hoga or min me arr [0]
            if(element<min){   // arr[0] ka value 12 hai toj 12<12 (false) fir 2<12 (true)
                min = element;
            }
        }
        System.out.println("The minimum value is"+min);

    }
}
