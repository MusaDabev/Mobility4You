package models;

public class ElCar extends Car{

	private int capacity;
	private final String KEYWORD = "ELECTRIC_CAR";
	
	public ElCar(String b, String m, int pow,int cap, int pr) {
		super(b, m, pow, pr);
		this.capacity = cap;
	}
	
	public String toString() {
		String middleWord = this.getPowerEngine() + "KW" + ", " + this.capacity + "Ah";
		return super.printBaseCar(KEYWORD, middleWord);
	}
	
	public String getKeyWord() {
		return KEYWORD;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
