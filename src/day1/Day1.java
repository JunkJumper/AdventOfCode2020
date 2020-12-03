package day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		try {
			File f = new File("input/day1.txt");
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				list.add(Integer.parseInt(data));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		for (int i = 0; i < list.size(); ++i) {
			for (int j = 0; j < list.size(); ++j) {
				if((list.get(i) + list.get(j)) == 2020) {
					System.out.println(list.get(i) + "*" + list.get(j) + "=" + list.get(i)*list.get(j));
					
				}
			}
		}
		
		
		
		
	}
}


