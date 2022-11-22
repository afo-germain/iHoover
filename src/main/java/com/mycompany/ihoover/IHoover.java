/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ihoover;

import java.util.Scanner;

/**
 *
 * @author oyoki
 */
public class IHoover {

    public static void main(String[] args) {

        int x = 5, y = 5, grilleX = 10, grilleY = 10;
        String orientation = "N", commandes = "";
        Scanner scan = new Scanner(System.in);

        // Obtenir les informations de la grille par saisie
        System.out.println("\n\nVeuillez saisir les informations de la grille");

        System.out.println("\nGrille X = ");
        try {
            grilleX = scan.nextInt();
        } catch (java.util.InputMismatchException e) { // A l'entrée d'un caractère autre qu'un nombre
            System.out.println("Donnée entrée incorrecte\nGrille X = " + grilleX);
        }
        scan.nextLine(); // Consommer la précendente entrée

        // Check if grilleX is in the correct interval
        if (grilleX < 1) {
            grilleX = 1;
            System.out.println("Donnée entrée incorrecte\ngrilleX = " + grilleX);

        }
        
        System.out.println("\nGrille Y = ");
        try {
            grilleY = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Donnée entrée incorrecte\nGrille Y = " + grilleY);
        }
        scan.nextLine();
        
        // Check if grilleY is in the correct interval
        if (grilleY < 1) {
            grilleY = 1;
            System.out.println("Donnée entrée incorrecte\ngrilleY = " + grilleY);

        }

        // Obtenir la position et l'orientation initiale de l'aspirateur par saisie
        System.out.println("\n\nVeuillez saisir les informations de l'aspirateur");
        System.out.println("\nAttention, X doit être inférieur à " + grilleX + " et Y inférieur à " + grilleY);

        System.out.println("\nX = ");
        try {
            x = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Donnée entrée incorrecte\nX = " + x);
        }
        scan.nextLine();
        
        // Check if x is in the correct interval
        if (x < 0) {
            x = 0;
            System.out.println("Donnée entrée incorrecte\nX = " + x);

        }
        if (x > grilleX) {
            x = grilleX;
            System.out.println("Donnée entrée incorrecte\nX = " + x);
        }

        System.out.println("\nY = ");
        try {
            y = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Donnée entrée incorrecte\nY = " + y);
        }
        scan.nextLine();
        
        // Check if y is in the correct interval
        if (y < 0) {
            y = 0;
            System.out.println("Donnée entrée incorrecte\nY = " + y);

        }
        if (y > grilleY) {
            y = grilleY;
            System.out.println("Donnée entrée incorrecte\nY = " + y);
        }

        System.out.println("\nOrientation (N, W, S, E) = ");
        try {
            orientation = scan.nextLine();
            orientation = String.valueOf(orientation.charAt(0));
        } catch (Exception e) { // A l'entrée d'un caractère vide
            orientation = "N";
            System.out.println("Donnée entrée incorrecte\nOrientation = " + orientation);
        }

        // A l'entrée d'un caractère autre que N, E, S, W
        if (!"N".equals(orientation.toUpperCase())
                && !"E".equals(orientation.toUpperCase())
                && !"S".equals(orientation.toUpperCase())
                && !"W".equals(orientation.toUpperCase())) {

            //orientation = "N";
            System.out.println("Donnée entrée incorrecte\nOrientation = " + orientation);
        }

        // Obtenir la position et l'orientation initiale de l'aspirateur par saisie
        System.out.println("\n\nVeuillez saisir les commandes souhaitées (D, G ou A) ");
        commandes = scan.nextLine();

        Aspirateur aspirateur = new Aspirateur(x, y, orientation, grilleX, grilleY);

        aspirateur.commander(commandes.toUpperCase());

    }
}
