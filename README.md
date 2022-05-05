# Test.1
Gestion des comptes utilisateurs

1- Installation de l'application:

    I- Télécharger le fichier tout entier et déployer le sur intellij  
		
    II- Exécuter le fichier TestApplication.java
		
    III- Saisir les URLs suivantes dans postman pour accéder aux fonctionnalités demandées:
		
			1- Afficher tous les utilisateurs dans la base de données :        localhost:8080/search
			2- Afficher les détails d'un utilisateur à partir de son id :      localhost:8080/search/{id}
			3- Ajouter un Utilisateur :                                        localhost:8080/add
			4- Supprimer Tout les Utilisateur :                                localhost:8080/delete
			5- Supprimer un utilisateur à partir de son id :                   localhost:8080/delete/{id}
                    6- Modifier les informations d'un utilisateur :                    localhost:8080/update
			7- Pour se connecter, utiliser :                                   localhost:8080/login
	
	
2- Liste des données nécessaires pour accéder a la base de données H2 :

      I- Saisir l'URL suivant dans votre navigateur : localhost:8080/h2-console
      II- introduire les données suivant dans la console H2 : 
            - Driver Class:	org.h2.Driver
            - JDBC URL:	jdbc:h2:file:~/h2/demo
            - User Name: sa
            - Password:					
