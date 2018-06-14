public class FibonacciRecursion {

	public int fibonacci(int n){
		if(n<=1){
			return n;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		FibonacciRecursion fib = new FibonacciRecursion();
		long start = System.nanoTime();
		System.out.println(fib.fibonacci(40));
		long end = System.nanoTime();
		System.out.println("Time taken:"+(end-start)/1e6);
	}

}
