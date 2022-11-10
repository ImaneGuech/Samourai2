package personnages;

public class Humain {
	private String nom ;
	private String boisson ;
	private int argent ;
	
	public Humain(String nom,String boisson,int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	public void ajouterArgent(int value) {
		argent=value;
		
	}
	
	public void direBonjour() {
		System.out.println(" Bonjour ! Je m’appelle "+  getNom() +" et j’aime boire du "+ getBoisson());
		
		
	}
	
	public void parler(String texte) {
		System.out.println(getNom() + "- "+ texte);
	}
	
	public void boire() {
		System.out.println("Mmmm, un bon verre de"+ getBoisson() +" ! GLOUPS ! ");
		
	}
	
	
	public void perdreArgent(int value) {
		argent=value ;
		}
	
	public String getNom() {
		return this.nom;
	}
	public int getArgent() {
		return this.argent ;
	}
	
	public String getBoisson() {
		return this.boisson;
		
	}
	

}
