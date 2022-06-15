public class FighterJet implements AirVehicle, SoundBarrier{
	
	private int numberOfEngines;
	private int numberOfCrewMembers;
	private String nameOfJet;
	private String manufacturerName;
	
	public FighterJet() {
		
		
	}
	
	public FighterJet(int numberOfEngines, int numberOfCrewMembers, String nameOfJet, String manufacturerName) {
		
		this.numberOfEngines = numberOfEngines;
		this.numberOfCrewMembers = numberOfCrewMembers;
		this.nameOfJet = nameOfJet;
		this.manufacturerName = manufacturerName;
		
		
		
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public int getNumberOfCrewMembers() {
		return numberOfCrewMembers;
	}

	public String getNameOfJet() {
		return nameOfJet;
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

	public void setNameOfJet(String nameOfJet) {
		this.nameOfJet = nameOfJet;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	@Override
	
	public void breakSoundBarrier() {
		
		// breaksoundBarrier() is only for FighterJet.java and not for CargoPlane.java .
		
		System.out.println( nameOfJet + " has broken the sound barrier!!!");

	}
	
	@Override
	
	public String toString() {
		return "Fighter Jet [numEngines=" + numberOfEngines + ", numCrewMembers=" + numberOfCrewMembers + ", nameOfJet=" 
			  + nameOfJet + ", manufacturer=" + manufacturerName + "] \n";
	}
	
	@Override
	
    public void avTakeoff() {
		
		System.out.print( nameOfJet + " is starting the takeoff roll! \n");
	
	}
	
	@Override
	
	public void avLand() {
		
		System.out.print( nameOfJet + " has successfully landed! \n");

	}
	
	
	
	@Override
	
	public void avFly() {
		
		System.out.print( nameOfJet + " has taken off and is now flying! \n");

	}
	


}