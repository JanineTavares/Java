public class Principal {
    public static void main(String args[]) {
        PlacaMae  placa = new PlacaMae ("ATX", "GygaByte", 4, 8);
        Memoria memoria = new Memoria("8GB", "HyperX");
        Processador processador = new Processador ("3.30GHz", "Intel", "i3 2120", "3° Geração");
        Computador computador = new Computador("Dell", "Inspiron", "Desktop",true, memoria, placa, processador );
        System.out.println("\f");
        
        
        
       System.out.println("\n\n###Memória###");
       memoria.mostrarInfo();
       
       System.out.println("\n\n###Placa Mãe###");
       placa.mostrarInfo();
       placa.ativarRaid("Ative");
       placa.desativarRaid("Desative");
       
       
       System.out.println("\n\n###Processador###");
       processador.mostrarInfo();
       
       System.out.println("\n\n###Computador###");
       computador.mostrarInfo();
       computador.off();
       computador.on();
       computador.hibernate();
       computador.restart();
       
    }
}       