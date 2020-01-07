/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.ensup.SERVLET;

import eu.ensup.BO.EtudiantBO;
import eu.ensup.SERVICE.EtudiantSERVICE;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lorris
 */
public class RedirectListerEtudiantSERVLET extends HttpServlet{
    
    
    public static final String VUE = "/Liste Etudiants.jsp";
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        
     EtudiantSERVICE service = new EtudiantSERVICE();
    List<EtudiantBO> liste = null ;
        try {
            liste = service.liste();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RedirectListerEtudiantSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RedirectListerEtudiantSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }
          request.setAttribute("liste", liste );
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    
     EtudiantSERVICE service = new EtudiantSERVICE();
    List<EtudiantBO> liste = null ;
        try {
            liste = service.liste();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RedirectListerEtudiantSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RedirectListerEtudiantSERVLET.class.getName()).log(Level.SEVERE, null, ex);
        }
          request.setAttribute("liste", liste );
         
              this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        
    }
    
}