/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ihoover;

/**
 *
 * @author oyoki
 */
public class Grille {

    private int largeur, longueur;

    public Grille() {
        this.largeur = 10;
        this.longueur = 10;
    }

    public Grille(int largeur, int longueur) {
        // Check if largeur is in the correct interval
        this.largeur = largeur < 1 ? 1 : largeur;
        // Check if longueur is in the correct interval
        this.longueur = longueur < 1 ? 1 : longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Grille{" + "largeur=" + largeur + ", longueur=" + longueur + '}';
    }
}
