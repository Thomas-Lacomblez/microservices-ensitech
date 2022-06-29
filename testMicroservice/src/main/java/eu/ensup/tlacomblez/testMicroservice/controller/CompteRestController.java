package eu.ensup.tlacomblez.testMicroservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.tlacomblez.testMicroservice.entities.Compte;
import eu.ensup.tlacomblez.testMicroservice.repositories.CompteRepository;

@RestController
public class CompteRestController {

    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    @GetMapping(path = "/comptes")
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long code){
        return compteRepository.findById(code).get();
    }
    @PostMapping(path="/comptes")
    public Compte save(@RequestBody Compte compte){
        System.out.println("********** Save **************");
        System.out.println( compte.getCode());
        System.out.println(compte.getSolde());
        return compteRepository.save(compte);
    }
    @PutMapping(path="/comptes/{code}")
    public Compte upadte(@PathVariable Long code,@RequestBody Compte compte){
        compte.setCode(code);
        return  compteRepository.save(compte);
    }
    @DeleteMapping(path="/comptes/{code}")
    public void dalete(@PathVariable Long code){
        compteRepository.deleteById(code);
    }
}