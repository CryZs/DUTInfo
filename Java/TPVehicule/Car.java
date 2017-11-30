// TP Conception & Programmation Objets Avancées - Passons le BAC
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 10.11.15

public class Car extends Vehicle{
    /* ----- Attributes ----- */
    public int gvm;
    /* ----- Constructor ----- */
    public Car(String registrationPlate, int gvm){
        super(registrationPlate);
        this.gvm = gvm;
    }
    /* ----- Getters ----- */
    @Override
    public int getGrossVehicleMass(){
        return this.gvm;
    }
    
    /* ----- Methods ----- */
    /*
     *L'annotation @Override sert à redéfinir une méthode héritée d'une classe mère.
     *Elle permet de générer directement la javadoc de la méthode héritée.
     *@Override est facultatif
     */
    @Override
    public String toString(){
        return "Voiture : "+super.toString();
    }
    /*@Override
    public boolean equals(Object o){
        if (Car.class != o.getClass()){
            return false;
        }
        Car car = (Car) o;
        return (this.registrationPlate==car.registrationPlate);
    }*/
    /* ----- Main ----- */
    public static void main(String[] args){
        Car car1 = new Car("AA-123-BB",500);
        Car car2 = new Car("ZZ-789-XX",750);
        Car car3 = new Car("AA-123-BB",625);
        System.out.println("Véhicule 1 : "+car1.toString());
        System.out.println("Véhicule 2 : "+car2.toString());
        System.out.println("Véhicule 3 : "+car3.toString());
        System.out.println("Equalité du Véhicule 1 et du Véhicule 3 : "+car1.equals(car3));
        System.out.println("Véhicule 1 (hashCode) : "+car1.hashCode());
        
        Car car4 = new Car("",600);
        System.out.println(car4.hashCode());
    }
}