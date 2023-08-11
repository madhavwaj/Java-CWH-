public class cwh_14_string_methods {
    public static void main(String args[]){
        String name = "Madhav";
        //name.length()
//        int value = name.length();
//        System.out.println(value);

        //name.toLowerCase
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

        //name.toUpperCase()
//        String Ustring = name.toUpperCase();
//        System.out.println(Ustring);

        //name.trim()
//        String nonTrimmedString = "    Madhav    ";
//        System.out.println(nonTrimmedString);
//        System.out.println(nonTrimmedString.trim());

        //name.substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));

        //name.replace
        System.out.println(name.replace("hav","dy"));

        System.out.println(name.startsWith("Mad"));
        System.out.println(name.endsWith("hav"));

    }
}
