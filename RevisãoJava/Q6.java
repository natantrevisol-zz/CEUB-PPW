package revisaojavapwnatan;

import java.util.Scanner;

/*
Desenvolva um programa que, dada uma variável 'x' com algum valor inteiro, 
será exibida uma sequência de números conforme a seguinte regra: 
(1) se 'x' é par, x = x/2; 
(2) se 'x' é ímpar, x = 3*x+1; 
(3) imprime 'x'; 
(4) se 'x' é igual a 1, encerra o programa, caso contrário volte ao passo (1). 
Ex: A saída para o número x = 13 será: 40, 20, 10, 5, 16, 8, 4, 2, 1.
*/

public class RevisaoJavaPWNatan {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        
        System.out.print("Digite um valor inteiro: ");
        x = scan.nextInt();
        
        while(x != 1){
            if((x%2) == 0){
                x = x/2;
            }
            else{
                x = (3*x) + 1;
            }
            
            if(x == 1){
                // Colocar o ponto final quando chegar em 1, conforme exemplo
                System.out.println(x + ".");
            }
            else{
                // Colocar a virgula enquanto não chegar a 1, conforme exemplo
                System.out.print(x + ", ");
            }    
        }
    }
}
