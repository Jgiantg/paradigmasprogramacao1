package exe1;

public class Aluno {
    public int nroAluno, idade;
    public float p1, p2;
    public String nome;

    // método construtor

    public Aluno (){
        this.nome = "sem nome";
    }
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
}
