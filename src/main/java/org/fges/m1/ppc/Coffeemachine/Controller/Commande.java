package org.fges.m1.ppc.Coffeemachine.Controller;

import org.fges.m1.ppc.Coffeemachine.Object.Boisson;
import org.fges.m1.ppc.Coffeemachine.Object.BoissonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

@RequestMapping(path = "/commande")

public class Commande {


    @Autowired
    private BoissonRepo boissonRepo;
    @GetMapping("/{boissonId}")
    public Optional<Boisson> getBoisson(@PathVariable("boissonId") int boissonId) {
        return boissonRepo.findById(boissonId);
    }
}
