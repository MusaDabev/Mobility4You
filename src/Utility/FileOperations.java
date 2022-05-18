package Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

import catalogues.Catalogue;
import models.Car;

public class FileOperations {
	
	//BufferedReader, BufferWritter .. FileReader, FileWritter
	
	public static ArrayList<String> readFileByRow(String path){
		
		ArrayList<String> rows = new ArrayList<>();
		
		try(BufferedReader br = Files.newBufferedReader(Paths.get(path))){
			
			rows = (ArrayList<String>) br.lines().collect(Collectors.toList()); //Stream
			
		} catch (IOException e) {
			e.printStackTrace();
		}//end try/catch
		return rows;		
	}//end readFileByRow
	
	public static void writeCatalogueToFile(Catalogue catalogue,String path) {
		
		try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(path))){  //c:\\output.txt
			
			for(Car car : catalogue.getList()) {
				bw.write(car.toString());
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// end try/catch
		
	}//end write to file 
	
}//end class
