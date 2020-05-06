import java.util.Scanner;
 
    public class Principal {
    
    public static void main (String args []) {
      Scanner scanner = new Scanner(System.in);
      
      
      
      Maca maca = new Maca();
      Morango morango = new Morango();
      Melancia melancia = new Melancia();
      Banana banana= new Banana();
      Ameixa ameixa = new Ameixa();
        
      System.out.println("\f");
        
      System.out.println("\nQual a cor da maçã?");
      maca.setCor(scanner.nextLine());
      System.out.print(maca);
      
      System.out.println("\n\nQual a cor do morango?");
      morango.setCor(scanner.nextLine());
      System.out.print(morango);
      
      System.out.println("\n\nQual a cor da melancia?");
      melancia.setCor(scanner.nextLine());
      System.out.print(melancia);
      
      
      System.out.println("\n\nQual a cor da banana?");
      banana.setCor(scanner.nextLine());
      System.out.print(banana);
      
      System.out.println("\n\nQual a cor da ameixa?");
      ameixa.setCor(scanner.nextLine());
      System.out.print(ameixa);
}
}