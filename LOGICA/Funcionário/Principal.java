public class Principal {
    public static void main (String[] args) {
        Funcionário funcionario = new Funcionário();
        
        funcionario.nome = "Janine Tavares";
        funcionario.rg = "002.156.786-78";
        
        funcionario.salarioBruto = 2500.6f;
        funcionario.valorHorasExtras =  120.0f;
        funcionario.salarioLiquido = 2390.5f; //salario com descontos - 110
        
        
        //funcionario.pedirAumento(180.6f); //void
        funcionario.calcularSalarioLiquido();
        funcionario.mostrarSalarioLiquido();
        
        //System.out.prinf (funcionario.pedirAumento());
        System.out.println("\f");
        
        System.out.printf("\nHoras Extras: R$ " + funcionario.valorHorasExtras);
        System.out.printf("\nSalario sem descontos: R$ " + funcionario.salarioBruto);
        System.out.printf("\nSalario com descontos: R$ "  + funcionario.mostrarSalarioLiquido());
        System.out.printf("\nFuncionario pediu aumento de: R$ " + funcionario.aumento);
        
        //System.out.println("\nSalario com aumento de 180.6: " + funcionario.salarioBruto);
        
        
       
        
        
    }
}        