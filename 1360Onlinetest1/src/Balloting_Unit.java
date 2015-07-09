
public class Balloting_Unit {

	private static Balloting_Unit instance=null;
	public Button []Blue_button;
	public String []Party;
	public boolean close_btn_pressed=false;
	
	private Balloting_Unit(int btn) {
		Blue_button = new Button[btn];
		Party = new String[btn];
		
		set_Buttons(btn);
	}
	public static Balloting_Unit create_BU(int btn){
		if(instance == null){
			instance = new Balloting_Unit(btn);
			return instance;
		}
		else
			return instance;
	}
	
	public int closePoll(){
		close_btn_pressed = true;
		return 0;
	}

	private void set_Buttons(int btn) {

		Party[0] = "BJP";
		Party[1] = "Congress";
		Party[2] = "Other";
		
		for(int i=0; i<btn; i++){
			Blue_button[i] = new Button();
		}
	}
}
