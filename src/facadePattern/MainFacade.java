package facadePattern;

public class MainFacade {

	public static void main(String[] args) {

		DeparturePlane plane1 = new DeparturePlane();

		plane1.readyForTheTakeOff();
		System.out.println("\n");
		plane1.performCheck();
		plane1.tankFuel();
		plane1.cleanPlane();
		plane1.readyForTheTakeOff();
		
		
		DeparturePlane plane2 = new DeparturePlane();
		plane2.readyForTheTakeOff();
		System.out.println("Using facade: ");
		PlaneFacade facade = new PlaneFacade();
		facade.preparePlane(plane2);

	}
}
