package calculadorajava;

import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        int opr;
        float num1, num2, res;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("- PPW | UNICEUB | ANÁLISE E DESENVOLVIMENTO DE SISTEMAS -\n");
        
        System.out.println("- CALCULADORA EM JAVA -");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.print("> ");
        
        opr = scan.nextInt();
        
        switch(opr){
            case 0:
                break;
            case 1:
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextFloat();
      
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextFloat();
                
                res = num1 + num2;
                System.out.println("\nA soma de " + num1 + " + " + num2 + " é igual a " + res);
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextFloat();
      
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextFloat();
                
                res = num1 - num2;
                System.out.println("\nA subtração de " + num1 + " - " + num2 + " é igual a " + res);
                break;
             case 3:
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextFloat();
      
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextFloat();
                
                res = num1 * num2;
                System.out.println("\nA multiplicação de " + num1 + " x " + num2 + " é igual a " + res);
                break;       
            case 4:
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextFloat();
      
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextFloat();
                
                res = num1 / num2;
                System.out.println("\nA divisão de " + num1 + " / " + num2 + " é igual a " + res);
                break;
            default:
                System.out.println("\nOperação inválida, tente novamente!");
                break;        
        }    
        System.out.println("\nObrigado por usar a calculadora em JAVA!");
    }  
}
