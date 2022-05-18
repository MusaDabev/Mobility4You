package models;

public class HybridCar extends Car{

	private float engineDisplacement;
	private int capacity;
	private final String KEYWORD = "HYBRID_CAR";
	
	public HybridCar(String b, String m,float eng, int pow,int cap, int pr) {
		super(b, m, pow, pr);
		this.engineDisplacement = eng;
		this.capacity = cap;
	}
	
	public String toString() {
		String middleWord = this.engineDisplacement + "L, " + getPowerEngine() + "KW, "
				+ this.capacity + "Ah";
		return super.printBaseCar(KEYWORD, middleWord);
	}

	public float getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(float engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
