package facadePattern;

public class PlaneFacade {
	
	public void preparePlane(DeparturePlane plane) {
		
		plane.performCheck();
		plane.tankFuel();
		plane.cleanPlane();
		plane.readyForTheTakeOff();
	}

}
