public class MyClass {
  public static void main(String[] args) {
      
    System.out.println("\f");  
    
    String txt = "Hello World";
    String aspasSimples = "Hello \" World \" "; // adiciona " " ao texto
    String apostrofe = "Hello \' World "; // adiciona ' 
    String contraBarra = "Hello \\ World "; // adiciona  contrabarra
    String novaLinha = "Hello\nWorld!"; //adiciona nova linha
    String retornaAbaixo = "Hello\rWorld!"; // retorna abaixo
    String adicionaTab = "Hello\tWorld!";  //adiciona tab
    
    
    
    System.out.println("\nTexto em maiuscula: " + txt.toUpperCase());   // Outputs "HELLO WORLD"
    
    System.out.println("\nTexto em minuscula: " + txt.toLowerCase());   // Outputs "hello world"
    
    System.out.println("\nComprimento da  String: "  + txt.length());
    
    System.out.println("\nAdiciona aspas simples: " + aspasSimples); 
    
    System.out.println("\nAdiciona Apostrofe: " + apostrofe); 
    
    System.out.println("\nAdiciona contabarra: " + contraBarra); 
    
    System.out.println("\nRetorna Abaixo: " + retornaAbaixo); 
    
    System.out.println("\nAdiciona Tab: " + adicionaTab); 
    
    
   
    
    
   
    
    
  }
}
