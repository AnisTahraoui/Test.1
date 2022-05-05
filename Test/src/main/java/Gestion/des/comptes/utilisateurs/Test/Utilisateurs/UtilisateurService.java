package Gestion.des.comptes.utilisateurs.Test.Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    @Autowired
    private final UtilisateurRepository utilisateurRepo;

    public  UtilisateurService (UtilisateurRepository utilisateurRepo) {
        this.utilisateurRepo = utilisateurRepo;
    }
    public List<Utilisateur> getUtilisateur(){
        return (List<Utilisateur>) utilisateurRepo.findAll();
    }

    public Utilisateur getUtilisateurByid(Long id){
        return utilisateurRepo.findById(id).orElse(null);
    }

    public Utilisateur creatuser(Utilisateur utilisateur){
        return utilisateurRepo.save(utilisateur);
    }

    public Utilisateur updateUser(Utilisateur user) {
        Utilisateur oldUser = null;
        Optional<Utilisateur> optionaluser = utilisateurRepo.findById(user.getId());
        if(optionaluser.isPresent()) {
            oldUser=optionaluser.get();
            oldUser.setNomUtilisateur(user.getNomUtilisateur());
            oldUser.setEmail(user.getEmail());
            oldUser.setPassword(user.getPassword());
            oldUser.setRoles(user.getRoles());
            utilisateurRepo.save(oldUser);
        }else {
            return new Utilisateur();
        }
        return oldUser;
    }

    public String deleteUtilisateur(Long id) {
        utilisateurRepo.deleteById(id);
        return "user deleted";
    }

    /*Loging Servcie*/

    public String LoginUtilisateur(String email, String password){
        Utilisateur utilisateur = utilisateurRepo.findUtilisateurByEmailAndPassword( email, password);
        String Result;
        if (utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
           Result = "Welcome";
        } else{
            Result = "User doesn't exist";
        }
        return Result;
    }


}
