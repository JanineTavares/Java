public class ContaPoupanca extends Conta {

    private String titular;
    private long numero;
    private String agencia;
    private double saldo;
    private double taxa;

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titularCorrente) {
        titular = titularCorrente;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numeroCorrente) {
        numero = numeroCorrente;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agenciaCorrente) {
        agencia = agenciaCorrente ;
    }

    public double geSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldoCorrente) {
        saldo = saldoCorrente;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxaCorrente) {
        taxa = taxaCorrente;
    }


    @Override
    public double sacar(double saquePoupanca) {
        return this.saldo - saquePoupanca - this.taxa;
    }

    @Override
    public double depositar(double depositoPoupanca) {
        return depositoPoupanca - this.taxa;
    }

    /*public String gerarExtrato(){
        return "Extrato: "
    }*/

    public String toString () {
        return "\n### Corrente ###"
                 + "\nTitular: " + titular
                + "\nNumero: " + numero
                + "\nAgencia: " + agencia
                + "\nSaldo: " + saldo;

    }

}