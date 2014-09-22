public class Test {
	Test(int a , int b){
		System.out.println( a > b ? a : b );
		System.out.println("csdjbids");
		}
	
	void max( double a, double b )
	{
		System.out.println("floatÐÍ" +      ( a > b ? a : b) );
		
		}
	void max(int a, int b){
		System.out.println( a > b ? a : b );
		}
	
	
public static void main(String[] args){
	
	Test t = new Test(4,5);
	
	t.max(4.0,5.1);
	
}
	}	