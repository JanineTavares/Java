public class Principal {
    public static void main(String args[]) {
        LampadaIncandescente lampadaIn = new LampadaIncandescente();
        LampadaLed lampadaLed = new LampadaLed();
        
        System.out.println("\f");
        
        lampadaIn.setMarca("Alop");
        lampadaIn.setEstado();
        
        lampadaLed.setMarca();
        lampadaLed.setEstado();
        
        
        System.out.println(lampadaIn);
        System.out.println(lampadaLed);
    }
    
    
}