public class Memoria implements IMemoria {
    
    private String quantidadeDeMemoria;
    private String marca;
    
    public Memoria(String quantidade, String marca) {
        this.quantidadeDeMemoria = quantidade;
        this.marca = marca;
    }    
        
    public String mostrarQuantidadeDeMemoria() {
        return this.quantidadeDeMemoria;
    }
    
    public String mostrarMarca() {
        return this.marca;
    
   
    }
    
    public void mostrarInfo() {
        System.out.println("\rQuantidade de Ram: " +quantidadeDeMemoria+ " \rMarca: " + marca); 
}
}