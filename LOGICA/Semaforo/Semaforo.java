    public class Semaforo {
    public String cor;
    
    public Semaforo() { //cor inicial vermelho
        cor = "vermelho";
    }
    
    public void sinalizarAtencao() {
        cor = "amarelo";
        System.out.println("\nSinal Amarelo : Atenção");
    }
    
    public void sinalizarParada() {
        cor = "vermelho";
        System.out.println("\nSinal Vermelho : Pare");
    }
    
    public void sinalizarSiga() {
        cor = "verde";
        System.out.println("\nSinal Verde : Siga");
    }

    public String mostrarSemaforo() {
        return cor;
    
    }
} 

