
public class Control_Unit {

	private static Control_Unit instance=null;
	public int ballot_buttons;
	public int total_votes;

	private Control_Unit(int btns) {
		total_votes = 0;
		ballot_buttons = btns;
		System.out.println("\nVoting Started...");
	}
	
	public static Control_Unit create_CU(int btns){
		if(instance == null){
			instance = new Control_Unit(btns);
			return instance;
		}
		else
			return instance;
	}
	
	public int getTotalVotes(){
		return total_votes;
	}

	public void resetCounters() {
		total_votes = 0;
		
		Balloting_Unit BU = Balloting_Unit.create_BU(ballot_buttons);
		
		for(int i=0; i<ballot_buttons; i++){
			BU.Blue_button[i].party_vote = 0;	
		}
		
	}
}
