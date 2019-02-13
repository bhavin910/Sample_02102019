package day2;

public class BasicJava {

	public static void main(String[] args) {
		
	//Preimitive Data Types	(pre-defined in java. Thats why you will see color change when initialize this variables)
		//Integer data type 4 byte
		int myVar;
		myVar=1000;
		System.out.println("value is:"+myVar);
		
		int num2;
		num2=500;
		
		System.out.println("Result:" + myVar + num2);//concatinate
		
		int sum = myVar + num2;//sum
		System.out.println("sum: "+sum);
		
		//Long data type 8 byte
		long numLong = 123234647543554l;//data type long--> add l in the end
		
		//Char Data type 2 bytes
		char charVar = 'a';// char
		
		//Double data type 8 bytes
		double doubleVar = 90.8976;
		
		//Float Data type 4 bytes
		float floatVar = 89.3645f;// add f in the end
		
		//Boolean Data Type
		boolean flag = false;// it can have either "true" or "false" as its value
		
	//Non-Primitive Data Types (coming from JRE library somewhere and not predefined in java. You will mark no color change here)
		
		String str = "This is test";
	}
	
}
