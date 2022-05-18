package catalogues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Utility.ComparatorEngine;
import Utility.FileOperations;
import Utility.Parser;
import models.Car;

public class Catalogue {
	
	private ArrayList<Car> list = new ArrayList<>();
	
	public void loadFromFile(String path) {
		ArrayList<String> rows = FileOperations.readFileByRow(path);
		for(int i = 1; i < rows.size() + 1; i++) {
			Car car = Parser.getObjectFromRow(rows.get(i-1));
			if(car != null) {
				list.add(car);
			}else {
				System.out.println("No car type is recognize at row: " + i);
			}
		}//end for
		System.out.println("Objects loaded from file: " + list.size());
	}//end loadFromFile
	
	public void addCar(Car car) {
		list.add(car);
	}
	
	public void printCatalogue() {
		for(Car car : list) {
			System.out.println(car);
		}
	}
	
	public void sortByBrand() {
		Comparator<Car> byBrand = (Car car1, Car car2) -> car1.getBrand().compareTo(car2.getBrand());
		list.sort(byBrand);
		//Collections.sort(list);  // Comparable -> compateTo -> Car by power of engine
		//Collections.sort(list, new ComparatorEngine());  //Comparator - > compare -> ComparatorEngine
	}
	
	public void sortByCarType() {
		Comparator<Car> byCarType = (Car car1, Car car2) 
				-> car1.getClass().getSimpleName().compareTo(car2.getClass().getSimpleName());
		list.sort(byCarType);
	}

	public ArrayList<Car> getList() {
		return list;
	}
	

}//end class
