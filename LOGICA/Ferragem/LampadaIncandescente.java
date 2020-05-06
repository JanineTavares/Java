public class LampadaIncandescente implements LampadaInterface {
   
   private String marca;
   private String estado;
   
   public LampadaIncandescente() {
       this.marca = marca;
       this.estado = "ligada";
    }
   
   public String getMarca() {
       return marca;
   }
    
   public void setMarca(String marcaLampada) {
       this.marca = marcaLampada;
   } 
    
   public String getEstado(){
       return estado;
    }
    
   public void setEstado() {
       this.estado= estado;
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