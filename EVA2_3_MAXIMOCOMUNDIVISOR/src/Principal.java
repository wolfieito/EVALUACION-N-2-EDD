/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = s.nextInt();
        s.nextLine();
        System.out.println("Ingrese el segundo numero");
        int b = s.nextInt();
        s.nextLine();
            System.out.println("El maximo comun divisor es " + mcd(a, b));
    }

    public static int mcd(int dividendo, int divisor) {
         System.out.println(dividendo + " / "+ divisor);
        /*int a = 0;
        a = (int) dividendo / divisor;
        int iVal3 = (((dividendo)) - (divisor * a));
        */
        if (divisor == 0) {
            return dividendo;
        } else {
            int iResi = dividendo % divisor;//esto da el residuo en entero
            return mcd(divisor, iResi);
        }
    }
}
