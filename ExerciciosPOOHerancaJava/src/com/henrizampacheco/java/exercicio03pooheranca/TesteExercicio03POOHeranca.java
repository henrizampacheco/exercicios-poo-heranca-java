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
public class TesteExercicio03POOHeranca {
    public static void main(String[] args) {
        Normal ingressoNormal = new Normal(19.99);
        Vip ingressoVip = new Vip(19.99, 14.99);
        CamaroteInferior ingressoCamaroteInf = new CamaroteInferior(44.99, "Inferior");
        CamaroteSuperior ingressoCamaroteSup = new CamaroteSuperior(44.99, 29.99);
        
        System.out.println("**INGRESSO NORMAL**");
        System.out.println(ingressoNormal.imprimirValor());
        System.out.println(ingressoNormal.imprimirIngressoNormal());
        System.out.println("");
        
        System.out.println("**INGRESSO VIP**");
        System.out.println("Valor puro (sem adicional): R$ " + ingressoVip.getValorReais());
        System.out.println("Valor adicional puro: R$ " + ingressoVip.getValorAdicional());
        System.out.println(ingressoVip.imprimirValor());
        System.out.println("");
        
        System.out.println("**CAMAROTE INFERIOR**");
        System.out.println(ingressoCamaroteInf.imprimirValor());
        System.out.println(ingressoCamaroteInf.imprimirLocalizacao());
        System.out.println("");
        
        System.out.println("**CAMAROTE SUPERIOR**");
        System.out.println("Valor puro (sem adicional): R$ " + ingressoCamaroteSup.getValorReais());
        System.out.println("Valor adicional puro: R$ " + ingressoCamaroteSup.getValorAdicional());
        System.out.println(ingressoCamaroteSup.imprimirValor());
        System.out.println("");
    }
}
