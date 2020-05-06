package com.example.exemplohelloworldRota.model;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
public class Produto {
    private String descricao;

    public Produto() {
    }

    /**
     *
     * @return Retorna o valor recebido no atributo "descricao"
     */
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
