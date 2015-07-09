
public class Balloting_Unit {

	public Button []Blue_button;
	public String []Party;
	
	public Balloting_Unit(int btn) {
		Blue_button = new Button[btn];
		Party = new String[btn];
		
		set_Buttons(btn);
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
