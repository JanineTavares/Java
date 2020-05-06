import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = {"Shampoo", "Condicionador", "Fraldas", "Talco"};

        System.out.println("\f");

//        //FOR EACH
        System.out.println("\n\nUsando For Each");
        for (String i : produtos) {
            System.out.println(i);
        }

                //FOR
                System.out.println("\n\nUsando somente for");
                System.out.println("Produtos disponíveis");
                for (int a = 0; a < produtos.length; ++a) {
                    System.out.println(produtos[a]);
                }

                        //ACESSAR ELEMENTO ARRAY
                        System.out.println("\nPrimeiro na lista");
                        System.out.println(produtos[0]);

                                                    //MUDAR VALOR
                                                    System.out.println("\nTrocando valores");
                                                    produtos[0] = "Perfume";
                                                    System.out.println(produtos[0]);

        }
    }

