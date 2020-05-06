public class PlacaMae implements IPlacaMae {
    
 private String tipoPlacaMae; 
 private String fabricante; 
 private int quantidadeControladorasSata;
 private int quantidadeUSB;
 
 public PlacaMae(String tipo, String fabricante, int sata, int usb) {
     this.tipoPlacaMae = tipo;
     this.fabricante = fabricante;
     this.quantidadeControladorasSata = sata;
     this.quantidadeUSB = usb;
    }
    
 public String mostrarTipoPlacaMae() {
     return this.tipoPlacaMae;
    }
    
 public String mostrarFabricante(){
     return this.fabricante;
    }
    
 public int mostrarQuantidadeControladorasSata() {
     return this.quantidadeControladorasSata;
    }
    
 public void ativarRaid(String raidAtivo){
     System.out.println("Status Raid: " +raidAtivo);
    }
    
 public void desativarRaid(String raidDesativado) {
     System.out.println("Status Raid: " +raidDesativado);
    }
    
 public int mostrarQuantidadeUSBs(){
     return this.quantidadeUSB; 
    }
  
 public void mostrarInfo() {
 System.out.println("\rTipo: " + tipoPlacaMae+ "\rFabricante: " +fabricante+ 
 "\rControladoras Sata: " +quantidadeControladorasSata+ "\rEntradas USB: " +quantidadeUSB);
 }
}