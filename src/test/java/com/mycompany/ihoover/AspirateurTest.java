/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ihoover;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oyoki
 */
public class AspirateurTest {
    
    public AspirateurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of tournerDroite method, of class Aspirateur.
     */
    @Test
    public void testTournerDroite() {
        System.out.println("\n\nTourner à Droite");
        
        Aspirateur aspirateur = new Aspirateur(5, 5, "N", 10, 10);
        aspirateur.tournerDroite();
        
        System.out.println(aspirateur.toString());
        
        assertEquals(5, aspirateur.getX(), "Erreur sur la coordonnée X de l'aspirateur");
        assertEquals(5, aspirateur.getY(), "Erreur sur la coordonnée Y de l'aspirateur");
        assertEquals("E", aspirateur.getOrientation(), "Erreur sur l'orientation de l'aspirateur");
    }

    /**
     * Test of tournerGauche method, of class Aspirateur.
     */
    @Test
    public void testTournerGauche() {
        System.out.println("\n\nTourner à Gauche");
        
        Aspirateur aspirateur = new Aspirateur(5, 5, "N", 10, 10);
        aspirateur.tournerGauche();
        
        System.out.println(aspirateur.toString());
        
        assertEquals(5, aspirateur.getX(), "Erreur sur la coordonnée X de l'aspirateur");
        assertEquals(5, aspirateur.getY(), "Erreur sur la coordonnée Y de l'aspirateur");
        assertEquals( "W", aspirateur.getOrientation(), "Erreur sur l'orientation de l'aspirateur");
    }

    /**
     * Test of avancer method, of class Aspirateur.
     */
    @Test
    public void testAvancer() {
        System.out.println("\n\nAvancer");

        Aspirateur aspirateur = new Aspirateur(5, 5, "S", 10, 10);
        aspirateur.avancer();
        
        System.out.println(aspirateur.toString());
        
        assertEquals(5, aspirateur.getX(), "Erreur sur la coordonnée X de l'aspirateur");
        assertEquals(4, aspirateur.getY(), "Erreur sur la coordonnée Y de l'aspirateur");
        assertEquals( "S", aspirateur.getOrientation(), "Erreur sur l'orientation de l'aspirateur");
    }

    /**
     * Test of commander method, of class Aspirateur.
     */
    @Test
    public void testCommander() {
        System.out.println("\n\nCommander");

        Aspirateur aspirateur = new Aspirateur(5, 5, "S", 10, 10);
        aspirateur.commander("DADADADAA");
        
        assertEquals(5, aspirateur.getX(), "Erreur sur la coordonnée X de l'aspirateur");
        assertEquals(4, aspirateur.getY(), 6, "Erreur sur la coordonnée Y de l'aspirateur");
        assertEquals( "S", aspirateur.getOrientation(), "Erreur sur l'orientation de l'aspirateur");
    }

}
