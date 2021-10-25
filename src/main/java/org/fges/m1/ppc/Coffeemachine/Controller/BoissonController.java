package org.fges.m1.ppc.Coffeemachine.Controller;

import org.fges.m1.ppc.Coffeemachine.Service.boissonService;
import org.fges.m1.ppc.Coffeemachine.Object.Boisson;
import org.fges.m1.ppc.Coffeemachine.Object.BoissonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(path = "/boisson")

public class BoissonController {
    private final boissonService boissonservice;

    @Autowired
    private BoissonRepo boissonRepo;


    public BoissonController(boissonService boissonservice) {
        this.boissonservice = boissonservice;
    }

    @GetMapping
    public Iterable<Boisson> getBoissons() {
        return boissonRepo.findAll();
    }
    @GetMapping("/{boissonId}")
    public Boisson getBoisson(@PathVariable("boissonId") int boissonId) {

        return boissonservice.getBoisson(boissonId);
    }

    
    @PutMapping("/{typeBoisson}")
    public List<Boisson> toutLesBoissonDuType(@PathVariable String typeBoisson) {
        return boissonservice.boissonParType(typeBoisson);
    }
}
