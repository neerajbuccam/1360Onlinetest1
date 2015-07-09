
public class Control_Unit {

	private static Control_Unit instance=null;
	public int total_votes;

	private Control_Unit() {
		total_votes = 0;
	}
	
	public static Control_Unit create_CU(){
		if(instance == null){
			instance = new Control_Unit();
			return instance;
		}
		else
			return instance;
	}
	
	public int getTotalVotes(){
		return total_votes;
	}
}
