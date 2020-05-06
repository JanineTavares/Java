package alunoclasse;

public class Aluno {

    public double notas[];
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return Retorna a soma entre as notas dividida por 3
     */
    public double calcularMedia() {
        return (notas[0] + notas[1] + notas[2]) / 3;
    }

    /**
     *
     * @return Retorna o conceito adquirido pelo aluno de acordo com o resultado da média artimética
     */
    public String mostrarConceito() {
        if (calcularMedia() >= 9.0 && calcularMedia() <=10.0) { return "Conceito A"; }
        else if (calcularMedia() >= 8.0 && calcularMedia() <=8.9) { return "Conceito B"; }
        else if (calcularMedia() >= 7.0 && calcularMedia() <=7.9) { return "Conceito C"; }
        else if (calcularMedia() >= 0.0 && calcularMedia() <=5.9) { return "Conceito D"; }
        return "Conceito Inválido";
    }


    }

