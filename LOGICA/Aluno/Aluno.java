public class Aluno {
    
    
    String nome;
    float notaUm;
    float notaDois;
    
    public Aluno() {
        this.notaUm = 8.2f;
        this.notaDois = 7.3f;
    }
    
    public String mostrarNomeAluno() {
        return nome;
    }
    
    public float mostrarNotaUm() {
        return notaUm;
    }
    
    public float mostrarNotaDois() {
        return notaDois;
    }
    
    public float calcularMedia() {
        return (notaUm + notaDois) / 2;
    }
}
