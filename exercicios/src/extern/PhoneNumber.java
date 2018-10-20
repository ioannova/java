package extern;

import java.util.Scanner;

/**
 * @author nelson fonseca
 */

public class PhoneNumber {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insita seu DDD: ");
        int ddd = in.nextInt();
        System.out.println("Insita seu telefone: ");
        int tel = in.nextInt ();
        System.out.println ("Seu telefone é: ("+ddd + ")"+tel);
    }
}

