package Gestion.des.comptes.utilisateurs.Test.Utilisateurs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
    Utilisateur findUtilisateurByEmailAndPassword(String Email, String Password);
}
