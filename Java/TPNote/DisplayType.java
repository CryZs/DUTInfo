public enum DisplayType{
	DISPLAY_PORT(false),
	DVI(false),
	HDMI(false),
	VGA(false);
	private boolean type;
	
	private DisplayType(boolean type){
		this.type = type;
	}
	private boolean isType(){
		return type;
	}
	
}
