package Gestion.des.comptes.utilisateurs.Test.Utilisateurs;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    private String nomUtilisateur;
    private String email;
    private String password;
    @ElementCollection(targetClass = UtilisateurRoles.class)
    @JoinTable(name = "Roles_user", joinColumns = @JoinColumn(name = "Utilidateur_Id"))
    @Column(name = "Roles", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private List<UtilisateurRoles> roles;

    public Utilisateur() {
    }

    public Utilisateur(String nomUtilisateur, String email, String password, List<UtilisateurRoles> roles) {
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
