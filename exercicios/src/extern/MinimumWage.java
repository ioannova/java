/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extern;

import java.util.Scanner;

/**
 * @author nelson fonseca
 */

public class MinimumWage {

    public static void main (String[]args){
        Scanner joga = new Scanner (System.in);
        float dias, diaria, salario=0, anual;
        int cont;
        while (salario<1500){
        System.out.print("Informe o valor da sua diária: R$ ");
        diaria = joga.nextFloat();
        System.out.print("Informe quantos dias trabalhou: Dias ");
        dias = joga.nextFloat();
        salario= (diaria*dias);
        System.out.println ("Seu salário atual é de: R$"+salario);
        anual=salario*12;
        System.out.println ("Seu salário anual é de R$"+anual);
        if(salario>=1500){
           System.out.println ("\nOBS: Você recebe igual ou acima do piso destinado a estagiários da sua função.");
        }else{
           System.out.println ("Você recebe abaixo piso destinado a estagiários da sua função.\n *Empresa com pagamento abaixo do piso salárial.");
        }
        System.out.println ("\nPiso salárial:\n Mensal R$ 1500,00\n Anual R$ 18.000,00\n__________________________________________________");
    }
    }
}