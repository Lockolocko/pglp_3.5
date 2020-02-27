package com.gillotroux;

public class affichage implements Affiche{
	protected String texte;
	public affichage(){}
	
	public void affiche() {
		System.out.println(texte);
	}
}
