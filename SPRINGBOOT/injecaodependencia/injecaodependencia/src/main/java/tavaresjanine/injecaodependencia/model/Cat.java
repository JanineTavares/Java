package tavaresjanine.injecaodependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tavaresjanine.injecaodependencia.interfaces.IAnimal;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("miau");

    }
}
