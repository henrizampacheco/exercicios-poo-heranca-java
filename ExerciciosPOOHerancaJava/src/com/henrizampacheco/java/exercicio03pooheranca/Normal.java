package com.henrizampacheco.java.exercicio03pooheranca;

/**Exercício 3 (SLIDE): Crie uma classe chamada Ingresso que possui um valor em
 * reais e um método imprimeValor().
 * a. crie uma classe Normal, que herda de Ingresso e possui um método (nome a
 * sua escolha) que imprime: "Ingresso Normal".
 * b. crie uma classe VIP, que herda de Ingresso e possui um valor adicional.
 * Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
 * OBS:: sobrescreva o método imprimeValor() da classe Ingresso.
 * c. crie uma classe CamaroteInferior (que possui a localização do ingresso e
 * métodos para acessar (get e set) e imprimir esta localização) e uma classe
 * CamaroteSuperior, que é mais cara (possui valor adicional). Esta última
 * possui um método para retornar o valor do ingresso. Ambas as classes herdam
 * a classe VIP.
 */
public class Normal extends Ingresso {
    
    public Normal(double valor) {
        this.setValorReais(valor);
    }
    
    public String imprimirIngressoNormal() {
        return "Este é o Ingresso Normal!";
    }
}
