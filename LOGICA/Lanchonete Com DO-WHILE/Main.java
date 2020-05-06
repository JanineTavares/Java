import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
            Lanchonete lanchonete = new Lanchonete();
        
           
            System.out.println("\f");
      
    
        
            System.out.println("\n\n            ## Nossos Lanches  ##"
         + "\nCódigo    Produto                 Valor Unitário"
               + "\n 1        Sanduíche de Presunto     R$ 3,65"
               + "\n 2        Suco de Tamarindo         R$ 2,50 "
               + "\n 3        Pastel com ovo            R$ 3,30"
               + "\n 4        Farroupilha               R$ 4,70"
               + "\n 5        Sair" );   
              
               int opcao = 0;
          do{
              
               System.out.println("\n\nDigite o codigo do lanche");
               lanchonete.setCodigo(scan.nextInt());
               
               lanchonete.definirValor(lanchonete.getCodigo());
        
               System.out.println("\n\nDigite a quantidade do lanche");
               lanchonete.setQuantidade(scan.nextInt());
    
               System.out.println("\n\nO lanche escolhido foi: " + lanchonete.definirDescricao(lanchonete.getCodigo()));
    
               //System.out.println("o valor é: "+ lanchonete.definirValor(lanchonete.getCodigo()));
               lanchonete.definirValor(lanchonete.getCodigo());
    
               System.out.println("\nTotal: " +df.format(lanchonete.calcularTotal())); 
               
             
            }
            while (opcao != 5); 
          
               
              
     
    
   }
}

   
 
