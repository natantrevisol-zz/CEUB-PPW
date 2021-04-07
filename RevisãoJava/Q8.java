package testacarro;

/*
Desenvolva o código de uma classe Java cujo nome seja TestaCarro que teste todos os métodos da classe desenvolvida no exercício anterior.
*/

public class TestaCarro {
   
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Branco", "VW Up", 160, 2019);
        
        System.out.println("===================================");
        System.out.println("Antes da Execução dos métodos!");
        System.out.println("Ligado? " + meuCarro._ligado);
        System.out.println("Velocidade Atual: " + meuCarro._velAtual);
        System.out.println("Marcha Atual: " + meuCarro.marchaAtual());
        System.out.println("===================================\n");
        
        meuCarro.ligarCarro();
        
        System.out.println("===================================");
        System.out.println("Primeira Execução dos métodos!");
        System.out.println("Ligado? " + meuCarro._ligado);
        System.out.println("Velocidade Atual: " + meuCarro._velAtual);
        System.out.println("Marcha Atual: " + meuCarro.marchaAtual());
        System.out.println("===================================\n");
        
        meuCarro.aumentarVelocidade(30);
        
        System.out.println("===================================");        
        System.out.println("Segunda da Execução dos métodos!");
        System.out.println("Ligado? " + meuCarro._ligado);
        System.out.println("Velocidade Atual: " + meuCarro._velAtual);
        System.out.println("Marcha Atual: " + meuCarro.marchaAtual());
        System.out.println("===================================\n");
        
        meuCarro.diminuirVelocidade(10);
        
        System.out.println("===================================");        
        System.out.println("Terceira da Execução dos métodos!");
        System.out.println("Ligado? " + meuCarro._ligado);
        System.out.println("Velocidade Atual: " + meuCarro._velAtual);
        System.out.println("Marcha Atual: " + meuCarro.marchaAtual());
        System.out.println("===================================\n");
        
        meuCarro.desligarCarro();
        
        System.out.println("Ligado? " + meuCarro._ligado);
    }
}
