public class TestClass {

	
	public static int addInts(int[] intArray){
		int result = 0;
		for (int i = 0; i < intArray.length; i++){
			result += intArray[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println("Hello World!");
		int[] ia = {1, 2, 3};
		System.out.println(addInts(ia));

	//what's up here's a comment
	}




}
