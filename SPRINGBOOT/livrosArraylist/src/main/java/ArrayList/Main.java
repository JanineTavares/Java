package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> livros = new ArrayList<String>();

        System.out.println("\f");


        livros.add("Pequeno Principe");
        livros.add("Romeu e Julieta");

        //PARA CADA STRING LIVRO DENTRO DE LIVROS
        for(String livro: livros) {
            System.out.println(livros);
        }

        String primeiroLivro = livros.get(0);
        System.out.println("O primeiro livro é: " + primeiroLivro);

        for(int i=0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
        //REMOVER O LIVRO NO INDÍCE 0.
        livros.remove(0);
        System.out.println(livros);

        ///MOSTRAR QUANTIDADE DE ITEMS DENTRO DA LISTA
        System.out.println(livros.size());
  }
}
