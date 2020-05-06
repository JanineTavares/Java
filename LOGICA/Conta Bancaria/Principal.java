public class Principal {
    public static void main(String args[]) {
        ContaBancaria conta = new ContaBancaria();
        
        //conta.mostrarValor();
        //conta.depositar(100.0f);
        //conta.retirar(400.0f);
        //conta.consultar();
        
        System.out.println("\f");
        
        System.out.println(conta);
        conta.depositar(100.0f);
        conta.retirar(400.0f);
        
        System.out.println(conta);
        
        
        
        
        
        
        
    }
}   