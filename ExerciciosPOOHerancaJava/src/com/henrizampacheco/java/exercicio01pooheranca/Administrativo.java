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
public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo() {}
    
    public Administrativo(String nome, double salario, String matricula, String turno, double addNoturno) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setNumMatricula(matricula);
        this.setTurno(turno);
        this.setAdicionalNoturno(addNoturno);
    }
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    
    @Override
    public double ganhoAnual() {
        return (this.getSalario() + this.getAdicionalNoturno()) * 12;
    }    
}
