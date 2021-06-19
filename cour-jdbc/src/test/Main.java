package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.PersonnelDao;
import model.Personne;


public class Main {

	public static void main(String[] args) {
		
		PersonnelDao dao = new PersonnelDao();
		
		// résultat de la méthode 'findAll' dans 'PersonneDao'
//		ArrayList<Personne> personnes = dao.findAll();
//		for(Personne p:personnes) {
//			System.out.println(p);
//		}
//	
		// 'resultat' de la méthode 'findById' dans PersonneDao
//		System.out.println(dao.findById(1));
		
		// 'resultat' après la méthode 'save' avec 'insert' dans 'PersonneDao'
		Personne personne = new Personne("maggio", "carol");
		dao.save(personne);
		ArrayList<Personne> personnes = dao.findAll();
		for (Personne p : personnes) {
			System.out.println(p);
		}
		
		// 'resultat' de la méthode 'update' dans PersonneDao
	}
		
//		// table dynamic avec ArrayList, on peut ajouter les attributs quand on veut
//		ArrayList list = new ArrayList();
//		list.add(2);
//		list.add("bonjour");
//		list.add(true);
//		list.add(new Personne("wick", "john"));
//		for(Object o: list) {
//			System.out.println(o);
//		}
//		
//		ArrayList<Personne> personnes = new ArrayList<Personne>();
//		// personnes.add(true); 
//		//!!! dans class Personne, pas de 'add' attribut, donc, on ne peut qu'ajouter les attributs comme constructor défini dans la class Personne
//		personnes.add(new Personne("wick", "john"));
//		for(Personne p: personnes) {
//			System.out.println(p);
//		}
	
			
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		}

		// charger de la connection
//		String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=UTC"; 
//		// ajouter le serveur après le nom de base '?useSSL=false&serverTimezone=UTC";
//		// localhost: adresse local du server, dans l'entreprise, remplacer l'adresse de serveur de l'entreprise
//		// jdbc: le nom de database
//		// le nom de user et password comme dans la prédéfinition quand on a téléchargé MySQL
//		String user = "root"; 
//		String password = "root";
//		Connection connexion = null;
//
//		
//		// établissement de la connexion à la base
//		try {
//			connexion = DriverManager.getConnection(url, user, password);
//			
			
			// 'INSERT INTO table () VALUES()' dans la table
//			String request = "INSERT INTO Personne (nom,prenom) VALUES (?,?);";
//			PreparedStatement ps = connexion.prepareStatement(request, PreparedStatement.RETURN_GENERATED_KEYS);
//			ps.setString(1, "Mitroglou");
//			ps.setString(2, "Kostas");
//			ps.executeUpdate();
//			ResultSet resultat = ps.getGeneratedKeys();	// donner la primary key générer par server
//			if (resultat.next())
//				System.out.println("Le numéro généré pour cette personne : " + resultat.getInt(1));
//		
			// 'UPDATE table SET ...  WHERE ...' 
//			String request = "UPDATE Personne SET prenom=?, nom =?  WHERE num=?";
//			PreparedStatement ps = connexion.prepareStatement(request, PreparedStatement.RETURN_GENERATED_KEYS);
//			ps.setString(1, "Eric");
//			ps.setString(2, "Paris");
//			ps.setInt(3, 3);
//			ps.executeUpdate();
////			ResultSet resultat = ps.getGeneratedKeys();	// donner la primary key générer par server
////			if (resultat.next())
////				System.out.println("Le numéro généré pour cette personne : " + resultat.getInt(1));
//			
			//'DELETE FROM table WHERE...'
//			String request = "DELETE FROM Personne WHERE num =? ";
//			PreparedStatement ps = connexion.prepareStatement(request, PreparedStatement.RETURN_GENERATED_KEYS);
//			ps.setInt(1, 4);
//			ps.executeUpdate();
//			
//			
//			// créeation de la requête (statement)
//			Statement statement = connexion.createStatement();
//			// Préparation de la requête
//			 request = "SELECT * FROM Personne;"; // déclarer dans insert, donc, supprimer 'String' dans cette ligne 
//			// Exécution de la requête
//			ResultSet result = statement.executeQuery(request); // executeQuery
////			
//			// récuperer le résultat de la requête
//			while (result.next()) {
//				// on indique chaque fois le nom de la colonne et le type
//				int num = result.getInt("num"); // ou l'indice(colonne) de la base comme result.getInt(1)
//				String nom = result.getString("nom");
//				String prenom = result.getString("prenom");
//				System.out.println(num + " " + nom + " " +
//				prenom);
//				}
//			
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				if (connexion != null)
//					try {
//						connexion.close();
//					} catch (SQLException ignore) {
//						ignore.printStackTrace();
//					}
//		}
//
//	}

}
