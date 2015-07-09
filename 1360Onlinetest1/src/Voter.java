
public class Voter {
	
	public int button_pressed=0;
	public String party_choosen; 

	Balloting_Unit BU;
	
	public Voter(int btn, int ballot_btns) {
		BU = Balloting_Unit.create_BU(ballot_btns);
		button_pressed = btn;
		party_choosen = BU.Party[btn];
		cast_vote(btn);
	}
	
	public int cast_vote(int btn){
		try{
			BU.Blue_button[btn].cast_vote();
			return 0;
		}
		catch(Exception e){
			return 1;
		}
		
	}
}
