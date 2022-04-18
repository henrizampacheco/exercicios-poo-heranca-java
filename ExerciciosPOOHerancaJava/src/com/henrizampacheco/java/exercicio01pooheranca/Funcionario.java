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
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void addAumento(double valor) {
        this.setSalario(this.getSalario() + valor);
    }
    
    public double ganhoAnual() {
        return this.getSalario() * 12;
    }
    
    public void exibirDados() {
        System.out.println("Nome do funcionário: " + this.getNome());
        System.out.println("Salário: R$ " + this.getSalario());
    }
}
