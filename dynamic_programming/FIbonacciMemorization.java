public class FIbonacciMemorization {

	int MAX = 100;
	int NIL = -1;
	int lookup[] = new int[MAX];
	
	public void init(){
		for(int i=0;i<MAX;i++){
			lookup[i]=NIL;
		}
	}
	
	public int fibonacci(int n){
		if(lookup[n]==NIL){
			if(n<=1){
				lookup[n]=n;
			}else{
				lookup[n]=fibonacci(n-1)+fibonacci(n-2);
			}
		}
		return lookup[n];
	}
	
	public static void main(String[] args) {
		
		FIbonacciMemorization fib = new FIbonacciMemorization();
		fib.init();
		long start = System.nanoTime();
		System.out.println(fib.fibonacci(40));
		long end = System.nanoTime();
		System.out.println("Time taken:"+(end-start)/1e6);
	}

}
