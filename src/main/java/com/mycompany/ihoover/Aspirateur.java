/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ihoover;

/**
 *
 * @author oyoki
 */
public class Aspirateur {

    private int x, y, orientation;
    private static final String orientations[] = {"N", "E", "S", "W"};
    private Grille grille;

    public Aspirateur() {
        this.x = 0;
        this.y = 0;
        this.orientation = 0;
        this.grille = new Grille();
    }

    public Aspirateur(int x, int y, String orientation) {
        this.grille = new Grille();
        // Check if x is in the correct interval
        this.x = x > grille.getLargeur() ? grille.getLargeur() : (x < 0 ? 0 : x); 
        // Check if y is in the correct interval
        this.y = y > grille.getLongueur() ? grille.getLongueur() : (x < 0 ? 0 : x);
        this.orientation = getIndexOfItem(orientation) == -1 ? 0 : getIndexOfItem(orientation);
    }

    public Aspirateur(int x, int y, String orientation, Grille grille) {
        this.grille = grille;
        this.x = x > grille.getLargeur() ? grille.getLargeur() : (x < 0 ? 0 : x); 
        this.y = y > grille.getLongueur() ? grille.getLongueur() : (x < 0 ? 0 : x);
        this.orientation = getIndexOfItem(orientation);
    }

    public Aspirateur(int x, int y, String orientation, int grilleX, int grilleY) {
        this.grille = new Grille(grilleX, grilleY);
        // Check if x is in the correct interval
        this.x = x > grille.getLargeur() ? grille.getLargeur() : (x < 0 ? 0 : x); 
        // Check if y is in the correct interval
        this.y = y > grille.getLongueur() ? grille.getLongueur() : (x < 0 ? 0 : x);
        this.orientation = getIndexOfItem(orientation);
    }

    /**
     * Rotate the hoover to the right
     */
    public void tournerDroite() {
        if (this.orientation == Aspirateur.orientations.length - 1) {
            this.orientation = 0;
        } else {
            this.orientation++;
        }
    }

    /**
     * Rotate the hoover to the left
     */
    public void tournerGauche() {
        if (this.orientation == 0) {
            this.orientation = this.orientations.length - 1;
        } else {
            this.orientation--;
        }
    }

    /**
     * Advance the hoover to one case whatever its orientation
     */
    public void avancer() {

        switch (this.orientation) {
            case 0: // North

                if (this.y == this.grille.getLongueur()) { //Vérifier si l'aspirateur n'est pas à la limite de la grille
                    System.out.println("Aspirateur ne peut plus avancer vers le nord, limite de la grille atteinte");
                } else  {
                    this.y++;
                }
                break;

            case 1: // East

                if (this.x == grille.getLargeur()) {
                    System.out.println("Aspirateur ne peut plus avancer vers l'est, limite de la grille atteinte");
                } else {
                    this.x++;
                }
                break;

            case 2: // South

                if (this.y == 0) {
                    System.out.println("Aspirateur ne peut plus avancer vers le sud, limite de la grille atteinte");
                } else {
                    this.y--;
                }
                break;

            case 3: // West
                
                if (this.x == 0) {
                    System.out.println("Aspirateur ne peut plus avancer vers l'ouest, limite de la grille atteinte");
                } else {
                    this.x--;
                }
                break;

            default:
                break;
        }

    }

    /**
     * Command the hoover about rotation and advancement Print the final state
     * of the hoover
     *
     * @param commandes the character sequence that the object aspirateur will apply and
     *                  print the state of the object in the end of the application
     */
    public void commander(String commandes) {
        for (int i = 0; i < commandes.length(); i++) {
            switch (commandes.toUpperCase().charAt(i)) {
                case 'D':
                    tournerDroite();
                    break;

                case 'G':
                    tournerGauche();
                    break;

                case 'A':
                    avancer();
                    break;

                default:
                    break;
            }
        }

        System.out.println(toString());

    }

    /**
     * Get the index of the item in parameter in the orientations array return
     * -1 if the item is not found
     *
     * @param item the element that we are searching in the array
     * @return     the index of the found element, -1 if it's not found
     */
    public final int getIndexOfItem(String item) {
        int index = -1;

        for (int i = 0; i < orientations.length; i++) {
            if (orientations[i].equals(item.toUpperCase())) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Orientation non reconnue !");
        }

        return index;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOrientation() {
        return orientations[orientation];
    }

    public void setOrientation(String orientation) {
        this.orientation = getIndexOfItem(orientation);
    }

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }

    @Override
    public String toString() {
        return "\n\n********************\n"
                + "x=" + x + ", y=" + y + ", orientation=" + orientations[orientation];
    }
}
