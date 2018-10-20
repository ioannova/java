package extern;

import java.util.Scanner;

/**
 * @author nelson fonseca
 */
public class SchoolAverage {
    public static void main(String[] args){
    System.out.println ("Calcular média 2018/2");
        Scanner in = new Scanner (System.in);
        System.out.print ("Insira a nota da AV1: ");
        double av1 =2* in.nextDouble ();
        System.out.print ("Insira a nota da AV2: ");
        double av2 = 3* in.nextDouble();
        
        System.out.println ("Sua méda final é: "+(av1+av2)/5);
        
    }
}
