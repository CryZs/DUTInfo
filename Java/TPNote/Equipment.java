public abstract class Equipment{
	protected final int purchaseYear;
	protected final String brand;
	protected final DisplayType type;
	
	public Equipment(int purchaseYear, String brand, DisplayType type){
		this.purchaseYear = purchaseYear;
		this.brand = brand;
		this.type = type;
	}
	
	public int getPurchaseYear(){return this.purchaseYear;}
	public String getBrand(){return this.brand;}
	public DisplayType getType(){return this.type;}
    
    public boolean equals(Object o){
        if (!(o instanceof Equipment) || o == null){return false;}
        Equipment other = (Equipment) o;
        return (purchaseYear==other.purchaseYear && brand.equals(other.brand) && type.equals(other.type));
    }
    /*
    public int yearOfRenewal(){
		if (this.type.equals("DISPLAY_PORT")){return 4;}
		if (this.type.equals("VGA")){return 8;}
		if (this.type.equals("DVI")||this.type.equals("HDMI")){return 6;}
		return 0;
	}
	*/
}
