public class Principal {
    public static void main (String [] args) {
        Aluno aluno = new Aluno();
        
        
        aluno.nome = "Janine";

        
        aluno.mostrarNomeAluno();
        aluno.mostrarNotaUm();
        aluno.mostrarNotaDois();
        aluno.calcularMedia();
        
        System.out.print("\f");
        
        System.out.printf("\nO nome do aluno é: " + aluno.nome
                        +"\nA primeira nota é: " + aluno.notaUm
                        +"\nA segunda nota é: " + aluno.notaDois
                        +"\nA média entre a nota " + aluno.notaUm + " e a nota " + aluno.notaDois + " é: " + aluno.calcularMedia());
        
    } 
}