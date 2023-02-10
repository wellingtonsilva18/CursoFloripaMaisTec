package exercicios04;
public class Ir {
    private float salario;
    public  Ir(float salario) {
        this.salario = salario;
    }
    public float getSalario() {

        if (this.salario >= 6677.56 && this.salario <= 9922.28)
            this.salario =salario*0.10f;

        else if (this.salario>=9922.29 && this.salario<=13167.00)
            this.salario = salario* 0.15f;

        else if (this.salario>=13167.01 && this.salario<=16380.38)
            this.salario = salario*0.20f;

        else {
            System.out.println("valor incorreto");
        }
        return salario;
    }
    public float setSalario(float salario) {
        this.salario = salario;
        return salario;
    }
}


   /* public int getSalario() {
        if (salario >= 6677.56 && salario <= 9922.28)
            return salario*0.075f;

        else if (salario>=9922.29 && salario<=13167.00)
            return salario * 0.15f;

        else if (salario>=13167.01 && salario<=16380.38)
            return salario * 0.20f;

        else {
            return 0;
        }*/
