public class Computer extends Equipment{
	private final int coreNumber;
	
	public Computer(int purchaseYear, String brand, int coreNumber, DisplayType type){
		super(purchaseYear,brand,type);
		this.coreNumber = coreNumber;
	}
	public String toString(){
		return ("Computer "+this.brand+" ("+this.purchaseYear+"), "+this.coreNumber+" core(s) ["+this.type+"]");
	}	
	public int getCoreNumber(){
		return this.coreNumber;
	}
	@Override
    public boolean equals(Object o){
        if (!(o instanceof Computer)){
            return false;
        }
        Computer other = (Computer) o;
        return (purchaseYear==other.purchaseYear && brand.equals(other.brand) && coreNumber==other.coreNumber && type.equals(other.type));
    }
    /*@Override
    public int yearOfRenewal(){
		if (this.type.equals("DISPLAY_PORT")){return 4*4/this.coreNumber;}
		if (this.type.equals("VGA")){return 8*4/this.coreNumber;}
		if (this.type.toString().equals("DVI")||this.type.equals("HDMI")){return 6*4/this.coreNumber;}
		return 0;
	}*/
	public static void main(String[] args){
		Computer comp = new Computer(2012, "Acer", 4, DisplayType.HDMI);
		System.out.println(comp.toString());
		Computer comp2 = new Computer(2012, "Acer", 4, DisplayType.HDMI);
		System.out.println(comp2.toString());
		System.out.println("Equals ? "+comp.equals(comp2));
		System.out.println(comp2 + " renewal expected in : " + comp2.yearOfRenewal());
	}
}
