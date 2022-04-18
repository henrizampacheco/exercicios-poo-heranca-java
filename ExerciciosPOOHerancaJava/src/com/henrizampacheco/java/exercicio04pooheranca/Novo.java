package com.henrizampacheco.java.exercicio04pooheranca;

/**Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
 * a. crie uma classe Novo, que herda Imovel e possui um adicional no preço.
 * Crie métodos de acesso e impressão deste valor adicional.
 * b. crie uma classe Velho, que herda Imovel e possui um desconto no preço.
 * Crie métodos de acesso e impressão para este desconto.
 */
public class Novo extends Imovel {
    private double adicionalPreco;

    public Novo() {}
    
    public Novo(String endereco, double preco, double adicional) {
        this.setEndereço(endereco);
        this.setPreco(preco);
        this.setAdicionalPreco(adicional);
    }
    
    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    
    public double obterPrecoComAdicional() {
        return this.getPreco() + ((this.getAdicionalPreco()/100) * this.getPreco());
    }

    @Override
    public String toString() {
        return "Endereço: " + this.getEndereço() + "\n"
                + "Preço: R$ " + this.getPreco() + "\n"
                + "Valor adicional: " + this.getAdicionalPreco() + "%" + "\n"
                + "Preço com adicional (final): R$ " + this.obterPrecoComAdicional();
    }
}
