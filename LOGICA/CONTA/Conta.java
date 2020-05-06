public abstract class Conta {
    private String titular;
    private long numero;
    private int agencia;
    private double saldo;
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titularConta) {
        titular = titularConta;
    }
    
    public long getNumero() {
        return this.numero;
    }
    
    public void setNumero(long numeroConta) {
        numero = numeroConta;
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void setTitular(int agenciaConta) {
        agencia = agenciaConta ;
    }
    
    public double geSaldo() {
        return this.saldo;
    } 
    
    public void setSaldo(double saldoConta) {
        saldo = this.saldo;
    }
    
    public abstract double sacar();
    
    public abstract double depositar();
    
    
}