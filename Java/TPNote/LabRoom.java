import java.util.*;

public class LabRoom{
	private VideoProjector videoProjector;
	/*final*/ private Computer[] computers;
	private int capacity;
	public LabRoom(int capacity){
		this.capacity = capacity;
		this.computers = new Computer[capacity];
	}
	public VideoProjector setVideo(VideoProjector video) throws IllegalArgumentException{
		if (video.equals(this.videoProjector)){
			throw new IllegalArgumentException("This VideoProjector is already installed in this room.");
		}
		VideoProjector old = this.videoProjector;
		this.videoProjector = video;
		return old;
	}
	public Computer setComputer(int place, Computer computer) throws IllegalArgumentException{
		Objects.requireNonNull(computer);
		if (place > computers.length || place<0){
			throw new IllegalArgumentException("This place is Invalid");
		}
		for (int i = 0; i<computers.length; i++){
			if (computer.equals(this.computers[i])){
				throw new IllegalArgumentException("This computers already exists in this room.");
			}
		}
		Computer old = this.computers[place];
		this.computers[place] = computer;
		return old;
	}
	public List<Equipment> equipmentsOfBrand(String brand){
		List<Equipment> list = new ArrayList<Equipment>();
		if (videoProjector.getBrand().equals(brand)){
			list.add(videoProjector);
		}
		int i = 0;
		while (i < computers.length){
			if (computers[i]!=null){
				if (computers[i].getBrand().equals(brand)){
					list.add(computers[i]);
				}
			}
		i++;
		}
		return list;
	}
	
	public int medianYearOfPurchase(){
		ArrayList<Integer> list = new ArrayList<>();
		if (video != null) {list.add(video.getPurchaseYear());}
		if list.isEmpty()){throw new IllegalArgumentException("Unknown error");}
		/*Jé pa copié*/
		return 0;
	}
	
	@Override
	public Iterator<Computer> iterator(){
		return new Iterator<Computer>{
			int index;
			Computer current;
			@Override
			public boolean hasNext(){
				if (current != null) {return true;}
				for (; index < computers.length; index++){
					current = computers[index];
					if (current != null) {
						index++;/*To avoid loop on the same object for next call*/
						return true;
					}
				}
				return false;
			}
			public Computer next(){
				if (!hasNext()){throw new NoSuchElementException();}
				Computer temp = current;
				current = null;
				return temp;
			}
		}
	}
	
	public static void main(String[] args) {
  		Computer c3 = new Computer(2012, "Acer", 4, DisplayType.HDMI);
  		Computer c5 = new Computer(2010, "Dell", 8, DisplayType.VGA);
  		Computer c7 = new Computer(2014, "LG", 2, DisplayType.DISPLAY_PORT);
  		VideoProjector video = new VideoProjector(2015, "Dell", DisplayType.VGA);
  		LabRoom room = new LabRoom(10);
  		room.setVideo(video);
  		room.setComputer(3,c3);
  		room.setComputer(5,c5); 
  		room.setComputer(7,c7);    
  		
  		Computer c5New = new Computer(2015, "Dell", 8, DisplayType.HDMI);
  		Computer old = room.setComputer(5, c5New);
  		System.out.println(old);       // prints "Computer Dell (2010), 8 core(s) [VGA]"
  		
  		Computer c7Bis = new Computer(2014, "LG", 2, DisplayType.DISPLAY_PORT);
  		// room.setComputer(8,c7Bis);  // this line must throw an exception
  		
  		VideoProjector videoBis = new VideoProjector(2015, "Dell", DisplayType.VGA);
  		// room.setVideo(videoBis);    // this line must throw an exception
  		System.out.println(room.equipmentsOfBrand("Dell"));
  		
  		/*for(Computer comp : room) {
  			System.out.println(comp);
  		}*/
  	}
}
