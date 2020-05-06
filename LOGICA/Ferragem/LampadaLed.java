public class LampadaLed implements LampadaInterface {
   
   private String marca;
   private String estado;
   
   
   public LampadaLed() {
       this.marca = "Estac";
       this.estado = "desligada";
    }
   public String getMarca() {
       return marca;
   }
    
   public void setMarca() {
       this.marca = marca;
   } 
    
   public String getEstado(){
       return estado;
    }
    
   public void setEstado() {
       this.estado = estado;
   }
   
   public void On() {
       this.estado = estado;
    }   
    
   public void Off() {
       this.estado = estado;
    }   
    
   public String toString() {
       return "\nMarca: " + this.marca
               +"\nEstado: " + this.estado;
   } 
}