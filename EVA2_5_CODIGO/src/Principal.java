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
        Scanner s=new Scanner(System.in);
        System.out.println("Deme el numero");
        int n = s.nextInt();
        if(esPrimoIneficiente(n))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
    public static boolean esPrimoIneficiente(int iVal){
        boolean bResu = true;
        for (int i = 2; i < iVal-1; i++) {
          if((iVal%i)==0){
              bResu=false;
              break;
          }
        }
        return bResu;
    }
}
