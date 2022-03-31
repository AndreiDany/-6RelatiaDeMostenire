
public class FighterJets extends Plane {

	public FighterJets(String planeID, int totalEnginePower) {
		
		super(planeID, totalEnginePower);
		
	}
	
	public void launchMissile()
	{
		System.out.println("PlaneID Value\r\n"
				+ "\r\n"
				+ "- Initiating missile launch procedure - Acquiring target - Launching missile - Break-\r\n"
				+ "ing away - Missile launch complete");
	}
	
}
