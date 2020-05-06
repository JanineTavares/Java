public class Banana extends Fruta {
    
    private String cor;
    
    public Banana() {
        this.cor = cor;
       
    }
    
    public String getCor() {
        return this.cor;
    }
        
    public void setCor(String corBanana) {
        this.cor = corBanana;
    }
    
    @Override
    public String comer() {
        return "Doce";
    
    }
    
    public String toString() {
        return "\n### Banana ###" 
        + "\nCor: " +this.cor 
        + "\nSabor: " +comer();
    }
    
    
    
}