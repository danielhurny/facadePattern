package facadePattern;

public class DeparturePlane {
	
	private int fuel = 0;
	private boolean checkDone = false;
	private boolean hasBeenCleaned = false;
	
	
	
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public boolean isCheckDone() {
		return checkDone;
	}
	public void setCheckDone(boolean checkDone) {
		this.checkDone = checkDone;
	}
	public boolean isHasBeenCleaned() {
		return hasBeenCleaned;
	}
	public void setHasBeenCleaned(boolean hasBeenCleaned) {
		this.hasBeenCleaned = hasBeenCleaned;
	}
	
	
	public void  performCheck() {
		checkDone = true;
		System.out.println("Check has been done");
	}
	public void tankFuel() {
		fuel = 100;
		System.out.println("Tank is full");
	}
	public void cleanPlane() {
		if(checkDone==true&fuel>50){
			hasBeenCleaned = true;
			System.out.println("Plane is clean");
		return;}
		System.out.println("Please fill tank and perform checks before cleaning!!!");
	}
	
	public void readyForTheTakeOff() {
		System.out.println("Plane ready for the takeOff: "+((checkDone==true&hasBeenCleaned==true&fuel>50)? "true":"false"));
	}
	
	

}
