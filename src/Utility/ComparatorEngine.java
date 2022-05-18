package Utility;

import java.util.Comparator;

import models.Car;

public class ComparatorEngine implements Comparator<Car>{

	@Override
	public int compare(Car arg0, Car arg1) {
		if(arg0.getPowerEngine() > arg1.getPowerEngine())
			return 1;
		if(arg0.getPowerEngine() < arg1.getPowerEngine())
			return -1;
		return 0;
	}

}
