
/**
 * Write a description of class PesoIdeal here.
 *
 * @author Janine Tavares
 * @version 1.0
 * @since 04/04/2020
 */
public class PesoIdeal extends APesoIdeal{
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String toString() {
        return "\n\n## Suas informações ##"
            + "\nNome: " + this.nome
            + "\nIdade: " + this.idade
            + "\nSexo: " + this.sexo
            + "\nPeso: " + this.peso+ "kg"
            + "\nAltura: " + this.altura + "cm";
        }
       /**
       * @return Retorna o IMC a partir do cálculo da altura ao quadrado e divide o resultado pelo peso.
       */
    public double calcularIMC() {
        return  this.peso / (altura * altura);
    }
}

