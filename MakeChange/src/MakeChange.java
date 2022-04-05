import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MakeChange {

	public static void main(String[] args) throws Exception {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String input = reader.readLine();

	    double number = Double.parseDouble(input);

	    System.out.println(input + ":" + Math.sqrt(number));

	    reader.close();
	    
	  }
	
}
	
	