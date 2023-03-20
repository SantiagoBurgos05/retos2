//reto teclado de computador con matrices
public class Reto3{
    public static void main(String[] args){
        int filas,columnas;
        String[][] teclado={{"Esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","Ins","ImpPnt","Supr"},
            {"º","1","2","3","4","5","6","7","8","9","0","?","¿","<-","inicio",""},
            {"Tab ","Q","W","E","R","T","Y","U","I","O","P","`","*","}","Repag",""},
            {"BlocMay ","A","S","D","F","G","H","J","K","L","ñ","{","Enter","Avpag","",""},
            {"Shift ","Z","X","C","V","B","N","M",",",".","-","Pausa","Fin","^","",""},
            {"Ctrl","Fn","Windows","Alt","","","","Espacio","","","","Altgr","<>","<","v",">"}
        };     
        for(filas=0;filas<6;filas++) {
            for(columnas=0;columnas<16;columnas++) {
                System.out.print(teclado[filas][columnas] + "\t");
            }
            System.out.println("");
        }
    }
}
