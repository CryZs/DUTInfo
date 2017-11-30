// TP Conception & Programmation Objets Avancées - CD-thèque
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 07.11.15


import java.util.*;

public class CDStore{
    /* ----- Attributs ----- */ 
    public HashMap<String,CD> store;
    
    /* ----- Constructor ----- */ 
    public CDStore(){
        store = new HashMap<String,CD>();
    }
    /* ----- Methods ----- */ 
    public void add(CD cd){
        store.put(cd.getTitle(),cd);
    }
    
    public CD get(String title){
        return store.get(title);
    }
    
    public int size(){
        return store.size();
    }
    
    public String toString(){
        Set<String> cdStore = store.keySet();
        Set<String> sortedCDStore = new TreeSet<>(cdStore);
        String str = new String();
        for (String title : sortedCDStore){
            str+=store.get(title)+"\n";
        }
        return str;
    }
    
    public void remove(CD cd){
        store.remove(cd.getTitle());
    }
    public static void main(String[] args) {
		CD cd1 = new CD("Rolling Stones", "Sticky Fingers", 1230);
		CD cd2 = new CD("Rolling Stones", "Steel Wheels", 1150);
		CD cd3 = new CD("Rolling Stones", "Stripped", 1400);
		CD cd4 = new CD(Licence.CC_BY_SA, "Chichi 'n Dudu", "Singin' Java", 830);
		CD cd5 = new CD(Licence.PUBLIC_DOMAIN, "Jean-Baptiste Lully", "Au clair de la lune", 975);
		CD cd6 = new CD(Licence.COPYRIGHT, "Maroon 5", "V", 1799);

        CDStore cdStore = new CDStore();
        cdStore.add(cd1);
        cdStore.add(cd2);
        cdStore.add(cd3);
        cdStore.add(cd4);
        cdStore.add(cd5);
        cdStore.add(cd6);
        /* Test des methods */
        System.out.println(cdStore.get("Sticky Fingers")+"\n");
        System.out.println("Size : "+cdStore.size());
        System.out.println("CD in CDStore :\n"+cdStore.toString()+"\n");
        System.out.println("/* Remove CD4 (Chichi n Dudu - Singin Java) */\n");
        cdStore.remove(cd4);
        System.out.println("Size : "+cdStore.size());
        System.out.println("CD in CDStore :\n"+cdStore.toString());
    }
}