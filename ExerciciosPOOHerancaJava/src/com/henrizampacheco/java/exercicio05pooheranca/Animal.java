package com.henrizampacheco.java.exercicio05pooheranca;

/**Exercício 5: Crie uma classe de Teste com o método main. Neste método:
 * a. crie um assistente administrativo e um técnico. Imprima o número de
 * matrícula e o nome de cada um deles.
 * b. crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar.
 * Faça os dois animais caminharem.
 * c. teste (como quiser) as classes Rica, Pobre e Miseravel.
 * d. crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP.
 * Conforme a escolha do usuário, diga se o ingresso é do tipo normal ou VIP.
 * Se for VIP, peça para ele digitar 1 para camarote superior e 2 para camarote
 * inferior. Conforme a escolha do usuário, diga se que o VIP é camarote superior
 * ou inferior. Imprima o valor do ingresso.
 * e. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho.
 * Conforme a definição do usuário, imprima o valor final do imóvel.
 */
public class Animal {
    private String nome;
    private String raca;
    
    public Animal() {}
    
    public Animal(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String caminha() {
        return "Este animal caminha!";
    }
}
