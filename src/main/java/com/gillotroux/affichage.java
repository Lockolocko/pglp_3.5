/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

/**
 * Affichage.
 * @author Lockolocko
 *
 */
public class Affichage implements Affiche {
    /**
     * Texte à afficher.
     */
    private String texte;

    /**
     * Constructeur.
     */
    public Affichage() {
    }

    /**
     * Set text.
     * @param text
     */
    public void setTexte(final String text) {
        this.texte = text;
    }

    /**
     * Affiche.
     */
    public void affiche() {
        System.out.println(texte);
    }
}
