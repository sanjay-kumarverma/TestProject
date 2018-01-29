package lambda;

@FunctionalInterface
interface hello {
	public void sayHello();
}

 public abstract class TestLambda implements hello{

	public static void main(String[] args) {
		
		hello h = () -> System.out.println("Hello world"); 
		h.sayHello();
	}

}
