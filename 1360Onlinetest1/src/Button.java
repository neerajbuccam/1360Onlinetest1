
public class Button {
	
	public int party_vote=0;
	
	public Button() {
		// TODO Auto-generated constructor stub
	}
	
	public int cast_vote(int ballot_btns){
		try{
			party_vote++;
			Control_Unit CU = Control_Unit.create_CU(ballot_btns);
			CU.total_votes++;
			return 0;
		}
		catch(Exception e){
			return 1;
		}
		
	}
	
}
