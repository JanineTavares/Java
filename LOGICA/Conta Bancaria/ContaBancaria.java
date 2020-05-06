public class ContaBancaria {
    long numero;
    float saldo;
    
    public ContaBancaria() {
        this.numero = 60345876-9L;
        this.saldo = 895.30f;
    }
    
    
    public void depositar(float deposito) {
        saldo = saldo + deposito;
        System.out.printf("\nDeposito de R$: " + deposito);
    }
    
    public void retirar(float retirada) {
         saldo = saldo - retirada;
         System.out.println("\nRetirada de R$: " + retirada);
    }
    
    public void consultar() {
         saldo = saldo; 
         System.out.println("Saldo: " + saldo);
    }
    
    public void retirarExtrato(float extrato) {
         saldo = saldo; 
    }
    
    public float mostrarValor() {
        return saldo;
    
    } 
    
    public String toString(){
        return "\nSaldo Atual: " + saldo;
                
               
            }
}
    
