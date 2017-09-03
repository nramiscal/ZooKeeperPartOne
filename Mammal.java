
public class Mammal {
	int energyLevel = 100;

	// getter
	public int getEnergy(){
		// System.out.println("Energy level: " + energyLevel);
		return energyLevel;
	}

	// setter
	public void setEnergy(int energy){
		energyLevel = energy;
		System.out.println("Energy level: " + energyLevel);
	}
}
