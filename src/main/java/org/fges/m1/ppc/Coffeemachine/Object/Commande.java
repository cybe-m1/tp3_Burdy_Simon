package org.fges.m1.ppc.Coffeemachine.Object;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
@Data
public class Commande {
    @Id
    private int id;
    private Boisson boissonSelectioner;
    private int nbSucre;
    private int prix;

    public Commande(int id, Boisson boissonSelectioner, int nbSucre, int prix) {
        this.id = id;
        this.boissonSelectioner = boissonSelectioner;
        this.nbSucre = nbSucre;
        this.prix = prix;
    }
}
