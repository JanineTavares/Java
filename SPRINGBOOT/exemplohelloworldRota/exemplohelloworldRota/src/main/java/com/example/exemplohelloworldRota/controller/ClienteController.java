package com.example.exemplohelloworldRota.controller;

import com.example.exemplohelloworldRota.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public Cliente getClient() {
        Cliente cliente = new Cliente();
        cliente.setNome("Janine");
        return cliente;
    }

    @GetMapping("/arrayclientes")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Janine");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Paulo");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        return clientes;
    }
}
