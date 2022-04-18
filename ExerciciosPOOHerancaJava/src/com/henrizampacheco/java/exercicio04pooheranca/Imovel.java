package com.henrizampacheco.java.exercicio04pooheranca;

/**Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
 * a. crie uma classe Novo, que herda Imovel e possui um adicional no preço.
 * Crie métodos de acesso e impressão deste valor adicional.
 * b. crie uma classe Velho, que herda Imovel e possui um desconto no preço.
 * Crie métodos de acesso e impressão para este desconto.
 */
public class Imovel {
    private String endereço;
    private double preco;

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
