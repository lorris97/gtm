/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.DAO;

import eu.ensup.BO.EtudiantBO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class EtudiantDAO {
    
    
    public ArrayList<EtudiantBO> getList(Statement stm) throws ClassNotFoundException, SQLException {
	
            ArrayList<EtudiantBO> ArrayListProfil = new ArrayList<EtudiantBO>();
     
                
		try {

			ResultSet res = stm.executeQuery("SELECT * FROM etudiant");

			while (res.next()) {
				EtudiantBO bo = new EtudiantBO();
				bo.setNom(res.getString("nom"));
				bo.setPrenom(res.getString("prenom"));
				bo.setAdresse(res.getString("adresse"));
				bo.setTelephone(res.getString("telephone"));
				bo.setEmail(res.getString("email"));
				bo.setDt_naiss(res.getString("date_naissance"));

				ArrayListProfil.add(bo);
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return ArrayListProfil;
	}
    
  
     
 public ArrayList<EtudiantBO> SearchByID(Statement stm, int id) throws ClassNotFoundException, SQLException {
	
            ArrayList<EtudiantBO> ArrayListProfil = new ArrayList<EtudiantBO>();
     
                
		try {

			ResultSet res = stm.executeQuery("SELECT * FROM `etudiant` WHERE id = "+ id);

			while (res.next()) {
				
				EtudiantBO bo = new EtudiantBO();
				bo.setNom(res.getString("nom"));
				bo.setPrenom(res.getString("prenom"));
				bo.setAdresse(res.getString("adresse"));
				bo.setTelephone(res.getString("telephone"));
				bo.setEmail(res.getString("email"));
				bo.setDt_naiss(res.getString("date_naissance"));

				ArrayListProfil.add(bo);
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return ArrayListProfil;
	}

 public void InsertNewEtudiant(Statement stm, EtudiantBO bo) throws ClassNotFoundException, SQLException {
	
                
		try {

                            stm.executeUpdate("INSERT INTO `etudiant`(`nom`, `prenom`, `email`, `adresee`, `telephone`, `date_naissance`, `password`) VALUES ('"+bo.getNom()+"','"+bo.getPrenom()+"','"+bo.getEmail()+"','"+bo.getAdresse()+"','"+bo.getAdresse()+"','"+bo.getTelephone()+"','"+bo.getDt_naiss()+"')");

		

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}
 
  public void DeleteProfil(Statement stm, int id) throws ClassNotFoundException, SQLException {
	
     
                
		try {

			stm.executeUpdate("DELETE FROM `etudiant` WHERE id = " + id);

		

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

 
}
