import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        /// Instanciar o aluno
        Aluno obj1 = new Aluno(); // Chama o construtor sem parâmetro
        System.out.println("Média do aluno" + obj1.nome + " é " + obj1.notaFinal());
        Aluno obj2 = new Aluno(123, "João", 21, 9.9f, 9.5f);
        System.out.println("Média do aluno" + obj2.nome + " é " + obj2.notaFinal());

    }
}
