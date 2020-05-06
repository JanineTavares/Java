public class Ameixa extends Fruta {
    
    private String cor;
    
    public Ameixa() {
        this.cor = cor;
       
    }
    
    public String getCor() {
        return this.cor;
    }
        
    public void setCor(String corAmeixa) {
        this.cor = corAmeixa;
    }
    
    @Override
    public String comer() {
        return "Doce levemente acida";
    
    }
    
    public String toString() {
        return "\n### Ameixa ###" 
        + "\nCor: " +this.cor 
        + "\nSabor: " +comer();
    }
}