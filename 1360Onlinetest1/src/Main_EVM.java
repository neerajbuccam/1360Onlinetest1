
public class Main_EVM {

	public static void main(String[] args) {

		Control_Unit CU = Control_Unit.create_CU();
		Balloting_Unit BU = Balloting_Unit.create_BU(5);

		Voter v1 = new Voter(1,5);
		Voter v2 = new Voter(2,5);
		Voter v3 = new Voter(1,5);
		Voter v4 = new Voter(0,5);
		Voter v5 = new Voter(2,5);

		for(int i=0; i<3; i++){
			System.out.println("\nParty "+(i+1)+" Votes ::: "+BU.Party[i]+": "+BU.Blue_button[i].party_vote);
		}
		
		System.out.println("\nTotal Votes: "+CU.getTotalVotes());
		
	}

}
