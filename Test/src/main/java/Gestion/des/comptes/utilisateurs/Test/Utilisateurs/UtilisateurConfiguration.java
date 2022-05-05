package Gestion.des.comptes.utilisateurs.Test.Utilisateurs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UtilisateurConfiguration {
    @Bean
    CommandLineRunner commandLineRunner (UtilisateurRepository repository){
        return args -> {
            Utilisateur mehdi = new Utilisateur("Mehdi", "Mehdi@gmail.com", "mehdi16", List.of(UtilisateurRoles.ROLE_ADMIN,UtilisateurRoles.ROLE_SUPERUSER) );
            Utilisateur Asma = new Utilisateur("Asma", "Asma@gmail.com", "asma27", List.of(UtilisateurRoles.ROLE_USER));
            Utilisateur Mohamed = new Utilisateur("Mohamed", "Mohamed@gmail.com", "moha19", List.of(UtilisateurRoles.ROLE_USER,UtilisateurRoles.ROLE_NEW));

            repository.saveAll(List.of(mehdi, Asma, Mohamed));

        };
    }
}
