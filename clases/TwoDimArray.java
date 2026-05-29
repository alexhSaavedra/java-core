package clases;

public class TwoDimArray {
    public static void main(String[] args) {
        
        int array[][] = new int[3][4];

        for(int i =0; i<3; i++){

            for(int j=0; j<4;j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }

        for(int n =0; n<3;n++){
            for(int m =0; m<4;m++){
                System.out.print(array[n][m] + " ");
            }

            System.out.println();
        }

        for(int n[]: array){

            for(int m: n){
                System.out.print(m + " ");
            }

            System.out.println();
        }
    }
    
}
