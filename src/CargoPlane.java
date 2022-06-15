public class CargoPlane implements AirVehicle{
	
	
	
	private int numberOfEngines;
	private int numberOfCrewMembers;
	private String nameOfPlane;
	private String manufacturerName;
	
	
	CargoPlane() {
		
		
	}
	
	CargoPlane(String nameOfPlane, int numberOfEngines, int numberOfCrewMembers, String manufacturerName) {
		
		this.numberOfEngines = numberOfEngines;
		this.numberOfCrewMembers = numberOfCrewMembers;
		this.nameOfPlane = nameOfPlane;
		this.manufacturerName = manufacturerName;
		
	}
	
	
	
	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public int getNumberOfCrewMembers() {
		return numberOfCrewMembers;
	}

	public String getNameOfPlane() {
		return nameOfPlane;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public void setNumberOfCrewMembers(int numberOfCrewMembers) {
		this.numberOfCrewMembers = numberOfCrewMembers;
	}

	public void setNameOfPlane(String nameOfPlane) {
		this.nameOfPlane = nameOfPlane;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	@Override
	
	public String toString() {
		
		return "Cargo Plane" + "[numEngines=" + numberOfEngines + ", numCrewMembers=" + numberOfCrewMembers + ", nameOfJet=" 
	        + nameOfPlane + ", manufacturer=" + manufacturerName + "] \n";
	
	}
	
	@Override
	
	public void avFly() {
		
		System.out.print( nameOfPlane + " has taken off and is now flying! \n" );

	}
	
	@Override
	
    public void avTakeoff() {
		
		System.out.print( nameOfPlane + " is starting the takeoff roll! \n" );
	}
	
	
	@Override
	
	public void avLand() {
		
		System.out.print( nameOfPlane + " has successfully landed! \n" );

	}

}