public class Computador implements IComputador {
   private String marca;
   private String modelo;
   private String tipo;
   private boolean status;
   private Memoria memoria;
   private PlacaMae placa;
   private Processador processador;
   
   public Computador(String marcaPC, String modeloPC, String tipoPC, boolean status, Memoria memoria, PlacaMae placa, Processador processador) {
       this.marca = marcaPC;
       this.modelo = modeloPC;
       this.tipo = tipoPC;
       this.status = true;
       this.memoria = memoria;
       this.placa = placa;
       this.processador = processador;
   }   
   
   public String getMarca() {
       return marca;
    }
    
   public void setMarca() {
       marca = marca;
   }
   
    public String getModelo() {
       return modelo;
   }
    
   public void setModelo() {
       modelo = modelo;
   }
   
    public String getTipo() {
       return tipo;
   }
    
   public void setTipo() {
       tipo = tipo;
    }
    
   public boolean getStatus() {
       return status;
   }
    
   public void setStatus() {
       status = status;
   }
   
   public void on(){
       if (status == true) {
      System.out.println("O Computador está ligado"); }
       else {System.out.println("Ligue o computador"); }
    } 

    
  
    public void off(){
        if(status == true) 
     { System.out.println("O computador está sendo utilizado. Não desligue"); }
       else 
       { System.out.println("O computador já está desligado"); }
   }

    
    public void restart(){
        if(status == true) 
     { System.out.println("Reinicie"); }
       else 
       { System.out.println("Não é possivel reiniciar pois o computador está desligado"); }
   }

    
   public void hibernate(){
        if(status == true) 
     { System.out.println("O Sistema entrará em hibernação"); }
       else 
       { System.out.println("O computador está desligado"); }
    }
    
    public void mostrarInfo() {
        System.out.println("\rO Marca: " +marca+ " \rModelo: " +modelo+ " \rTipo: " +tipo);
        
   }
}