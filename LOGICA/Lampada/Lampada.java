public class Lampada {
    int ligada = 1;
    
    
    public void mudarEstado() {
        ligada = 2;
    }
    
    public void mostrarEstado() {
        if (ligada == 1) {
            System.out.println("Lampada está ligada"); }
        else { System.out.println("Lampada está desligada"); }
            
        }
    } 