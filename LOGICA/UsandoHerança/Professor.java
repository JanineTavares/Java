public class Professor extends Pessoa {
    String numeroRegistro;
    int horasTrabalhadas;
    float valorHora;
    
    public Professor () {
        super();
        this.numeroRegistro = "000000-P/RS";
        this.horasTrabalhadas = 22;
        this.valorHora = 15.0f;
    }
    
    public float calcularSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }
    
    public float  calcularFGTS() {
        return calcularSalarioBruto() * 2;
    }
    
    public String toString() {
        return   "\n\n##Professor##"
               + "\nNumero de Registro: " + numeroRegistro
               + "\nHoras Trabalhadas: " + horasTrabalhadas
               + "\nValor Hora: " + valorHora
               + "\nFGTS R$:" + calcularFGTS();
            }
}