
public class Client {

	public static void main(String[] args) {
		Plane plane1 = new Boeing("1111", 1000, 200);
		Plane plane2 = new Concorde("2222", 2500, 100);
		Plane plane3 = new Mig("3333", 2000);
		Plane plane4 = new TomCat("4444", 1800);
		
		plane1.fly();
		plane1.land();
		plane1.takeOff();
	    ((Concorde)plane2).goSuperSonic();
	    System.out.println(plane2.getPlaneID() + " " + plane2.getTotalEnginePower());
	    ((Mig)plane3).highSpeedGeometry();

	}

}
