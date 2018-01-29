package lambda;

@FunctionalInterface
interface LenInterface {
	public int getLength(String str);
}

public class TestLambda2 {
	
	public static void main(String[] args) {
		LenInterface l = str -> str.length(); 
		System.out.println(l.getLength("hello how are you"));
		
	}

}
