public class VideoProjector extends Equipment{
	public VideoProjector(int purchaseYear, String brand, DisplayType type){
		super(purchaseYear, brand, type);
	} 
	public String toString(){
		return ("VideoProjector "+this.brand+" ("+this.purchaseYear+"), ["+this.type+"]");
	}
	/*@Override
    public boolean equals(Object o){
        if (!(o instanceof VideoProjector)){
            return false;
        }
        VideoProjector other = (VideoProjector) o;
        return (purchaseYear==other.purchaseYear && brand.equals(other.brand) && type.equals(other.type));
    }*/
	public static void main(String[] args){
		VideoProjector video = new VideoProjector(2012, "Epson", DisplayType.VGA);
		System.out.println(video.toString());
		VideoProjector video2 = new VideoProjector(2012, "Epson", DisplayType.VGA);
		System.out.println(video2.toString());
		System.out.println(video.equals(video2));
	}
	
}
