import java.util.Date;

public class DumpTest {

	DumpArray array = new DumpArray();
	
	public static void main(String []args){
	Object[] array = new Object[3];
	
	array[1] = 10.3;
	array[0] = new Date();
	array[2] = "Hello World!";
	DumpArray arrayTest = new DumpArray();
	arrayTest.dumpArray(array);
	
	
	}
	
	
}
