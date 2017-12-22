package cesi.ril;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DemoJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MAJEnBase("titi toto", "Jean DURANT");
		System.out.println("Sauver en base fait...");
		
	//	sauverEnBase("Jean DURANT");
	//	System.out.println("Sauver en base fait...");
		
	//	lireEnBase();
	//	System.out.println("Lire en base fait...");

	}
	
	public static void sauverEnBase(String personne) {
		
		// Information d'accès à la base de données
		String url = "jdbc:mysql://sql2.freemysqlhosting.net/sql2211266";
		String login = "sql2211266";
		String passwd = "pL3%uP4%";
		Connection cn = null;
		Statement st = null;
		try {
			// Etape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			
			// Etape 3 : Création d'un statement
			st = cn.createStatement();
			String sql = "INSERT INTO `javadb` (`personne`) VALUES ('" + personne + "')";
			
			// Etape 4 : exécution requête
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// Etape 5 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void lireEnBase() {
		// Information d'accès à la base de données
		String url = "jdbc:mysql://sql2.freemysqlhosting.net/sql2211266";
		String login = "sql2211266";
		String passwd = "pL3%uP4%";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			// Etape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			
			// Etape 3 : Création d'un statement
			st = cn.createStatement();
			String sql = "SELECT * FROM javadb";
			
			// Etape 4 : exécution requête
			rs = st.executeQuery(sql);
			
			// Etape 5 : (parcours Resultset)
			while (rs.next()) {
				System.out.println(rs.getString("personne"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// Etape 5 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void MAJEnBase(String maj, String recherche) {
		// Information d'accès à la base de données
		String url = "jdbc:mysql://sql2.freemysqlhosting.net/sql2211266";
		String login = "sql2211266";
		String passwd = "pL3%uP4%";
		Connection cn = null;
		PreparedStatement ppstmt = null;
		
		try {
			// Etape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			
			// Etape 3 : Création d'un statement
			String sql = "UPDATE javadb set personne = '" + maj + "' WHERE personne = '" + recherche + "'";
			ppstmt = cn.prepareStatement(sql);
			
			ppstmt.setString(1,maj);
			
			ppstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// Etape 5 : libérer ressources de la mémoire.
				cn.close();
				ppstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
