/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author ASUS
 */
public class JPAUtils {
        
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Prueba_BDPU");
    
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    
}
