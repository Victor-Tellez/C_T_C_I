public class URLify {

    /*
     * Replace all spaces in a char array with %20
     * Input: "Mr john Smith      ",13
     * Output: "Mr%20John%20Smith"
     */

    public static void urlify(char[] x, int size){
        //Space 32
        int pointer = x.length - 1;


        for(int i =size-1; i>-1; i--){
            if((int)x[i] !=32){
                x[pointer]=x[i];
            }else{
                x[pointer]='0';
                pointer--;
                x[pointer]='2';
                pointer--;
                x[pointer]='%';
            }
            pointer--;
        }
        System.out.println(x);
    }


    public static void main(String args[]){
        char[] x = {'M','r',' ','j','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        urlify(x,13);
    }
}
