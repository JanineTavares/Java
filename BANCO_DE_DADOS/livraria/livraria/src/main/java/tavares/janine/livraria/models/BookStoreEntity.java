package tavares.janine.livraria.models;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "livraria")
public class BookStoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //banco automaticamente gera os ids de cada produto
    @Column(name = "id_livraria")
    private long id;

    @Column(name = "Autor")
    private String author;

    @Column(name = "nome")
    private String name;

    @Column(name = "ano")
    private int year;

    @Column(name = "valor")
    private double price;


}
