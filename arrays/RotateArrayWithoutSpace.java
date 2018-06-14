import java.util.Arrays;

public class RotateArrayWithoutSpace {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		int rotate = 2;

		int start = 0;
		int end = intArray.length-1;
		while(start<end){
			int temp = intArray[start];
			intArray[start] = intArray[end-rotate-1];
			intArray[end-rotate-1] = temp;
			start ++;
			end --;
		}
		
		Arrays.stream(intArray).forEach(System.out::println);
	}

}
