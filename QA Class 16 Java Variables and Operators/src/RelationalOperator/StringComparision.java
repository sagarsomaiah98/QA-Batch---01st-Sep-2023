package RelationalOperator;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String value1="Sam";
		String value2="Sam";
		String value3="SAM";
		
		System.out.println(value1==value2);//true
		System.out.println(value1.equals(value2));//true
		System.out.println(value1.equals(value3));//false
		System.out.println(value1.equalsIgnoreCase(value3));//true
				

	}

}
