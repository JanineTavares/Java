package tavaresjanine.injecaodependencia.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tavaresjanine.injecaodependencia.interfaces.IAnimal;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@Component
public class Pet {
    //Numero 3 - A annotation @AutoWired faz a injeção de dependencia automaticamente, sem precisarmos declarar construtor
    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

    //Numero 2 - baixa acoplamento. A aplicação envia a classe que deve ser instanciada por construtor
    //public pet(IAnimal iAnimal) {
    //this.iAnimal = iAnimal;
    //}

    public void execute() {
        iAnimal.comunicar();
    }

    //Numero 1 - classe Pet fortemente acoplada com a classe gato e cachorro. Precisamos entrar no codigo e modificar
    // a instanciação informando qual classe queremos.
    //public void execute() {
   // iAnimal = new Cat();
    //iAnimal.comunicar();


    }




