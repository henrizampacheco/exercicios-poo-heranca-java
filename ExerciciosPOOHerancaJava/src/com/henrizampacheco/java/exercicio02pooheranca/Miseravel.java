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
public class Miseravel extends Pessoa {
    
    public Miseravel() {}
    
    public Miseravel(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }
    
    public void mendiga() {
        System.out.println("A pessoa miserável mendiga!");
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" + "Idade: " + this.getIdade();
    }
}
