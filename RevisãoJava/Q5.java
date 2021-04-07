package revisaojavapwnatan;

/*
Desenvolva um programa que imprima a série de Fibonacci até chegar a 100.
*/

public class RevisaoJavaPWNatan {
    
    public static int seqFibonacci(int num){
        if(num < 2){
            return num;
        }
        else{
            return seqFibonacci(num - 1) + seqFibonacci(num - 2);
        }   
    }
    
    public static void main(String[] args) {
        // Professor, entendi pela questão que é para
        // imprimir a sequência até chegar no nº 100.
        // Fiquei em dúvida se era até o nº 100 ou até
        // o 100º Termo...
        for(int i=0; i<100; i++){
            if(seqFibonacci(i) <= 100){
                System.out.print(seqFibonacci(i) + " ");
            }
            else{
                break;
            }
        }
    }
}
