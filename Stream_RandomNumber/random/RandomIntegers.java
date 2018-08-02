package random;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomIntegers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int i = 0, num;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> listwithoutduplicacy = new ArrayList<>();
		
		//Creating file test
		PrintWriter out = new PrintWriter(new File("P:\\Users\\hguliya\\Documents\\hkg\\Assignment9\\src\\random\\test.txt"));
		Random rand = new Random();
		
		//Writing random numbers into file
		while (i != 100) {
			num = rand.nextInt(49) + 1;
			out.println(num);
			i++;
		}
		out.close();

		//fetching from file and adding t o list
		Scanner in = new Scanner(new File("P:\\Users\\hguliya\\Documents\\hkg\\Assignment9\\src\\random\\test.txt"));
		while (in.hasNext()) {
			int n = in.nextInt();
			list.add(n);
		}

		System.out.println("Eliminate duplicates");
		listwithoutduplicacy = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
		listwithoutduplicacy.stream().forEach(System.out::println);
		System.out.println("Sort the collection");
		listwithoutduplicacy.stream().sorted().forEach(System.out::println);
		in.close();
	}
}
