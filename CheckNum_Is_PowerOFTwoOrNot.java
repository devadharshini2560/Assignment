import java.util.Scanner;
	public class CheckNum_Is_PowerOFTwoOrNot {
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  if(number != 0 && (Math.ceil((Math.log(number) / Math.log(2)))) == (Math.floor((Math.log(number) / Math.log(2))))) {
	   System.out.println("The given number is a power of 2");
	  }
	  else {
	   System.out.println("the given number is not a power of 2");
	  }
	 }
	}


