package Gestion.des.comptes.utilisateurs.Test.Utilisateurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UtilisateurControle {
    @Autowired
    private UtilisateurService utilisateurService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public List<Utilisateur> GetUtilisateur(){
        return utilisateurService.getUtilisateur();
    }


    @RequestMapping(value = "/search/{Id}",method = RequestMethod.GET)
    public Utilisateur GetUtilisateurByid(@PathVariable Long Id){
        return utilisateurService.getUtilisateurByid(Id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Utilisateur Creatuser(@RequestBody Utilisateur utilisateur){
        return utilisateurService.creatuser(utilisateur);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Utilisateur Update(@RequestBody Utilisateur utilisateur){
        return utilisateurService.updateUser(utilisateur);
    }


    @RequestMapping(value = "/deleted/{Id}",method = RequestMethod.DELETE)
    public String DeleteUtilisateur(@PathVariable Long id) {
        return utilisateurService.deleteUtilisateur(id);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String LoginUtilisateurs(@RequestParam String email, @RequestParam String password) {
        return utilisateurService.LoginUtilisateur(email,password);
    }

}
