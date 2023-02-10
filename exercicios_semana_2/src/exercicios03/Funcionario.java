package exercicios03;

public class Funcionario {
    private String nome;
    private String cargo;
    private int salario;

    public Funcionario(String nome, String cargo, int salario){
        this.nome=nome;
        this.cargo=cargo;
        this.salario=salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}

