public class Maca extends Fruta {
    
    private String cor;
    
    public Maca() {
        this.cor = cor;
       
    }
    
    public String getCor() {
        return this.cor;
    }
        
    public void setCor(String corMaca) {
        this.cor = corMaca;
    }
    
    @Override
    public String comer() {
        return "Doce";
    
    }
    
   
    public String toString() {
        return "\n### Maça ###" 
        + "\nCor: " +this.cor 
        + "\nSabor: " +comer();
    }
}