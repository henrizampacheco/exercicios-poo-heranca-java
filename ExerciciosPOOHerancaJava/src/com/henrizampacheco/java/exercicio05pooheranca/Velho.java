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
public class Velho extends Imovel {
    private double descontoPreco;

    public Velho() {}
    
    public Velho(String endereco, double preco, double desconto) {
        this.setEndereço(endereco);
        this.setPreco(preco);
        this.setDescontoPreco(desconto);
    }
    
    public Velho(double preco, double desconto) {
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
