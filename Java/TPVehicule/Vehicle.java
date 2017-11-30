// TP Conception & Programmation Objets Avancées - Passons le BAC
// DUT Informatique 2 - IUT Marne-la-Vallée
// @author : Rémy VAST
// @date : 10.11.15

public abstract class Vehicle implements Iterable<Vehicle>{
    /* ----- Attributs ----- */
    protected final String registrationPlate;
    
    /* ----- Constructor ----- */
    protected Vehicle(String registrationPlate){
        this.registrationPlate = registrationPlate;
    }
    
    /* ----- Methods ----- */
    protected String getRegistrationPlate(){
        return this.registrationPlate;
    }
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Vehicle) || o == null){
            return false;
        }
        /*
        if (this.getClass() != o.getClass()){
            return false;
        }// Non adapté 
        */
        Vehicle O = (Vehicle) o;
        return (this.getRegistrationPlate()==O.getRegistrationPlate());
    }
    @Override
    public int hashCode(){
        if (registrationPlate==null){
            return 0;
        }
        return registrationPlate.hashCode();
    }
    @Override
    public String toString(){
        return this.getRegistrationPlate()+" - "+this.getGrossVehicleMass()+" Kg";
    }
    public boolean isParkable(){
        return true;
    }
    
    /* ----- Abstract Method ----- */
    public abstract int getGrossVehicleMass();
    
    /* ------ Iterator ----- */
    public Iterator<Vehicle> iterator(){
        return new Iterator<Vehicle>{
            int index = 0;
            Vehicle v = null;
            @Override
            public boolean hasNext(){
                if (v!=null) return true;
                for (int i = index;i<vehicles.length;i++){
                    if (vehicles[i]!=null){
                        v=vehicles[i];
                        index=i+1;
                        return true;
                    }
                }
                index = vehicles.length;
                return false;
            }
            public Vehicle next(){
                
            }
        }
    }
}