public class FibonacciTabulation {

	public int fibonacci(int n){
		int f[] = new int[n+1];
		f[0]=0;
		f[1]=1;
		
		for(int i=2;i<=n;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}
	
	public static void main(String[] args) {
		
		FibonacciTabulation fib = new FibonacciTabulation();
		long start = System.nanoTime();
		System.out.println(fib.fibonacci(40));
		long end = System.nanoTime();
		System.out.println("Time taken:"+(end-start)/1e6);
	}

}
