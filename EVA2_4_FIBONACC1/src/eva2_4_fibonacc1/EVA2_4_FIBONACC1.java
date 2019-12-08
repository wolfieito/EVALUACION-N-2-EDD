/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_fibonacc1;
import java.util.Scanner;
/**
 *
 * @author martin
 */
public class EVA2_4_FIBONACC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // TODO code application logic here
        System.out.println("¿Hasta que posicion quiere generar?");
        int x=s.nextInt();
        s.nextLine();
        System.out.println("El fibonacci de "+x+" es "+fibonacci(x));
    }
    public static int fibonacci(int iPosi){
        if(iPosi == 0){
            return 0;
        }else if(iPosi == 1){
            return 1;
        }else {
            return fibonacci(iPosi-1)+fibonacci(iPosi-2);
        }
    }
    
}
