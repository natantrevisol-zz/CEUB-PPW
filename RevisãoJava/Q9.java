package animal;

/*
Implemente uma superclasse de nome 'Animal' com o atributo 'espécie' e o método 'exibir tipo de som'; 
implemente as classes 'Humano', 'Cachorro', 'Pato' e 'Gato' de forma que sejam subclasses de 'Animal'; 
Implemente o método que informa o tipo de som de cada uma dessas subclasses. Cada tipo de animal deve ter seu próprio tipo de som.
*/

public class Animal {
    
    protected String _especie;
    
    public void exibirTipoSom(){}

    public static void main(String[] args) {
        
        Humano hm = new Humano();
        Cachorro ch = new Cachorro();
        Pato pt = new Pato();
        Gato gt = new Gato();
        
        hm.exibirTipoSom(); // Output: Olá!
        ch.exibirTipoSom(); // Output: Au Au!
        pt.exibirTipoSom(); // Output: Quack!
        gt.exibirTipoSom(); // Output: Miau!
    }
}

public class Humano extends Animal{
    
    @Override
    public void exibirTipoSom(){
        System.out.println("Olá!");
    }
}

public class Cachorro extends Animal {
    @Override
    public void exibirTipoSom(){
        System.out.println("Au Au!");
    }
}

public class Pato extends Animal {
    
    @Override
    public void exibirTipoSom(){
        System.out.println("Quack!");
    }  
}

public class Gato extends Animal {
    
    @Override
    public void exibirTipoSom(){
        System.out.println("Miau!");
    }
}
