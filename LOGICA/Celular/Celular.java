public class Celular {
 private   String modelo;
 private   String cor;
 private   String marca;
 private   boolean ligado;
 
    public Celular() {
        this.modelo = "Moto X";
        this.cor = "preto";
        this.marca = "Motorola";
        this.ligado = true;
    }    
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo() {
        this.modelo = modelo;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(){
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return this.marca = marca;
    }
    
    public void setMarca() {
        this.marca = marca;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }
    
    public void setLigado() {
        this.ligado = ligado;
    }
    
    public void ligarCelular() {
        
            
    }
    
    public void desligarCelular() {
      
    
    }
    
    public String ligar() {
        if (this.ligado == true) {
            return "Já está ligado"; }
            else {
                return "Ligue";}
            }       
            
    public String desligar() {
        if (this.ligado == true) {
            return "Desligue"; }
            else {
                return "Já está desligado";}
      }       
     
    public String mandarMensagem() {
        return "Olá";
    }
            
    public void receberMensagem() {
        System.out.println("Mensagem recebida: 'Oi' ");
    }
        
   public String verMarca() {
        return this.marca;}
    
    public String verModelo() {
        return this.modelo;
   }
    
    
    public String toString() {
        return  "\nCor: " + this.cor
               +"\nO aparelho está ligado? " + this.ligado
               +"\nDeseja ligar o aparelho? " + ligar()
               +"\nDeseja desligar o aparelho? " + desligar()
               +"\nMensagem enviada: " + mandarMensagem()
                +"\nMarca: " + this.marca
                 +"\nModelo: " + this.modelo;
               
    }
    
     
 
}