package modul2tugas;

public class modultugasnomor3 {
    public static void main(String[] args){
        int[][] M= {
            {4, 3, 5},
            {7, 4, 8},
        };
        int[][] N={
            {2, 5},
            {4, 9},
            {6, 3}
        };
        if(M[0].length == N.length){
            int[][] C = new int[M.length][N[0].length];
            for(int i=0; i<M.length; i++){
                for(int j=0; j<N[0].length; j++){
                    for(int k=0; k<M[0].length; k++){
                        C[i][j] += M[i][k] * N[k][j];
                    }
                }
            }
            for(int[] c: C) {
               for(int i: c){
                 System.out.print(i+" ");
                    
               }
               System.out.println();
            }
        }
        else {
            System.out.println("ukuran kolom A tidak sama dengan baris B");
        }
    }
    
}
