public class IsUnique {

    /*
     *  Algorithm that checks to see if a string has all unique characters
     */

    public static boolean isUnique(String x){
        x= x.toUpperCase();
        int[] alphabet = new int[26];
        int ascii;

        for(int i = 0 ; i<x.length(); i++){
            ascii = ((int)x.charAt(i))-65;
            //System.out.println(ascii);
            alphabet[ascii]++;
            if(alphabet[ascii]>1){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        String x1 = "abcdefghijkmnlop";
        String x2 = "abcdefgaijkmnlop";
        //String x2 = "a";

        System.out.println("Test1: ");
        if(isUnique(x1)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

        System.out.println("Test2: ");
        if(isUnique(x2)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
