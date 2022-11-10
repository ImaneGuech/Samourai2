package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	public Commercant(String nom,int argent) {
		super(nom,"thé",argent);
	}
	
	
	
	public int seFaireExtorquer() {
		int valeur=getArgent();
		perdreArgent(valeur);
		System.out.println("le monde est vraiment trop injuste");
		return valeur;
			
	}	
	

	public void recevoir(int argent) {
	
		this.ajouterArgent(argent);
		System.out.println("Merci infiniment");
		
		
	}

}
