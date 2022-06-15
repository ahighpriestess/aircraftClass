import java.util.Scanner;

public class AirVehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		Scanner keyword = new Scanner(System.in);
		
		
		FighterJet jetType = new FighterJet();
		

		System.out.println("##############################################");
		System.out.println("######     PLANE INFORMATION CENTER     ######");
		System.out.println("##############################################");
		System.out.println();
		System.out.println();
		System.out.println("Enter the name of FighterJet: ");
		String jet = keyword.nextLine();
		
		System.out.println("Enter the number of engines on FighterJet: ");
		int jetEngines = input.nextInt();
		
		System.out.println("Enter number of crew members on FighterJet: ");
		int jetCrew = input.nextInt();
		
		System.out.println("Enter the name of the manufacturer of FighterJet: ");
		String jetManufacturer = keyword.nextLine();
		
		System.out.println("Enter name of CargoPlane: ");
		String plane = keyword.nextLine();
		
		System.out.println("Enter the number of engines on the CargoPlane: ");
		int planeEngines = input.nextInt();
		
		System.out.println("Enter number of crew members on the CargoPlane: ");
		int planeCrew = input.nextInt();
		
		System.out.println("Enter the name of the manufacturer of CargoPlane: ");
		String planeManufacturer = keyword.nextLine();
		
		
		jetType.setNameOfJet(jet);
		jetType.setNumberOfEngines(jetEngines);
		jetType.setNumberOfCrewMembers(jetCrew);
		jetType.setManufacturerName(jetManufacturer);
		
		
		CargoPlane planeType = new CargoPlane((plane), (planeEngines), (planeCrew), (planeManufacturer)); 
		
		
		System.out.println(" ");
		System.out.println("###############################################");
		System.out.println("###########     FIGHTERJET INFO     ###########");
		System.out.println("###############################################");
		System.out.println(" ");
		System.out.println(jetType.toString());
		jetType.avTakeoff();
		jetType.avFly();
		jetType.breakSoundBarrier();
		jetType.avLand();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("###############################################");
		System.out.println("###########     CARGOPLANE INFO     ###########");
		System.out.println("###############################################");
		System.out.println();
		System.out.println(planeType.toString());
		planeType.avTakeoff();
		planeType.avFly();
		planeType.avLand();
		System.out.println();
		System.out.println();
		

	}

}