// TP Conception & Programmation Objets Avancées - Passons le BAC
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 10.11.15

public class Bike extends Vehicle{
    /* ----- Attributes ----- */
    public static final int bike_gvm = 120; // mass of the bike including its rider
    /* ----- Constructor ----- */
    public Bike(String registrationPlate){
        super(registrationPlate);
    }
    /* ----- Methods ----- */
    @Override
    public int getGrossVehicleMass(){
        return this.bike_gvm;
    }
    /*@Override
    public boolean equals(Object o){
        if (Bike.class != o.getClass()){
            return false;
        }
        Bike bike = (Bike) o;
        return (this.registrationPlate==bike.registrationPlate);
    }*/
    @Override
    public String toString(){
        return "Vélo : "+super.toString();
    }
    /* ----- Main ----- */
    public static void main(String[] args){
        Bike bike1 = new Bike("LM-456-NO");
        System.out.println(bike1.toString());
        System.out.println("HashCode du Vélo : "+bike1.hashCode());
        Bike bike2 = new Bike("LM-456-NO");
        Bike bike3 = new Bike("LM-444-NO");
        System.out.println(bike1.equals(bike2));
        System.out.println(bike1.equals(bike3));
    }
}