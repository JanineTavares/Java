public class Aluno extends Pessoa {
      float nota1;
      float nota2;
      
      public Aluno() {
        super();
        this.nota1 = 9.1f;
        this.nota2 = 8.4f;
    }
    
    public float calcularMedia() {
        return (nota1 + nota2) / 2;
        
    }
    
    public String toString() {
        return "\n\n##Aluno##"
               +"\nNota 1: " + nota1
               +"\nNota 2: " + nota2
               +"\nMedia: " + calcularMedia();
    }
    
}