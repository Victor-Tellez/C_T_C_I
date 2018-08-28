public class OneWay {
    /*
     * There are three types of edits that can be performed on strings
     * insert a character
     * remove a character
     * or replace a character
     * Given 2 string write a function to check if they are one edit (or zero edits) away
     *
     * EXAMPLE
     * pale     ->  ple     ->  true
     * pales    ->  pale    ->  true
     * pale     ->  bale    ->  true
     * pale     ->  bake    ->  false
     */

    public static boolean oneAway(String a, String b){
        if(b.length()==a.length()){
            int count = 0;
            for(int i = 0 ; i<a.length(); i++){
                if(a.charAt(i)!=b.charAt(i)){
                    count++;
                }
                if(count>1){
                    return false;
                }
            }
            return true;
        }else if(b.length()>a.length()){
            String x = b;
            b=a;
            a=x;
        }
        int count = 0 ;
        int pointer = 0;
        System.out.println(b+" ; "+a);
        for(int i = 0 ; i < a.length() ; i++){
            if(count==b.length()){
                return true;
            }
            if(a.charAt(i)!=b.charAt(pointer)){

            }else{
                count++;
                pointer++;
            }

        }
        if(count<a.length()-1){
            return false;
        }

        return true;
    }

    public static void main(String args[]){
        String a = "pale";
        String b = "bake";
        System.out.println(oneAway(a,b));


    }
}
