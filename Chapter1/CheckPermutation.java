public class CheckPermutation {
    /*
     * Given 2 Strings check if one is a permutation of the other
     */
    public static boolean checkPermutation(String x, String y){
        x= x.toUpperCase();
        y= y.toUpperCase();
        int[] alphabetx = new int[26];
        int[] alphabety = new int[26];
        int ascii;

        for(int i = 0 ; i<x.length(); i++){
            ascii = ((int)x.charAt(i))-65;
            alphabetx[ascii]++;
        }

        for(int i = 0 ; i<y.length(); i++){
            ascii = ((int)y.charAt(i))-65;
            alphabety[ascii]++;
        }

        for(int i = 0 ; i<alphabetx.length; i++){
            if(alphabetx[i] != alphabety[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String x1 = "taco";
        String x2 = "acat";

        System.out.println("Test: ");
        if(checkPermutation(x1,x2)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }


    }
}
