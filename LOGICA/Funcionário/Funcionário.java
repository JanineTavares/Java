public class Funcionário {
    String nome;
    String rg;
    float salarioBruto; //2500
    float valorHorasExtras; // 120
    float salarioLiquido; //2390
    float aumento = 180.6f;
   
        
    public void pedirAumento() {
        
    }
    
    
    public  float calcularSalarioLiquido() { //salario menos descontos
        return  (salarioBruto - 110.0f) + valorHorasExtras;
    }    
    
    public  float mostrarSalarioLiquido() {
        return salarioLiquido; 
    }
}
