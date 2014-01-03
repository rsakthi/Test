import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Test {
	
	public static void main(String args[]){
		Date dat = new Date();
		//Calendar cal = new GregorianCalendar();
		dat.setHours(5);
		System.out.println(dat.getHours());
		
		
	}
}
