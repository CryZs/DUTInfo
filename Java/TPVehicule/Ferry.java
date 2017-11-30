// TP Conception & Programmation Objets Avancées - Passons le BAC
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 10.11.15

/* ----- Imports ----- */
import java.util.*;

public class Ferry extends Vehicle{
    /* ----- Attributes ----- */
    private final String name;
    private int currentMass;
    private final int gvm;
    private final Vehicle[] vehicles;
    private int freePlaces;
    
    /* ----- Constructor ----- */
    public Ferry(String registrationPlate, String name, int emptyMass, int gvm, int capacity){
        super(registrationPlate);
        this.name = name;
        this.currentMass = emptyMass;
        this.gvm = gvm;
        this.vehicles = new Vehicle[capacity];
        this.freePlaces = capacity;
    }
    /* ----- Getters ----- */
    @Override
    public int getGrossVehicleMass(){
        return this.gvm;
    }
    
    public int getCurrentMass(){
        return this.currentMass;
    }
    
    /* ----- Methods ----- */
    
    @Override
    public boolean isParkable(){return false;}
    
    public int park(Vehicle v) throws IllegalStateException{
        Objects.requireNonNull(v);
        if (!(v.isParkable())){
            throw new IllegalArgumentException("This vehicle is not parkable.");
        }
        int pl = -1;
        for (int i = 0; i<vehicles.length;i++){
            Vehicle vehic = vehicles[i];
            if (vehic!=null){
                if (vehic.equals(v)){
                    return i;
                }
            }
            else if (pl==-1){
                pl = i;
            }
        }
        if (freePlaces<=0){
            throw new IllegalStateException("Ferry is Full.");
        }
        int newMass = currentMass+v.getGrossVehicleMass();
        if (newMass>getGrossVehicleMass()){
            throw new IllegalArgumentException("Too heavy !");
        }
        currentMass = newMass;
        vehicles[pl]=v;
        freePlaces--;
        return pl;
    }
    
    public Vehicle unpark(int place) throws IllegalArgumentException{
        /* Si "place" est négatif ou dépasse la taille du Ferry */
        
        Vehicle v = vehicles[place];
        if (place<0 || place >= vehicles.length){
            throw new IllegalArgumentException ("Illegal place number");
        }
        if (v!=null){
            currentMass -= v.getGrossVehicleMass();
            freePlaces++;
            vehicles[place]=null;
        }
        return v;
    }
    
    @Override public String toString(){
        return (this.name+" - Plaque : "+this.getRegistrationPlate()+"\nPlaces ratio : "+this.freePlaces+"/"+this.vehicles.length+"\nMasse ratio disponible : "+this.getCurrentMass()+"/"+this.gvm+" kg");
    }
    
    public int findParkingPlace(String plate){
        for(int i=0;i<this.vehicles.length;i++){
            if(vehicles[i].getRegistrationPlate().equals(plate)){
                return i;
            }
        }
    }
    /* ----- Main ----- */
    public static void main(String[] args){
        Ferry ferry1 = new Ferry("FE-RRY-N1","Ferriz",5000,10000,4);
        System.out.println(ferry1.toString());
        
        Car car1 = new Car("AB-123-CD",500);
        System.out.println("\n-- On gare une "+car1.toString()+" --\n");
        ferry1.park(car1);
        System.out.println(ferry1.toString());
        
        Bike bike1 = new Bike("ZY-987-XW");
        System.out.println("\n-- On gare un "+bike1.toString()+" --\n");
        ferry1.park(bike1);
        System.out.println(ferry1.toString());
        
        System.out.println("\n-- On enlève la "+car1.toString()+" --\n");
        ferry1.unpark(0);
        System.out.println(ferry1.toString());
        
        // Ferry ferry2 = new Ferry("FE-RRY-N2","Ferrari",4000,10000,5);
        // ferry1.park(ferry2); // Gives the error : "This vehicle is not parkable."
        
    }
}