package eu.ensup.tlacomblez.testMicroservice.web;

import eu.ensup.tlacomblez.testMicroservice.dto.VirementRequestDTO;
import eu.ensup.tlacomblez.testMicroservice.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;

    @PutMapping(path="comptes/virement")
    public void virement(@RequestBody VirementRequestDTO request){
        compteService.virement(request.getCodeSource(),request.getCodeDestination(),request.getMontant());
    }
}