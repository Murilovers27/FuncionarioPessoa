public class Pessoa {
    //atributos
    private String nome;
    private String cpf;

    //construtor
    public Pessoa(){}
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //metodos
    @Override
    public String toString() {
        return "nome: " + getNome() +
                "cpf: " + getCpf();
    }
}
