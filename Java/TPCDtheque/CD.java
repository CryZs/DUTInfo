// TP Conception & Programmation Objets Avancées - CD-thèque
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 06.09.15

/* ------ Imports ------ */
import java.util.*;
public class CD {
    /* ------ Attributes ------ */
    private final String author;
    private final String title;
    private final int price;
    private final Licence licence;
    /* ------ Constructors ------ */
    public CD(Licence licence, String author, String title, int price){
        this.licence=licence;
        this.author=author;
        this.title=title;
        this.price=price;
    }
    public CD(String author, String title, int price){
        this(Licence.COPYRIGHT,author,title,price);
    }
    /* ------ Methods ------ */
    public int getPrice(){
		return this.price;
	}
	
	public String getTitle(){
		return this.title;
	}
    @Override
    public String toString(){
        return (this.title+" ("+this.author+") - "+(this.price/100)+","+String.format("%02d",price%100)+"€"); 
    }
    public static int totalPriceForCopyright(List<CD> list){
        int i,total=0;
        for (CD cd:list){
            if(cd.licence==Licence.COPYRIGHT){
                total+=cd.price;
            }
        }
        return total;
    }
    @Override
    public boolean equals(Object o){
        //if (!(o instanceof CD)){ // (o instanceof CD) == Si on peut ranger o dans une instance CD, ou une sous classe de CD 
        if (CD.class != o.getClass()){ // Condition pour SuperAudioCD
            return false;
        }
        CD cd = (CD) o;
        return (this.price==cd.price && this.licence==cd.licence && this.author.equals(cd.author) && this.title.equals(cd.title));
    }
    /* ------ Main ------ */
    
    public static void main(String[] args) {
        CD cd1 = new CD("Rolling Stones", "Sticky Fingers", 1230);
        CD cd2 = new CD("Rolling Stones", "Steel Wheels", 1150);
        CD cd3 = new CD("Rolling Stones", "Stripped", 1400);
        CD cd4 = new CD(Licence.CC_BY_SA, "Chichi 'n Dudu", "Singin' Java", 830);
        CD cd5 = new CD(Licence.PUBLIC_DOMAIN, "Jean-Baptiste Lully", "Au clair de la lune", 975);
        CD cd6 = new CD(Licence.COPYRIGHT, "Maroon 5", "V", 1799);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        System.out.println(cd4);
        System.out.println(cd5);
        System.out.println(cd6);
        List<CD> list = new ArrayList<>();
		list.add(cd1);
		list.add(cd2);
		list.add(cd3);
		list.add(cd4);
		list.add(cd5);
		list.add(cd6);
		System.out.print("Prix total : ");
		System.out.println(CD.totalPriceForCopyright(list)/100+","+(String.format("%02d",CD.totalPriceForCopyright(list)%100))+"€");
		CD cd7 = new CD("Rolling Stones", "Sticky Fingers",1230);
		System.out.print("Est-ce que : \""+cd7+"\" est le même CD que :\""+cd1+"\" ? ");
		System.out.println(cd7.equals(cd1));
		
		
		
		
		System.out.println("/* Ranger et chercher des CD dans des collections */");
		System.out.println(list.contains(cd3));
		System.out.println(list.contains(new CD("Rolling Stones", "Stripped", 1400)));
		
		
		
		System.out.println("/* Création d'un HashSet<CD> pour vérifier le code de l'énoncé */");
		HashSet<CD> set = new HashSet<>();
		System.out.println(set.add(cd1));
		System.out.println(set.add(cd1));
		System.out.println(set.add(cd2));
		System.out.println(set.add(cd3));
		System.out.println(set);
		
		System.out.println(set.contains(cd1));
		System.out.println(set.contains(new CD("Rolling Stones", "Stripped", 1400)));
    }
}