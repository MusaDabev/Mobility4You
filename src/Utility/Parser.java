package Utility;

import models.Car;
import models.ElCar;
import models.GasCar;
import models.HybridCar;

public class Parser {
	
	public static Car getObjectFromRow(String row) {
		
		/*if(row.startsWith("ELECTRIC_CAR")) 
			createElCar(row);
		if(row.startsWith("GAS_CAR")) 
			createGasCar(row);
		if(row.startsWith("HYBRID_CAR"))
			createHybridCar(row);
		return null;*/
		
		int index = row.indexOf(" ");
		String keyWord = row.substring(0, index);
		switch(keyWord) {
		case "ELECTRIC_CAR" : return createElCar(row); 
		case "GAS_CAR" : return createGasCar(row); 
		case "HYBRID_CAR" : return createHybridCar(row); 
		default : return null;
		}
	}//end getObjectFromRow
	
	private static ElCar createElCar(String row) {
		String[] parts = row.split(", ");
		String brand = (parts[0].split(" "))[1];
		String model = parts[1];
		int power = Integer.parseInt(parts[2].replace("KW", ""));
		int capacity = Integer.parseInt(parts[3].replace("Ah", ""));
		int price = Integer.parseInt(parts[4].replace(" euro", ""));
		
		return new ElCar(brand, model, power, capacity, price);
	}
	
	private static GasCar createGasCar(String row) {
		String[] parts = row.split(", ");
		String brand = (parts[0].split(" "))[1];
		String model = parts[1];
		float engine = Float.parseFloat(parts[2].replace("L", ""));
		int power = Integer.parseInt(parts[3].replace("KW", ""));
		int price = Integer.parseInt(parts[4].replace(" euro", ""));
		
		return new GasCar(brand, model, engine, power, price);
	}
	
	private static HybridCar createHybridCar(String row) {
		String[] parts = row.split(", ");
		String brand = (parts[0].split(" "))[1];
		String model = parts[1];
		float engine = Float.parseFloat(parts[2].replace("L", ""));
		int power = Integer.parseInt(parts[3].replace("KW", ""));
		int capacity = Integer.parseInt(parts[4].replace("Ah", ""));
		int price = Integer.parseInt(parts[5].replace(" euro", ""));
		
		return new HybridCar(brand, model, engine, power, capacity, price);
	}

}//end Parser
