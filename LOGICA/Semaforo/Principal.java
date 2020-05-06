public class Principal {
    public static void main(String args[]) {
        Semaforo semaforo = new Semaforo();
        
        System.out.println("\f");
    
        semaforo.sinalizarSiga();
        semaforo.sinalizarAtencao();
        semaforo.sinalizarParada();
        
        semaforo.mostrarSemaforo();
        
        
        System.out.print("\nA cor atual é:" + semaforo.mostrarSemaforo());
        
        
        
  
    }      
}  