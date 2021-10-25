package org.fges.m1.ppc.Coffeemachine.Object;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
public class TypeDeBoisson {

    @Id
    private int id;
    private String nom;
    private String description;
    @OneToMany
    @JoinColumn(name = "id_type")
    private Set<Boisson> boissons = new HashSet<>();

    public TypeDeBoisson(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.boissons = new HashSet<>();
    }
}
