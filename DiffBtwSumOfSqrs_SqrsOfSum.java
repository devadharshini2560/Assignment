import java.util.Scanner;
public class DiffBtwSumOfSqrs_SqrsOfSum {
	 public static void main(String[] args) {
		 DiffBtwSumOfSqrs_SqrsOfSum s = new DiffBtwSumOfSqrs_SqrsOfSum();
		    s.diff();
		  }
		    void diff(){
		    int num,i,sum=0,sum1=0,result;
		    Scanner toscan = new Scanner(System.in);
		    System.out.println("Enter a limit: ");
		    num =toscan.nextInt();
		    for(i=1;i<=num;i++) {
		      sum = sum + i;
		    }
		    sum = sum * sum;
		    for(i=1;i<=num;i++) {
		      sum1 = (i*i) + sum1; 
		    }
		    result = sum -sum1;
		    System.out.println(result);
		  }
		}

