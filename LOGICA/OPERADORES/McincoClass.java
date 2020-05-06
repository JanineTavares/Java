public class McincoClass {
  public static void main(String[] args) {
    
    System.out.println("\f");
    
    int dez = 10;
    int cinco = 5;
    
        ///OPERADORES ARITMÉTICOS
    System.out.println("Operadores aritméticos");
    System.out.println("dez + cinco: " + (dez + cinco)); // soma
    System.out.println("dez - cinco: " + (dez - cinco)); // subtração
    System.out.println("dez * cinco: " + (dez * cinco)); // multiplicação
    System.out.println("dez / cinco: " + (dez / cinco)); // divisão
    System.out.println("dez % cinco: " + (dez % cinco)); // resto deza dezivisão
    System.out.println(" '++' Incrementa 1 valor a variavel: " + (++dez)); //dez + 1
    System.out.println(" '--' Diminui 1 valor a variavel: " + (--dez));  // dez - 1
    
    
      ///OPERADORES DE ATRIBUIÇÃO
    System.out.println("\n\nOperadores de atribuição");
    dez += 3;
    System.out.println("+= dez = dez + 3: " + dez);
    dez -= 3;
    System.out.println("-= dez = dez - 3: " + dez);
    dez *= 3;
    System.out.println("*= dez = dez * 3: " + dez);
    dez /= 3;
    System.out.println("/= dez = dez / 3:  " + dez);
    dez %= 3;
    System.out.println("%= dez = dez % 3:  " + dez);
    dez &= 3;
    System.out.println("&= dez = dez & 3:  " + dez);
    dez |= 3;
    System.out.println("|= dez = dez | 3:  " + dez);
    dez ^= 3;
    System.out.println("^= dez = dez ^ 3:  " + dez);
    dez >>= 3;
    System.out.println(">>= dez = dez >> 3:  " + dez);
    dez <<= 3; 
    System.out.println("<<= dez = dez << 3: " + dez);
    
    
     /// OPERADORES DE COMPARAÇÃO
    System.out.println("\n\nOperadores de atribuição");
    System.out.println("dez > 3 && dez < 10' : Retorna 'true' se ambos forem 'true': " + (dez > 3 && dez < 10)); 
    System.out.println("dez > 3 || dez < 4: retorna 'true' se um for 'true': " + (dez > 3 || dez < 4)); 
    System.out.println("!(dez > 3 && dez < 10): retorna 'false' se resulta 'true': " + !(dez > 3 && dez < 10)); 
    
  }
}