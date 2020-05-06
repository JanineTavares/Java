    public class Principal {
    public static void main(String args[]) {
        Televisao televisao = new Televisao();
        
        televisao.verMarca();
        televisao.verCor();
        televisao.verPolegadas();
        televisao.mostrarInfo();
        
        System.out.println("\f");
        
        System.out.println(televisao.mostrarInfo());
    }   
}