/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesconmatrices;

/**
 *
 * @author josed
 */
public class OperacionesConMatrices {

   
    public static void main(String[] args) {
        
        int[][] matrizA={
            {1,2,3},
            {4,5,6},
        };
        
        int[][] matrizB={
            {7,8,9},
            {10,11,12},
        };
        
        //suma de matrices
        int[][] suma=new int[2][3];
        for (int i=0; i<matrizA.length;i++){
            for(int j=0; j< matrizA[0].length;j++)
            {
                suma[i][j]=matrizA[i][j] + matrizB[i][j];
            }
        }
        
        //resta de matrices
        int[][] resta=new int[2][3];
        for (int i=0; i<matrizA.length;i++){
            for(int j=0; j< matrizA[0].length;j++)
            {
                resta[i][j]=matrizA[i][j] - matrizB[i][j];
            }
        }
        
        //multiplicación de matrices
        int[][]matrizC={
            {1,2},
            {3,4},
            {5,6},
        };
        
        int[][]multiplicacion=new int[2][2];
        for(int i=0;i < matrizA.length; i++){
            for(int j=0;j < matrizC[0].length; j++){
                for(int k=0; k < matrizC.length; k++){
                    multiplicacion[i][j] += matrizA[i][k]*matrizC[k][j];
                }
            }
        }
        
        //producto escalar
        
        int escalar=2;
        int[][]productoEscalar=new int[2][3];
        for(int i=0; i< matrizA.length; i++){
            for(int j=0;j < matrizA[0].length; j++){
                productoEscalar[i][j]=matrizA[i][j]*escalar;
            }
        }
        
        
        //Imprimir Resultados
        System.out.println("Suma de Matrices");
        imprimirMatriz(suma);
        System.out.println("Resta de Matrices");
        imprimirMatriz(resta);
        System.out.println("Multiplicación de Matrices");
        imprimirMatriz(multiplicacion);
        System.out.println("Producto Escalar de Matrices");
        imprimirMatriz(productoEscalar);
    }
    
    //método para imprimir
    public static void imprimirMatriz(int[][] matriz){
        for(int[] fila: matriz){
            for(int elemento: fila){
                System.out.println(elemento + "\t");
            }
            System.out.println();
        }
    }
    
}
