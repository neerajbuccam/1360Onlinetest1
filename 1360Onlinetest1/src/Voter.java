
public class Voter {
	
	public int button_pressed=0;
	public String party_choosen; 

	Balloting_Unit BU;
	
	public Voter(int btn, int ballot_btns) {
		BU = Balloting_Unit.create_BU(ballot_btns);
		button_pressed = btn;
		party_choosen = BU.Party[btn];
		cast_vote(btn, ballot_btns);
	}
	
	public int cast_vote(int btn, int ballot_btns){
		try{
			if(BU.close_btn_pressed == false){
				BU.Blue_button[btn].cast_vote(ballot_btns);
				System.out.println("We received your Vote");
				return 0;
			}
			else{
				System.out.println("Voting closed!");
				return 1;
			}
		}
		catch(Exception e){
			return 1;
		}
		
	}
}
