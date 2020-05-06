package com.example.exemplohelloworldRota.controller;

import com.example.exemplohelloworldRota.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class ProdutoController {
    /**
     *
     * @return Retorna "Área do produto"
     */
    @GetMapping ("/produtos")
    public String getProducts() {
        return "Área do produto";
    }

    /**
     *
     * @return "Garrafão Vinho 5L"
     */
    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setDescricao("Garrafão Vinho 5L");
        return produto;
    }
}
