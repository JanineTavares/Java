public class Radio {
   String marca;
   boolean ligado;
   boolean desligado;
   int estacoes;
   
   
  
       public Radio(){ // construtor
       this.marca = "Sony";
       this.ligado = true;
       this.desligado = false;
       this.estacoes = 9;
       
    }
   
        public String executarAcaoLigar() {
       if (desligado == false) { 
           return "Já está ligado"; }
       else { 
          return "Sim!"; 
        }
    }    
      public String executarAcaoDesligar() {
       if (desligado == true) { 
           return "Não"; }
       else { 
          return "Sim!"; 
        }
    }    
       
    public void ligar() {
       if (ligado == true || desligado == false) {
           System.out.println("Não é necessário ligar pois está ligado");
        }
        else {}
    }
   
   
   public void desligar() {
       
       if (desligado == true || ligado == true) {
           System.out.println("Ligue");
        }
        else {}
    } 
    
   public String aumentarVolume() {
        return "Não!";
    }
   
   public int mostrarVolumeAtual() {
       return 26;
    }
   
   public String toString() {
       return "##Rádio##"
               + "\nA marca é: " + marca
               
               + "\nQuantas estações? " + estacoes
               + "\nAumentar o Volume? " + aumentarVolume()
               + "\nO volume atual é: " + mostrarVolumeAtual()
               + "\nEstá ligado? " + ligado
               + "\nEstá desligado? " + desligado
               + "\nDeseja ligar o radio? " + executarAcaoLigar()
               + "\nDeseja Desligar o rádio? " + executarAcaoDesligar();
               
               
               
              
               
   }
}
  