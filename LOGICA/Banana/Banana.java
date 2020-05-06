
public class Banana {
    static String estado;
    String tipo;
    static String descascada;
    
    public Banana () {
        this.estado = "Verde";
        this.tipo = "Nanica";
        this.descascada = "Sim";
    }
    
    public static void descascar() {
        if (descascada == "Sim"){
        System.out.println("não é necessario descascar");
        }   
        else {
        System.out.println("A banana está" + estado + "é preciso descascar");
        }
    }
    
    public String toString() {
        return   "\n##Banana##"
                + "\n\nEstado: " + estado
                + "\nTipo: " + tipo
                + "\nDescascada? " + descascada;
                
    } 
}   