package Funcionarios;

import java.util.Date;

public class Veterinario extends Funcionario {
    private String numero_crmv;
    private int id;
    private double salario;

    public Veterinario(String cpf, String nome, String sexo, Date data_nascimento, Date data_admissao, String funcao, String numero_crmv) {
        super(cpf, nome, sexo, data_nascimento, data_admissao, funcao);
        this.numero_crmv = numero_crmv;
        Funcionario.contador++;
        this.id = Funcionario.contador;
        this.salario = calculo_salario();
    }

    public String getNumero_crmv() {
        return numero_crmv;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setNumero_crmv(String numero_crmv) {
        this.numero_crmv = numero_crmv;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public final double calculo_salario() {
        return 15000;
    }
    
    @Override
    public String toString() {
        return
            "ID do funcionário: " + getId() + "\n" +
            "Função: " + getFuncao() + "\n" +
            "CRMV: " + getNumero_crmv()+ "\n" +
            "Nome: " + getNome() + "\n" +
            "CPF: " + getCpf() + "\n" +
            "Sexo: " + getSexo() + "\n" +
            "Data de nascimento: " + getData_nascimento() + "\n" +
            "Data de admissão: " + getData_admissao() + "\n" +
            "Salário: " + getSalario() + "\n" +
            "Idade: " + getIdade();
    }
    
    @Override
    public String retorna_funcao() {
        return "Veterinário";
    }
}
