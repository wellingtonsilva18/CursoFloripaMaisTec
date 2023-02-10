package exercicios03;

public class Main {
    public static void main(String[] args) {
        //ex03 funcionario

        Funcionario funcionario1 = new Funcionario("paulo", "adm", 1233);
        Funcionario funcionario2 = new Funcionario("tais", "ads", 2000);

        System.out.println("nome : " + funcionario1.getNome());
        System.out.println("cargo : " + funcionario1.getCargo());
        System.out.println("salario : " + funcionario1.getSalario());

        funcionario1.setNome("wellington");
        funcionario1.setCargo("www");

        System.out.println("------------------------------------------");
        System.out.println("nome : " + funcionario1.getNome());
        System.out.println("cargo : " + funcionario1.getCargo());
        System.out.println("salario : " + funcionario1.getSalario());
    }
}
