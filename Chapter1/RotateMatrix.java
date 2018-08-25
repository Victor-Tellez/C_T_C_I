public class RotateMatrix {
    /*
     * Rotate a NxN matrix by 90 degrees
     */

    public static void rotate(char[][]x){

        char[][] y = new char[x.length][x.length];

        for(int i =0; i<x.length; i++){
            for(int j =0; j<x[0].length; j++){
                y[i][j]= x[x.length - (1+j)][i];
            }
        }


        for(int i =0; i<x.length; i++){
            for(int j =0; j<x[0].length; j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println("");
        }

    }






    public static void main(String args[]) {
        char[][] x = {  {'0', '0', '1', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '1', '1', '1'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
        };
        rotate(x);
    }


}
