   public class Televisao {
    String marca;
    String cor;
    int polegadas;
    
   public Televisao() {
       marca = "Sony";
       cor = "preta";
       polegadas = 40;
    }
    
   public void verMarca() {
       marca = "Samsung";
       System.out.println("\nA marca da TV é: " + marca);
        
    }
   public void verCor() {
       System.out.println("\nA cor da TV é: " + cor);
        
    }
   public void verPolegadas() {
       System.out.println("\npolegadas: " + polegadas);
        
    }
   public String mostrarInfo() {
        return  ("\nmarca: " + marca
                +"\ncor: " + cor
                +"\npolegadas: " + polegadas);
               
               
    }
}