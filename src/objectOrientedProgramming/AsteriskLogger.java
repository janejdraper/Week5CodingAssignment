package objectOrientedProgramming;

public class AsteriskLogger implements Logger{

	
	
	@Override
	public void Log(String log) {
		System.out.println("\n***" + log + "***\n");
		
	}

	@Override
	public void Error(String error) {
		for (int i=0; i<error.length(); i++) {
			System.out.print("*");
		}
		System.out.println("*************\r\n"
				+ "***Error: " + error + "***");
		for (int i=0; i<error.length(); i++) {
			System.out.print("*");
		}
		System.out.println("*************\r\n");
	}
}
