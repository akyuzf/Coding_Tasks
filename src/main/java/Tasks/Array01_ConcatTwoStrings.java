package Tasks;


public class Array01_ConcatTwoStrings {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Deli";

        System.out.println(concatTwoStrings (str1, str2));
        System.out.println(concatTwoStrings (str2, str3));

    }


    public static String concatTwoStrings(String strA, String strB){

        return strA + ", " + strB;

    }


}
