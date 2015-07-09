
public class Main_EVM {

	public static void main(String[] args) {

		Control_Unit CU = Control_Unit.create_CU();
		Balloting_Unit BU = new Balloting_Unit(3);

		BU.Blue_button[1].cast_vote();
		BU.Blue_button[1].cast_vote();
		BU.Blue_button[0].cast_vote();

		System.out.println("Total Votes: "+CU.total_votes);
		for(int i=0; i<3; i++){
			System.out.println("Party "+(i+1)+" Votes ::: "+BU.Party[i]+": "+BU.Blue_button[i].party_vote);
		}
	}

}
