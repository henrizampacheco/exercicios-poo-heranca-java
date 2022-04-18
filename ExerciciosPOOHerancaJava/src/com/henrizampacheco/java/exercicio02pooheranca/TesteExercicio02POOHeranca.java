package com.henrizampacheco.java.exercicio02pooheranca;

/**Exercício 2: Implemente os diagramas de classe abaixo:
 * a. {Superclasse = Animal; Atributos = -nome: String, -raca: String;
 * Métodos = +Animal(), +Animal(nome: String), +caminha(): String}
 * {Subclasse 1 = Cachorro; Métodos = +late(): String}
 * {Subclasse 2 = Gato; Métodos = +mia(): String}
 * b. {Superclasse = Pessoa; Atributos = -nome: String, -idade: int; Métodos =
 * +Pessoa()}
 * {Subclasse 1 = Rica; Atributos = -dinheiro: double; Métodos = +fazCompras()}
 * {Subclasse 2 = Pobre; Métodos = +trabalha()}
 * {Subclasse 3 = Miseravel; Métodos = +mendiga()}
 */
public class TesteExercicio02POOHeranca {
    public static void main(String[] args) {
        // Testando o diagrama de classe a.
        Cachorro cachorro1 = new Cachorro("Bolinha", "Pinscher");
        Gato gato1 = new Gato("Mingau", "Ragdoll");
        
        System.out.println("**CACHORRO**");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro1.caminha());
        System.out.println(cachorro1.late());
        System.out.println("");
        
        System.out.println("**GATO**");
        System.out.println(gato1.toString());
        System.out.println(gato1.caminha());
        System.out.println(gato1.mia());
        System.out.println("");
        
        // Testando o diagrama de classe b.
        Rica rica1 = new Rica("Rainha Elizabeth II", 95, 438900000000.00);
        Pobre pobre1 = new Pobre("João Silva", 39);
        Miseravel miseravel1 = new Miseravel("Givaldo Alves", 48);
        
        System.out.println("**PESSOA RICA**");
        System.out.println(rica1.toString());
        rica1.fazCompras();
        System.out.println("");
        
        System.out.println("**PESSOA POBRE**");
        System.out.println(pobre1.toString());
        pobre1.trabalha();
        System.out.println("");
        
        System.out.println("**PESSOA RICA**");
        System.out.println(miseravel1.toString());
        miseravel1.mendiga();
        System.out.println("");
    }
}
