public class MyClass {
  public static void main(String[] args) {
     
    System.out.println("\f");
     
    int hora = 8;
    
    // if
      if (20 > 18) {
      System.out.println("20 is greater than 18"); // obviously
    }  
      
    //if e else
    
    if (hora < 18) {
    System.out.println("Good day.");
    } else {
    System.out.println("Good evening.");
    }
    
    
    // else if
    if (hora < 10) {
    System.out.println("Good morning.");
    }else if (hora < 20) {
    System.out.println("Good day.");
    } else {
    System.out.println("Good evening.");
    }
    
    
    // Operador ternário
    
    String result = (hora < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
    
    
    
    
    
    
  }
  
  
  
  
  
}
