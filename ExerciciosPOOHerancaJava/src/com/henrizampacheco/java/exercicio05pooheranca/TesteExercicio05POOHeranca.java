package com.henrizampacheco.java.exercicio05pooheranca;

import java.util.Scanner;

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
public class TesteExercicio05POOHeranca {
    public static void main(String[] args) {
        // Testando o item a.
        Tecnico assistenteTec = new Tecnico("Roger", "AT-002");
        Administrativo assistenteAdm = new Administrativo("Michelle", "AA-002");
        
        System.out.println("**ASSISTENTES ADMINISTRATIVO E TÉCNICO**");
        assistenteTec.exibirDados();
        System.out.println("******");
        assistenteAdm.exibirDados();
        System.out.println("");
        
        // Testando o item b.
        Gato filhoteGato = new Gato("Gato Filhote");
        Cachorro filhoteCao = new Cachorro("Cão Filhote");
        
        System.out.println("**ANIMAIS**");
        System.out.println("Nome: " + filhoteCao.getNome());
        System.out.println(filhoteCao.late());
        System.out.println(filhoteCao.caminha());
        System.out.println("******");
        System.out.println("Nome: " + filhoteGato.getNome());
        System.out.println(filhoteGato.mia());
        System.out.println(filhoteGato.caminha());
        System.out.println("");
        
        // Testando o item c.
        Rica pessoaRica = new Rica("Pessoa Rica");
        Pobre pessoaPobre = new Pobre("Pessoa Pobre");
        Miseravel pessoaMiseravel = new Miseravel("Pessoa Miserável");
        
        System.out.println("**CLASSES RICA, POBRE E MISERÁVEL**");
        System.out.println("Nome: " + pessoaRica.getNome());
        pessoaRica.fazCompras();
        System.out.println("******");
        System.out.println("Nome: " + pessoaPobre.getNome());
        pessoaPobre.trabalha();
        System.out.println("******");
        System.out.println("Nome: " + pessoaMiseravel.getNome());
        pessoaMiseravel.mendiga();
        System.out.println("");
        
        // Testando o item d.
        Scanner scan = new Scanner(System.in);
        int escolha;
        
        System.out.println("**INGRESSO NORMAL OU VIP**");
        System.out.println("Escolha o Ingresso!");
        System.out.println("1 - Normal");
        System.out.println("2 - VIP");
        System.out.print("Digite aqui: ");
        escolha = scan.nextInt();
        
        if(escolha == 1) {
            Normal ingresso = new Normal(19.99);
            System.out.println(ingresso.imprimirIngressoNormal());
            System.out.println(ingresso.imprimirValor());
        } else if(escolha == 2) {
            System.out.println("Escolha o Camarote!");
            System.out.println("1 - Camarote Superior");
            System.out.println("2 - Camarote Inferior");
            System.out.print("Digite aqui: ");
            escolha = scan.nextInt();
            
            if(escolha == 1) {
                CamaroteSuperior ingresso = new CamaroteSuperior(44.99, 29.99);
                System.out.println("É Camarote Superior!");
                System.out.println(ingresso.imprimirValor());
            } else if(escolha == 2) {
                CamaroteInferior ingresso = new CamaroteInferior(44.99);
                System.out.println("É Camarote Inferior!");
                System.out.println(ingresso.imprimirValor());
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
        System.out.println("");
        
        // Testando o item e.
        Scanner sc = new Scanner(System.in);
        int esc;
        
        System.out.println("**IMÓVEL NOVO OU VELHO**");
        System.out.println("Escolha o Imóvel!");
        System.out.println("1 - Novo");
        System.out.println("2 - Velho");
        System.out.print("Digite aqui: ");
        esc = sc.nextInt();
        
        if(esc == 1) {
            Novo imovel = new Novo(250000.00, 30);
            imovel.imprimirAdicional();
        } else if(esc == 2) {
            Velho imovel = new Velho(125000.00, 15);
            imovel.imprimirDesconto();
        } else {
            System.out.println("Opção inválida!");
        }
        System.out.println("");
    }
}
