public class Aluno extends AAluno {
    private String nome;
    private String sobrenome;
    private double nota1;
    private double nota2;
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getNota1() {
        return this.nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return this.nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    /**
     * @return Retorna a média entre as duas notas.
     */
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2 ;  
        
    }
    /**
     * @return Retorna a situação do aluno. Se média abaixo ou igual a 6, reprova, acima, aprova.
     */
    public String definirSituacao() {
        if (calcularMedia() <= 6.0) {
            return "Reprovado"; 
            
        } else {
            return "Aprovado";
        }
    }
    /**
     * @return Retorna conceito do aluno de acorda com média de notas.
     */
    public String definirConceito() {
       if (calcularMedia() >= 9.0 && calcularMedia() <=10.0) { return "Conceito A"; }
           else if (calcularMedia() >= 8.0 && calcularMedia() <=8.9) { return "Conceito B"; }
               else if (calcularMedia() >= 7.0 && calcularMedia() <=7.9) { return "Conceito C"; }
               else if (calcularMedia() >= 0.0 && calcularMedia() <=5.9) { return "Conceito B"; }
               return "Conceito Inválido";
            }
}
    

    
    
    
    

