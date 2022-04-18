package com.henrizampacheco.java.exercicio04pooheranca;

/**Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
 * a. crie uma classe Novo, que herda Imovel e possui um adicional no preço.
 * Crie métodos de acesso e impressão deste valor adicional.
 * b. crie uma classe Velho, que herda Imovel e possui um desconto no preço.
 * Crie métodos de acesso e impressão para este desconto.
 */
public class TesteExercicio04POOHeranca {
    public static void main(String[] args) {
        Novo novoImovel = new Novo("Av. São João, 755", 250000.00, 30);
        Velho velhoImovel = new Velho("Av. Ipiranga, 727", 125000.00, 15);
        
        System.out.println("**IMÓVEL NOVO**");
        System.out.println(novoImovel.toString());
        System.out.println("");
        
        System.out.println("**IMÓVEL VELHO**");
        System.out.println(velhoImovel.toString());
        velhoImovel.imprimirDesconto();
        System.out.println("");
    }
}
