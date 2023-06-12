package objectOrientedProgramming;

import java.util.Scanner;

public class App {

	static Logger logger;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input word: ");
		String word = sc.nextLine();
		
		Logger logger1 = new AsteriskLogger();
		
		logger1.Log(word);
		logger1.Error(word);
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log(word);
		logger2.Error(word);
	}

}
