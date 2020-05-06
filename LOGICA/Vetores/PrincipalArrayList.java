import java.util.ArrayList;
public class PrincipalArrayList {
  public static void main(String[] args) {
    ArrayList<String> carros = new ArrayList<String>();
    
    carros.add("Volvo");
    carros.add("BMW");
    carros.add("Ford");
    carros.add("Mazda");
    
    System.out.println("\nPRINT ITENS");
    System.out.println(carros);
    
    //ForEach lambda
    System.out.println("\nPRINT ITENS COM LAMBDA");
    carros.forEach(carro ->System.out.println(carros));
    
    //ACESSANdo UM ITEM
    System.out.println("\nACESSAR UM ITEM");
    carros.get(0);
    System.out.println(carros.get(0));
    
    //MODIFICANDO UM ITEM
    System.out.println("\nMODIFICAR UM ITEM");
    carros.set(0, "Opel");
    System.out.println(carros.set(0, "Opel"));
    
    //REMOVER ITEM
    System.out.println("\nREMOVER UM ITEM");
    carros.remove(0);
    System.out.println(carros);
    
    //VER QUANTIDADE DE ELEMENTOS
    System.out.println("\nVER QUANTIDADE");
    carros.size();
    System.out.println(carros.size());
    
    //LOOP DENTRO DA LISTA
    System.out.println("\nLOOP COM FOR");
    for (int i = 0; i < carros.size(); i++) {
      System.out.println(carros.get(i));
  }
  
  //LOOP COM FOR EACH
  System.out.println("\nLOOP COM FOR EACH");
  for (String i : carros) {
      System.out.println(i);
    }
  
  
}
}