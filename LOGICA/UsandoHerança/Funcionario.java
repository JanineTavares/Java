public class Funcionario extends Pessoa {
    String numeroRegistro;
    float salarioFixo;
    
    public Funcionario() {
        super();
        this.numeroRegistro = "000000-G/RS";
        this.salarioFixo = 1260.40f;
    }
    
    public float calcularFGTS() {
        return (8 * salarioFixo) / 100;
    }
    
    public String toString() {
        return   "\n\n##Funcionario##"
               + "\nNumero de Registro: " + numeroRegistro
               + "\nSalario Fixo R$" + salarioFixo
               + "\nFGTS R$:" + calcularFGTS();
    }
}
