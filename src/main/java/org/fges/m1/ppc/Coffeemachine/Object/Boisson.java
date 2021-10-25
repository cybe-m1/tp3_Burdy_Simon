package org.fges.m1.ppc.Coffeemachine.Object;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
public class Boisson {

    @Id
    private int id;
    private TypeDeBoisson typedeboisson;
    private String nom;
    private String description;
    private int prix;

    public Boisson(int id, TypeDeBoisson typedeboisson, String nom, String description, int prix) {
        this.id = id;
        this.typedeboisson = typedeboisson;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }
}
