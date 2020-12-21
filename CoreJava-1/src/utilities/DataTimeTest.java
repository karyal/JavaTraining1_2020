package utilities;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DataTimeTest {
	public static void main(String[] args) {	
		
		//Date
		Date date1 = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateFormat.format(date1));

		//Calendar		
		Calendar cal = Calendar.getInstance();	    
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateFormat1.format(cal.getTime()));

		//Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		//Numbers to Date
		LocalDate localDate1 = LocalDate.of(2020, 12, 21);
		System.out.println(localDate1);

		LocalDate localDate2 = LocalDate.parse(localDate1.toString());
		System.out.println(localDate2);
		
		//Local DateTime
		LocalDateTime localDateTime= LocalDateTime.now();		
		System.out.println(localDateTime);
		
		//TimeStamp
		Date date2 = new Date();  
        Timestamp ts1=new Timestamp(date2.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(ts1+" -> "+formatter.format(ts1));   
        
        //Task
        // Calculate the diffrence of two dates        
	}
}