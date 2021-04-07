package revisaojavapwnatan;

/*
Desenvolva um programa que imprima todos os números múltiplos de 3 entre 1 e 100.
*/

public class RevisaoJavaPWNatan {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if((i%3) == 0){
               System.out.println("Número múltiplo de 3: " + i); 
            }
        }
    }
}
