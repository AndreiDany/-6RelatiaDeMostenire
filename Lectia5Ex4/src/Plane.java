
public class Plane {
	private String planeID;
	private int totalEnginePower;
	
	public Plane(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}

	public String getPlaneID()
	{
		return planeID;
	}
	
	public int getTotalEnginePower()
	{
		return totalEnginePower;
	}
	
	public void takeOff()
	{
		System.out.println("PlaneID Value - Initiating takeoff procedure - Starting engines - Accelerating down\r\n"
				+ "the runway - Taking off - Retracting gear - Takeoff complete");
	}
	
	public void land()
	{
		System.out.println("PlaneID Value - Flying");
	}
	
	public void fly()
	{
		System.out.println("PlaneID Value - Initiating landing procedure - Enabling airbrakes -\r\n"
				+ "Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing\r\n"
				+ "complete");
	}
} 
