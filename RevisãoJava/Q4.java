package revisaojavapwnatan;

/*
Desenvolva um programa que imprima os fatoriais de 1 a 10 (obs: n! = n * (n-1) * (n-2) * ... * 1).
*/

public class RevisaoJavaPWNatan {
    
    public static int fatorial(int num){
       if(num == 0){
           return 1;
       }
       else{
           return num * fatorial(num-1);
       }
    }
    
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i + "! = " + fatorial(i));
        }
    }
}
