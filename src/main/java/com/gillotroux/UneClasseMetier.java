package com.gillotroux;

import java.time.LocalDateTime;

public class UneClasseMetier extends affichage{
	public UneClasseMetier() {
		super();
	}
	
	public void UneMethodeMetier() {
		this.texte=LocalDateTime.now()+"";
		affiche();		
		this.texte=LocalDateTime.now()+"";
		affiche();
		
		
	}
}
