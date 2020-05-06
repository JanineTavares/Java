public class Principal {
    public static void main(String args[]) {
        Caneta caneta = new Caneta();
        
        caneta.valor = 2.5f;
        caneta.estoque = 100;
        caneta.cor = "Azul";
        
        caneta.calcularEstoque();
        caneta.adicionarEstoque(40);
        
        System.out.println("\n A cor da caneta é: " + caneta.cor);
        System.out.println("\n A quantidade no estoque é: " + caneta.estoque);
       


    }
}
