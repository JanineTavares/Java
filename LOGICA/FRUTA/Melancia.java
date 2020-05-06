public class Melancia extends Fruta {
    
    private String cor;
    
    public Melancia() {
        this.cor = cor;
       
    }
    
    public String getCor() {
        return this.cor;
    }
        
    public void setCor(String corMelancia) {
        this.cor = corMelancia;
    }
    
    @Override
    public String comer() {
        return "Doce";
    
    }
    
    public String toString() {
        return "\n### Melancia ###" 
        + "\nCor: " +this.cor 
        + "\nSabor: " +comer();
    }
    
}