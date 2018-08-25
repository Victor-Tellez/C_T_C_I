public class ZeroMatrix {
    /*
     * If an element in a MxN matrix is 0 its entire row and column is set to 0
     */

    public static void printMatrix(int [][] x){
        for(int i = 0 ; i<x.length; i++){
            for(int j = 0 ; j<x[0].length; j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int[][] zeroMatrix(int[][] x){
        int [][] y = new int[x.length][x[0].length];
        int[] row = new int[x.length];
        int[] col = new int[x[0].length];
        for(int i = 0 ; i<x.length; i++){
            for(int j = 0 ; j<x[0].length; j++){
                if(x[i][j]==0){
                    row[i]++;
                    col[j]++;
                }
                y[i][j]= 1;
            }
        }
        //System.out.println("ROW:");
        for(int i = 0 ; i< row.length; i++){
            if(row[i]!=0){
                //System.out.print(i+" ");
                for(int j = 0 ; j<col.length;j++){
                    y[i][j]=0;
                }
            }
        }

        //System.out.println("");
        //System.out.println("COL:");
        for(int i = 0 ; i< col.length; i++){
            if(col[i]!=0){
                //System.out.print(i+" ");
                for(int j = 0 ; j<row.length;j++){
                    y[j][i]=0;
                }
            }
        }


        printMatrix(y);
        return y;

    }
    public static void main(String args[]){
        int[][] x = {   {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,0,1,0},
                        {1,1,1,1,1},
                        {1,1,1,1,1}
        };


        zeroMatrix(x);

    }
}
