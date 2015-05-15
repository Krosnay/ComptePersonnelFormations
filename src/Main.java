import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	

	 private String id = null;//variables de type String respectant le principe d'encapsulation ( private )
	 private String nom = null;
	 private String description = null;
	 private String duree = null;
	 private String formateur = null;
	 
	 public String getId() {
		return id;
	}


	public void setId(String id) {//Proc�dure qui prend en param�tre l'id de type String et modifie la variable de l'objet ( id )
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDuree() {
		return duree;
	}


	public void setDuree(String duree) {
		this.duree = duree;
	}


	public String getFormateur() {
		return formateur;
	}


	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}


	 
	 
	public static void main(String[] args) {
		
		Main obj = new Main();//Creation de l'objet Main
		
		String id = obj.getId();//Cr�ation de la variable id qui r�cupere la variable id de l'objet Main
		String nom = obj.getNom();
		String description = obj.getDescription();
		String duree = obj.getDuree();
		String formateur = obj.getFormateur();
		
		
		System.out.println("\n              Bonjour et bienvenue sur l'application de la Formation de la Maison des Ligues \n");
		System.out.println("________________________________________________________________________________________________________ \n");
		System.out.println("______________________________            Liste des formations            ______________________________\n");
		System.out.println("________________________________________________________________________________________________________ \n");
		
		
		Scanner scanner = null;//cr�e un objet de type Scanner ( librairie java � inclure au d�but du fichier )
		try {//essaye
			scanner = new Scanner(new FileReader("formations.txt"));//Ouvre le fichier formations.txt dans le r�pertoire de l'application
		} catch (FileNotFoundException e) {//Si le fichier n'est pas trouv� alors
			e.printStackTrace();//Affiche l'exception
		}
			
		
		 //Formation form = new Formation();

		 ArrayList<String> listeFormations = new ArrayList<>();//Principe de tableau dynamique ( au niveau de la taille )
		 while (scanner.hasNextLine()) {//Tant qu'il reste des lignes remplies dans le fichier
			 id = scanner.nextLine();//Id = a la premiere ligne du fichier
			 listeFormations.add(id);//On ajoute l'id recuper� dans l'ArrayList situ� avec la 1ere cl�
			 nom = scanner.nextLine();//Nom = � la deuxieme ligne du fichier
			 listeFormations.add(nom);
			 description = scanner.nextLine();
			 listeFormations.add(description);
			 duree = scanner.nextLine();
			 listeFormations.add(duree);
			 formateur = scanner.nextLine();
			 listeFormations.add(formateur);
			 
		 }
		 for(int i=0; i< listeFormations.size(); i++)
		 {//Boucle FOR pour lister les informations de l'arrayList 
			 		 System.out.println("Num�ro Formation : " + listeFormations.get(i) + "\n");
			 		 i++;//On incr�ment la variable i pour recuperer la variable associ� � l'indice i de l'arraylist 
					 System.out.println("Nom de la formation : " + listeFormations.get(i) + "\n");
					 i++;
					 System.out.println("Description de la formation : " + listeFormations.get(i)+ "\n");
					 i++;
					 System.out.println("Dur�e de la formation : " + listeFormations.get(i) + "\n");
					 i++;
					 System.out.println("Nom du responsable de la formation : " + listeFormations.get(i) + "\n");

		 }
		System.out.println("Indiquer le num�ro de formation � laquelle vous souhaitez vous inscrire ? \n");
		int numFormation = 0;
		Scanner sc = new Scanner(System.in);
		numFormation = sc.nextInt();//Recupere le num de formation entr� par l'utilisateur
		System.out.println("F�licitation, vous vous �tes inscrit(e) � la formation num�ro " + numFormation);
		
	
}
}
