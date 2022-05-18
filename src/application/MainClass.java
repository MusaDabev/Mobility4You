package application;

import java.util.ArrayList;

import Utility.FileOperations;
import catalogues.Catalogue;
import gui.MyFrame;

public class MainClass {

	public static void main(String[] args) {
		/*ArrayList<String> list = FileOperations.readFileByRow("C:\\Users\\vlado\\Desktop\\mobillity.txt");
		
		Catalogue cat = new Catalogue();
		cat.loadFromFile("C:\\Users\\vlado\\Desktop\\mobillity.txt");
		cat.sortByBrand();
		cat.printCatalogue();
		FileOperations.writeCatalogueToFile(cat,"C:\\Users\\vlado\\Desktop\\output.txt" );*/
		
		//Comparable (String)  ->    o1.compareTo(o2)    public int compareTo(Object o)
		//Comparator 	->   compare(o1, o2)     public int compare(o1, o2)
		// o1.price > o2.price return +1;   < return -1 ;   equal return 0 
		
		MyFrame myFrame = new MyFrame();
		
	}

}
