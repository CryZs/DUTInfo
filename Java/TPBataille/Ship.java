public class Ship{
    private int[] cells;
    private int armor;
    private final int maxArmor;
    private int currentArmor;
    public Ship(int length, int armor) throws IllegalArgumentException{
        if (armor<0){ throw new IllegalArgumentException("L'armure ne peut pas être inférieure à 0.");}
        if (length<=0){ throw new IllegalArgumentException("La longueur ne peut être inférieure ou égale à 0.");}
        this.cells = new int[length];
        this.armor = armor;
        maxArmor = currentArmor = armor*length;
        for (int i=0;i<length;i++){
            this.cells[i] = armor;
        }
    }
    public boolean isIntact(){
        return (currentArmor == maxArmor);
    }
    public boolean isSunk(){
        return (currentArmor==0); 
    }
    public void hit(int position) throws IllegalArgumentException{
        if (position>cells.length || position < 0){
            throw new IllegalArgumentException("La cellule n'est pas valide.");
        }
        else{
            if (cells[position]<0){
                throw new IllegalArgumentException("L'armure est déjà à 0.");
            }
            cells[position]--;
            currentArmor--;
        }
    }
    @Override
    public Ship clone() {
        Ship clonedShip = null;
        try {
            Object object = super.clone();
            clonedShip = (Ship)object;
            clonedShip.cells = this.cells.clone();
        }
        catch(CloneNotSupportedException e) {
            System.out.println("Internal Error");
        }
        return clonedShip;
    }
    public static void main(String[] args){
        Ship s = new Ship(2,2);
        Ship s2 = s.clone();
        System.out.println("Is the ship intact: "+s.isIntact());
        s.hit(0);
        s.hit(0);
        s.hit(1);
        s.hit(1);
        System.out.println("Is the ship sunk: "+s.isSunk());
    }
}