public class Funcionario extends Pessoa {
    // Atributos
    private int numCracha;
    private double salario;

    // Construtor
    public Funcionario() {}

    public Funcionario(String nome, String cpf, int numCracha, double salario) {
        super(nome, cpf);
        this.numCracha = numCracha;
        this.salario = salario;
    }

    // Getters e Setters
    public int getNumCracha() {
        return numCracha;
    }

    public void setNumCracha(int numCracha) {
        this.numCracha = numCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos
    public void bonificar() {
        double bonus = salario * 0.10;
        salario += bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numero do cracha: " + getNumCracha() +
                "salario: " + getSalario();
    }
}
