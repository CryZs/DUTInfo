// TP Conception & Programmation Objets Avancées - CD-thèque
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 07.11.15

/* ------ Imports ------ */
import java.util.*;

public class ShoppingBasket{
    /* ------ Attributes ------ */
    private HashMap<CD,Integer> basket;
    public int n;
    /* ------ Constructors ------ */
    public ShoppingBasket(){
        this.basket = new HashMap<CD,Integer>();
    }
    /* ------ Methods ------ */
    public void buyOneMore(CD cd){
        if (basket.containsKey(cd)){
            basket.put(cd,basket.get(cd)+1);
        }
        else{
            basket.put(cd,1);
        }
    }
    public void buyOneLess(CD cd){
        if (basket.containsKey(cd) && basket.get(cd)>1){
            basket.put(cd,basket.get(cd)-1);
        }
        else{
            basket.remove(cd);
        }
    }
    public int howMany(CD cd){
        Set<CD> cdSet = basket.keySet();
        for (CD cdbasket : cdSet){
            if (cd.equals(cdbasket)){
                return basket.get(cdbasket);
            }
        }
        return 0;
    }
    public int howMany(){
        int total = 0;
        Set<CD> cdSet = basket.keySet();
        for (CD cd : cdSet){
            total += basket.get(cd);
        }
        return total;
    }
    public static void main(String[] args) {
		CD cd1 = new CD("Rolling Stones", "Sticky Fingers", 1230);
		CD cd2 = new CD("Rolling Stones", "Steel Wheels", 1150);
		CD cd3 = new CD("Rolling Stones", "Stripped", 1400);
		CD cd4 = new CD(Licence.CC_BY_SA, "Chichi 'n Dudu", "Singin' Java", 830);
		CD cd5 = new CD(Licence.PUBLIC_DOMAIN, "Jean-Baptiste Lully", "Au clair de la lune", 975);
		CD cd6 = new CD(Licence.COPYRIGHT, "Maroon 5", "V", 1799);

		ShoppingBasket basket = new ShoppingBasket();
		basket.buyOneMore(cd1);
		basket.buyOneMore(cd2);
		basket.buyOneMore(cd3);
		basket.buyOneMore(cd3);
		basket.buyOneMore(cd3);
		basket.buyOneMore(cd3);
		basket.buyOneLess(cd3);
		System.out.println("Combien de CD n°2 dans le panier : "+basket.howMany(cd2));
		System.out.println("Combien de CD n°3 dans le panier : "+basket.howMany(cd3));
		System.out.println("Combien de CD des Rolling Stones - Stripped dans le panier : "+basket.howMany(new CD("Rolling Stones", "Stripped", 1400)));
	}
}

