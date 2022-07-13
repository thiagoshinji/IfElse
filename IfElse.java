package ifelse;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual tua idade?");
        
        int idade = scan.nextInt();
        
        if (idade >= 18) {
            
            System.out.println("Ja pode ser preso em");
            
        } else {
            
            System.out.println("Aproveita que jaja vai ter que pagar conta");
            
        }
        
        //barato <= 10
        //10 < valor < 15 - da pra pedir desconto
        //15 <= valor 17 - da pra dar mais uma procurada
        //>= 17 - sai fora, ta caro
        
        System.out.println("Quanto custa este item?");
        double valor = scan.nextDouble();
        
        if (valor <= 10){
            System.out.println("Ta barato, pode comprar");
            
        } else if (valor >10 && valor <15){
            System.out.println("Pede um desconto");
            
        } else if (valor >= 15 && valor < 17){
            System.out.println("Da pra achar melhor");
            
        } else {
            System.out.println("Sai fora ta caro");
            
        }
        
    }
    
}
