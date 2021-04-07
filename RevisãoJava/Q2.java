package revisaojavapwnatan;

/*
Desenvolva um programa que imprima a soma de todos os números de 1 a 1000.
*/

public class RevisaoJavaPWNatan {
    public static void main(String[] args) {
        int somaNumeros = 0;
        for(int i=1; i<=1000; i++){
            somaNumeros += i;
        }
        System.out.println("A Soma dos números entre 1 e 1000 é de " + somaNumeros);
    }
}
