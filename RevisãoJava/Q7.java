package testacarro;

/*
Desenvolva o código de uma classe Java com as seguintes características: 
(1) nome: 'Carro'; 
(2) atributos que indiquem: cor, modelo, velocidade atual, velocidade máxima, ano de fabricação, se o carro está ligado/desligado; 
(3) métodos: ligar carro, desligar carro, aumentar velocidade, diminuir velocidade; 
informa a marcha em que o carro está (se a velocidade é 0: ponto morto, 
se a velocidade está entre 1 e 20: marcha 1, 
velocidade entre 21 e 40: marcha 2, 
velocidade entre 41 e 60: marcha 3, 
velocidade > 61: marcha 4).
*/

public class Carro {
    public String _cor;
    public String _modelo;
    public int _velAtual;
    public int _velMaxima;
    public int _anoFabricacao;
    public boolean _ligado;
    
    public Carro(String cor, String modelo, int velMax, int anoFab){
        _cor = cor;
        _modelo = modelo;
        _velMaxima = velMax;
        _anoFabricacao = anoFab;
        _velAtual = 0;
        _ligado = false;
    }
    
    public void ligarCarro(){
        _ligado = true;
    }
    
    public void desligarCarro(){
        _ligado = false;
    }
    
    public void aumentarVelocidade(int aumento){
        if((_velAtual+aumento) > _velMaxima){
            System.out.println("O carro não aguenta a este aumento de _velAtual!");
        }
        else{
            _velAtual += aumento;
        }
    }
    
    public void diminuirVelocidade(int diminuicao){
        if((_velAtual) <= diminuicao){
            _velAtual = 0;
        }
        else{
            _velAtual -= diminuicao;
        }
    }
    
    public String marchaAtual(){
        if(_velAtual >= 1 && _velAtual <= 20){
            return "Primeira Marcha";
        }
        else if(_velAtual >= 21 && _velAtual <= 40){
            return "Segunda Marcha";
        }
        else if(_velAtual >= 41 && _velAtual <= 60){
            return "Terceira Marcha";
        }
        else if(_velAtual >= 61){
            return "Quarta Marcha";
        }
        else{
            return "Ponto Morto";
        }
    }
}
