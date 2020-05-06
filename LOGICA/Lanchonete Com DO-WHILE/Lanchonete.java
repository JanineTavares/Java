/**
 * Write a description of class Lanchonete here.
 *
 * @author Janine Tavares
 * @version 1.0
 * @since 03/04/2020
 */
public class Lanchonete {
   private double valor;
   private String descricao;
   private int codigo;
   private int quantidade;
   
   public double getValor() {
       return this.valor;
    }
    
   public void setValor(double valor) {
       this.valor = valor;
    }
   
   public String getDescricao() {
       return this.descricao;
    }
    
   public void setDescricao(String descricao) {
       this.descricao = descricao;
    }
    
   public int getCodigo() {
       return this.codigo;
    }
    
   public void setCodigo(int codigo) {
       this.codigo = codigo;
    }
    
   public int getQuantidade() {
       return this.quantidade;
    }
    
   public void setQuantidade(int quantidade) {
       this.quantidade = quantidade;
    }
    /**
     * @param Recebe o codigo que o usuario escolher
     */
   public double definirValor(int codigo) {
       switch (codigo) {
           case 1 : return 3.65;
           case 2 : return 2.50;
           case 3 : return 3.30;
           case 4 : return 4.70;
           case 5 : System.exit(0);
           default : return 0;
        }
    }
        /**
         * @param Recebe numero inteiro equivalente a opção escolhida pelo usuario e retorna descrição do produto
         */
   public String definirDescricao(int opcao) {
       switch (opcao) {
           case 1 : return "Sanduiche de Presunto";
           case 2 : return "Suco de Tamarindo";
           case 3 : return "Pastel com Ovo";
           case 4 : return "Farroupilha";
           case 5 : System.exit(0);
           default : return "Opção inválida";
        }
    }
    /**
     * @return Retorna valor total do produto se a quantidade for maior que 1
     */
   public  double calcularTotal() {
        if (this.quantidade > 1 )  { 
          return getQuantidade() * definirValor(codigo); 
        }
        else {
        return definirValor(codigo);
    }
    }
    

}



        


