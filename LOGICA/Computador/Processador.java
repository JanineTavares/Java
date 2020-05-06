public class Processador implements IProcessador {
    private String velocidade;
    private String marca;
    private String modelo;
    private String geracao;
    
    public Processador (String velocidade, String marca, String modelo, String geracao) {
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
        this.geracao = geracao;
    }
    
    public String mostrarVelocidade(){
        return velocidade;
    }
        
    public String mostrarMarca(){
        return marca;
    }
    
    public String mostrarModelo(){
        return modelo;
    }
    
    public String mostrarGeracao(){
        return geracao;
    }

    public void mostrarInfo() {
        System.out.println("\rVelocidade: " + velocidade + " \rMarca: " +marca+ " \rModelo: " +modelo+ " \rGeração: " +geracao);
    }
}