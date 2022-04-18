package com.henrizampacheco.java.exercicio04pooheranca;

/**Exercício 4: Crie a classe Imovel, que possui um endereço e um preço.
 * a. crie uma classe Novo, que herda Imovel e possui um adicional no preço.
 * Crie métodos de acesso e impressão deste valor adicional.
 * b. crie uma classe Velho, que herda Imovel e possui um desconto no preço.
 * Crie métodos de acesso e impressão para este desconto.
 */
public class Velho extends Imovel {
    private double descontoPreco;

    public Velho() {}
    
    public Velho(String endereco, double preco, double desconto) {
        this.setEndereço(endereco);
        this.setPreco(preco);
        this.setDescontoPreco(desconto);
    }
    
    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }
    
    public double obterPrecoComDesconto() {
        return this.getPreco() - ((this.getDescontoPreco()/100) * this.getPreco());
    }
    
    public void imprimirDesconto() {
        System.out.println("Preço do imóvel: " + this.getPreco());
        System.out.println("Desconto de: " + this.getDescontoPreco() + "%");
        System.out.println("Preço com desconto (final): R$ " + this.obterPrecoComDesconto());
    }
    
    @Override
    public String toString() {
        return "Endereço: " + this.getEndereço();
    }
}
