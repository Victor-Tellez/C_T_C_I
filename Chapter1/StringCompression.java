public class StringCompression {
    /*
     * Returns a simple string conpresion algorithm
     */

    public static void compress(String x){
        String y ;
        int pointer;
        int count =1;
        pointer=0;
        for(int i =1; i<x.length(); i++){
            if(x.charAt(pointer) != x.charAt(i)){
                System.out.println(x.charAt(pointer)+" "+count);
                count =1;
                pointer=i;
            }else{
                count++;
            }
        }
        System.out.println(x.charAt(pointer)+" "+count);
    }
    public static void main(String args[]){
        String x = "aaabbaaaaacdda";
        //          a3 b2 a5 c1 d2
        compress(x);
    }
}
