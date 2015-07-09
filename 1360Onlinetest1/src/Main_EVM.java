
public class Main_EVM {

	public static void main(String[] args) {

		Control_Unit CU = Control_Unit.create_CU(5);
		Balloting_Unit BU = Balloting_Unit.create_BU(CU.ballot_buttons);

		Voter v1 = new Voter(1,5);
		Voter v2 = new Voter(2,5);
		Voter v3 = new Voter(1,5);
		Voter v4 = new Voter(0,5);
		Voter v5 = new Voter(2,5);

		
		//	Voting is Over
		BU.closePoll();
		Voter v6 = new Voter(0,5);
		Voter v7 = new Voter(1,5);
		
		
		
		//	Display Party wise Votes
		System.out.println();
		for(int i=0; i<3; i++)
			System.out.println("Party "+(i+1)+" Votes ::: "+BU.Party[i]+": "+BU.Blue_button[i].party_vote);
		//	Display Total Votes
		System.out.println("\nTotal Votes: "+CU.getTotalVotes());
		
		
		
		
		//	RESET COUNTERS
		CU.resetCounters();
		System.out.println("\n::: AFTER COUNTER RESET :::");
		//	Display Party wise Votes
		for(int i=0; i<3; i++)
			System.out.println("Party "+(i+1)+" Votes ::: "+BU.Party[i]+": "+BU.Blue_button[i].party_vote);
		//	Display Total Votes
		System.out.println("\nTotal Votes: "+CU.getTotalVotes());
		
	}

}
