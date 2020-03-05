/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.time.LocalDateTime;

/**
 * Classe de metier.
 * @author Lockolocko
 *
 */
public class UneClasseMetier extends Affichage {
    /**
     * Constructeur.
     */
    public UneClasseMetier() {
        super();
    }

    /**
     * Affiche deux temps.
     */
    public void uneMethodeMetier() {
        super.setTexte(LocalDateTime.now() + "");
        affiche();
        super.setTexte(LocalDateTime.now() + "");
        affiche();

    }
}
