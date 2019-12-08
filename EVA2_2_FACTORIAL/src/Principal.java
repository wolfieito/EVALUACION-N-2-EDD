/*
 * 
 * 
 * 
 */

/**
 *
 * @author martin
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int x=s.nextInt();
        s.nextLine();
        System.out.println("El factorial es "+Factorial(x));
    }
    public static int Factorial(int iVal){
        System.out.println("Inicio "+iVal);
        if(iVal==0){
            System.out.println("Final "+iVal);
            return 1; //hasta ahi llega el codigo, hasta el return
        }
        else
        return iVal*Factorial(iVal-1);
    }
    
}
