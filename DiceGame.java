import java.util.Scanner;
public class DiceGame{
    public static void main(String[] args) throws Exception{
	int a,b,sum;
	a=(int)Math.floor(Math.random()*6+1);
	b=(int)Math.floor(Math.random()*6+1);
	sum=a+b;
	Scanner scanner=new Scanner(System.in);
	System.out.println("What is your name?");
	String name=scanner.next();
	System.out.println("Hello, "+name+"!");
	System.out.println("Rolling the dice...");
	System.out.println("Die1: "+a);
	System.out.println("Die2: "+b);
	System.out.println("Total value: "+sum);
	if(sum>7){
	    System.out.println(name+" won");
	}
	else{
	    System.out.println(name+" lost");
	}
    }
}
