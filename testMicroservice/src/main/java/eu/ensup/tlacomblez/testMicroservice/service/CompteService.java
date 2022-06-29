package eu.ensup.tlacomblez.testMicroservice.service;

public interface CompteService {
    
    void virement(Long codeSource,Long codeDestination, double montant);
}
