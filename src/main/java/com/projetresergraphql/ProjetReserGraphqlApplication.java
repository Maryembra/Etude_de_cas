package com.projetresergraphql;




import com.projetresergraphql.entities.Chambre;
import com.projetresergraphql.entities.Client;
import com.projetresergraphql.repository.ChambreRepository;
import com.projetresergraphql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetReserGraphqlApplication implements CommandLineRunner {
//    @Autowired
//    private ClientRepository clientRepository;
//    @Autowired
//    private ChambreRepository chambreRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProjetReserGraphqlApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
     /*   // Ajout des clients
        Client client1 = new Client();
        client1.setNom("Dupont");
        client1.setPrenom("Jean");
        client1.setEmail("jean.dupont@example.com");
        client1.setTelephone("0102030405");

        Client client2 = new Client();
        client2.setNom("Durand");
        client2.setPrenom("Sophie");
        client2.setEmail("sophie.durand@example.com");
        client2.setTelephone("0607080910");

        clientRepository.save(client1);
        clientRepository.save(client2);

        // Ajout des chambres
        Chambre chambre1 = new Chambre();
        chambre1.setType("Simple");
        chambre1.setPrix(50.0);
        chambre1.setDisponible(true);

        Chambre chambre2 = new Chambre();
        chambre2.setType("Double");
        chambre2.setPrix(80.0);
        chambre2.setDisponible(true);

        chambreRepository.save(chambre1);
        chambreRepository.save(chambre2);


        System.out.println("Clients et chambres ajoutés avec succès !");
    */}
}
