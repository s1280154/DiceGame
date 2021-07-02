public class DiceGame{
    public static void main(String[] args) throws Exception{
	int a,b,sum;
	a=(int)Math.floor(Math.random()*6+1);
	b=(int)Math.floor(Math.random()*6+1);
	sum=a+b;
	System.out.println("Rolling the dice...");
	System.out.println("Die1: "+a);
	System.out.println("Die2: "+b);
	System.out.println("Total value: "+sum);
    }
}
