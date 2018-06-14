import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6};
		int[] tempArray = new int[intArray.length];
		int n=3;
		for(int i=0;i<intArray.length-n;i++){
			tempArray[i] = intArray[i+n];
		}
		int count = n-1;
		for(int j=tempArray.length-1;j>=tempArray.length-n;j--){
			tempArray[j] = intArray[count--];
		}
		Arrays.stream(tempArray).forEach(System.out::println);
	}

}
