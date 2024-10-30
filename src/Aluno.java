public class Aluno extends Pessoa {
    //atributos
    private String RA;
    private String disciplina;

    //construtor
    public Aluno(){}
    public Aluno(String nome, String cpf, String RA, String disciplina) {
        super(nome, cpf);
        this.RA = RA;
        this.disciplina = disciplina;
    }

    //getters and setters
    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //metodos
    @Override
    public String toString() {
        return super.toString() + " Aluno{" +
                "RA='" + RA + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
