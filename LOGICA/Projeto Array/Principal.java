import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
    public static void main(String args[]) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
       ArrayList<String> nomes = new ArrayList<String>();
       ArrayList<Double> notas1 = new ArrayList<Double>();
       ArrayList<Double> notas2 = new ArrayList<Double>();
       
        int i =0;
        
       //definir nomes
        for(int a = 0; a <4; a++) {
        ++i;
        System.out.println("Digite o nome do(a) " +i+ "º aluno(a)"); 
        nomes.add(scanner.nextLine());
        
}
       
         //primeira nota
    for(int b = 0; b < 4; b++) {
       
        System.out.println("Digite a 1º nota do(a) aluno(a) "+nomes.get(b)); 
        notas1.add(scanner.nextDouble());
        
}
    //segunda nota 
   for(int b = 0; b < 4; b++) {
        
        System.out.println("Digite a 2º nota do(a) aluno(a) "+nomes.get(b)); 
        notas2.add(scanner.nextDouble());
        
        
}



    

}
}
