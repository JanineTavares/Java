package com.example.exemplohelloworldlombok.controller;


import com.example.exemplohelloworldlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class ClientsController {

        @GetMapping("/listaclientes")
        public ArrayList<Client> getListClients () {
            Client client2 = new Client();
            client2.setNome("Janine");
            client2.setLastName("Tavares");
            client2.setEmail("janineh201@gmail.com");

            Client client3 = new Client();
            client3.setNome("Paulo");
            client3.setLastName("Simões");
            client3.setEmail("paulosimoes@gmail.com");
            ArrayList<Client> clients = new ArrayList<>();
            clients.add(client2);
            clients.add(client3);
            return clients;
        }
    }

