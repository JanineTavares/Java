/**
 * 
 *
 * @author Janine Tavares
 * @version 1.0
 * @since 02/04/2020 - 18:03
 * */
public class Mes extends AMes {
    private int numero;

    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * @return Será retornado se o mês escolhido pelo usuario é valido ou não.
     */
    public String mostrarMes() {
        return (this.numero == 6 ? "Mês válido" : "Mês Inválido");
            
        
     }
     
   
}
