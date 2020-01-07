/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVICE;

import eu.ensup.BO.EtudiantBO;
import eu.ensup.CONNECTION.Connection;
import eu.ensup.DAO.EtudiantDAO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class EtudiantSERVICE {
    
    public ArrayList<EtudiantBO> liste() throws ClassNotFoundException, SQLException
            
    {
         Connection con = new Connection();
        Statement stm = con.Connect();
         EtudiantDAO dao = new EtudiantDAO();
     ArrayList<EtudiantBO> liste = new ArrayList<EtudiantBO>();
     liste = dao.getList(stm);
     stm.close();
     
     return liste;
    }
    
}
