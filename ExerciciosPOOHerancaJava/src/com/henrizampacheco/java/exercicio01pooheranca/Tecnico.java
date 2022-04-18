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
public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico() {}
    
    public Tecnico(String nome, double salario, String matricula, double bonus) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setNumMatricula(matricula);
        this.setBonusSalarial(bonus);
    }
    
    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    
    @Override
    public double ganhoAnual() {
        return (this.getSalario() + this.getBonusSalarial()) * 12;
    }    
}
