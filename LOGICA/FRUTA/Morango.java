public class Morango extends Fruta {
    
    private String cor;
    
    public Morango() {
        this.cor = cor;
       
    }
    
    public String getCor() {
        return this.cor;
    }
        
    public void setCor(String corMorango) {
        this.cor = corMorango;
    }
    
    @Override
    public String comer() {
        return "Acida";
    
    }
    
    
    public String toString() {
        return "\n### Morango ###" 
        + "\nCor: " +this.cor 
        + "\nSabor: " +comer();
    }
}