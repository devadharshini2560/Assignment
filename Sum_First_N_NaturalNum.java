import java.util.Scanner;

public class Sum_First_N_NaturalNum {

	  public static void main(String[] args) {
	    
		  Sum_First_N_NaturalNum s = new Sum_First_N_NaturalNum();
	    s.sum();
	    
	  }
	        void sum(){
	        int sum=0,sum1 =0,result;
	        int index;
	        Scanner toscan = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int num = toscan.nextInt();
	        for(index=1;index<=num;index++) {
	        if(index % 3 == 0 || index % 5 ==0) {
	          sum = sum + index;
	        }
	        }
	        System.out.println(sum);
	      }
	}
