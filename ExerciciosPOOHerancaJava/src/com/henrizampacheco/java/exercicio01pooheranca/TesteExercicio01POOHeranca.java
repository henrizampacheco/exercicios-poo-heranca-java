package com.henrizampacheco.java.exercicio01pooheranca;

/**Exercício 1: Implemente a classe Funcionario com nome, salario e os métodos
 * addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do
 * funcionário.
 * a. crie a classe Assistente, que também é um funcionário, e que possui um
 * número de matrícula (faça os métodos GET e SET). Sobrescreva o método
 * exibeDados().
 * b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
 * Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
 * noturno, crie as classes Tecnico e Administrativo e sobrescreva o método
 * ganhoAnual() de ambas as classes (Administrativo e Tecnico).
 */
public class TesteExercicio01POOHeranca {
    public static void main(String[] args) {
        Tecnico assistenteTec1 = new Tecnico("Aurélio", 1699.95, "AT-001", 131.01);
        Administrativo assistenteAdm1 = new Administrativo("Adriana", 1899.95, "AA-001", "Noite", 569.99);
        
        System.out.println("**ASSISTENTE TÉCNICO**");
        assistenteTec1.exibirDados();
        System.out.println("Bônus salarial: R$ " + assistenteTec1.getBonusSalarial());
        System.out.println("Ganho anual: R$ " + assistenteTec1.ganhoAnual());
        System.out.println("");
        
        System.out.println("**ASSISTENTE ADMINISTRATIVO**");
        assistenteAdm1.exibirDados();
        System.out.println("Turno: " + assistenteAdm1.getTurno());
        System.out.println("Adicional noturno: R$ " + assistenteAdm1.getAdicionalNoturno());
        System.out.println("Ganho anual: R$ " + assistenteAdm1.ganhoAnual());
        System.out.println("");
    }
}
