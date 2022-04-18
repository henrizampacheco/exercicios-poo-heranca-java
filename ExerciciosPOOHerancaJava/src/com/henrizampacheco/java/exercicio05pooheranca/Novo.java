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
public class Novo extends Imovel {
    private double adicionalPreco;

    public Novo() {}
    
    public Novo(String endereco, double preco, double adicional) {
        this.setEndereço(endereco);
        this.setPreco(preco);
        this.setAdicionalPreco(adicional);
    }

    public Novo(double preco, double adicional) {
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

    public void imprimirAdicional() {
        System.out.println("Preço do imóvel: " + this.getPreco());
        System.out.println("Adicional de: " + this.getAdicionalPreco() + "%");
        System.out.println("Preço com adicional (final): R$ " + this.obterPrecoComAdicional());
    }    
    
    @Override
    public String toString() {
        return "Endereço: " + this.getEndereço() + "\n"
                + "Preço: R$ " + this.getPreco() + "\n"
                + "Valor adicional: " + this.getAdicionalPreco() + "%" + "\n"
                + "Preço com adicional (final): R$ " + this.obterPrecoComAdicional();
    }
}
