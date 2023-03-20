//reto sudoku con matrices
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        try(Scanner lectura=new Scanner(System.in)){
            int f,c,i,j,filas=0,columnas=0,a,b,d,m;
            System.out.println("Digite la filas que desea tener en el sudoku");
            f=lectura.nextInt();
            System.out.println("Digite la cantidad de columnas que desea tener en el sudoku");
            c=lectura.nextInt();
            int[][]sudoku=new int[f][c];
            for(i=0;i<f;i++){
                for(j=0;j<c;j++){
                System.out.println("Ingrese el numero que desea poner en la posicion de: fila "+(i+1)+" y en la columna "+(j+1)+" del sudoku");
                sudoku[i][j]=lectura.nextInt();
                }
                System.out.println(" ");
               }
            for(i=0;i<f;i++){
                for(j=0;j<c;j++){
                    System.out.print(sudoku[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
            }
            for (a=0;a<f;a++) {
                for(b=0;b<c;b++){
                    filas+=sudoku[a][b];
                }
                System.out.println("La fila "+(a+1)+" suma un total de: "+filas);
                System.out.println();
            }
            for (d=0;d<f;d++) {
                for(m=0;m<c;m++){
                    columnas+=sudoku[d][m];
                }
                System.out.println("La columna "+(d+1)+" suma un total de: "+columnas );
                System.out.println();
            }
        }
    }
}
