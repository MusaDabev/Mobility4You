package models;

public class GasCar extends Car{

	private float engineDisplacement;
	private final String KEYWORD = "GAS_CAR";
	
	public GasCar(String b, String m, float enDis, int pow, int pr) {
		super(b, m, pow, pr);
		this.engineDisplacement = enDis;
	}
	
	public String toString() {
		String middleWord = this.engineDisplacement + "L" + ", " + this.getPowerEngine() + "KW";
		return super.printBaseCar(KEYWORD, middleWord);
	}

	public float getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(float engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
}
