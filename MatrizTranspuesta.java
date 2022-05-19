
public class MatrizTranspuesta
{
    public static void main(String[] args)
    {
       int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

       int[][] matrizT = new int [matriz[0].length][matriz.length];

       int fila, columnas;

       for(fila = 0; fila < 4; fila++)
       {
           for(columnas = 0; columnas < 3; columnas++)
           {
               System.out.println(" " + matriz[fila][columnas] + " ");
           }
       }

       for(fila =0; fila < matriz.length; fila++)
       {
           for(columnas=0; columnas < matriz[columnas].length; columnas++)
           {
               matrizT[columnas][fila] = matriz[fila][columnas];
           }
       }
       System.out.print( "Matriz Transpuesta" );

       for(fila =0; fila < matriz[fila].length; fila++)
       {
           for(columnas=0; columnas < matriz.length; columnas++)
           {
            System.out.println(" " + matrizT[fila][columnas] + " ");
           }
       }
    }
}