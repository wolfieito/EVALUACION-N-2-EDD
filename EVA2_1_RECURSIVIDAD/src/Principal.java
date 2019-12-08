import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iVal=s.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i+" - ");
        }
        System.out.println("");
        forFalso(iVal);
        System.out.println("");
        
        forFalso2(iVal,1);
    }
    public static void forFalso(int iVal){
        System.out.print(iVal+" - ");//resolver pequeña parte del problema
        if(iVal>1)//detener la recursividad
        forFalso(iVal-1);
    }
    public static void forFalso2(int iVal,int inc){
        System.out.print(inc+" - ");
        if(inc<iVal)
        forFalso2(iVal,inc+1);
    } 
}
