
public class Unchecked_Demo {

	public static void main(String[] args) {
		
		int num[] = {1, 2, 3, 4};
try {
	System.out.println(num[10]);
}catch(Exception e) {
	System.out.println("this happen because of out of bound");
	
}
System.out.println("DataBase connection");
System.out.println("Sending email");
	}

}
