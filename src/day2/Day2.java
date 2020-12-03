package day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		List<Record> list = new ArrayList<>();
		List<Record> validRecord = new ArrayList<>();
		try {
			File f = new File("input/day2.txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				list.add(new Record(data.charAt(0), data.charAt(2), data.charAt(4), data.substring(6)));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println(list);
		
		for (Record record : list) {
			if(record.isValid()) {
				validRecord.add(record);
			}
		}
		
		System.out.println(validRecord.size());
		
	}
}


