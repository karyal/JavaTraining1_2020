package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	public static void main(String[] args) {
		
		String inputStr = "This is an apple. These are 33 (thirty-three) apples.";
		String regexStr = "Th";
		Pattern pattern = Pattern.compile(regexStr);
		Matcher matcher = pattern.matcher(inputStr);
		
		/*
		System.out.println("Find");
		while(matcher.find()) {
			System.out.println(matcher.group()+", "+matcher.start()+", "+matcher.end());
		}
		*/
		
		String input = "This is Chaitanya from Beginnersbook.com.";
		String regex = ".*book.*";
		boolean isMatch =Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Matching any of a character
		//Any Character
		input = "1";
		regex = ".";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//A Digit
		input = "1";
		regex = "\\d";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		input = "1";
		regex = "[0-9]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//A Non Digit
		input = "g";
		regex = "\\D";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		input = "g";
		regex = "[^0-9]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//A-Z Only		
		input = "G";
		regex = "[a-zA-Z]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		// White Space Character
		input = " ";
		regex = "\\s";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		input = " ";
		regex = "[ \t\n\f\r\0B]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Non White Space Character
		input = "n";
		regex = "\\S";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		input = "n";
		regex = "[^\\s]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Word
		input = "N";
		regex = "\\w";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		input = "N";
		regex = "[a-zA-Z_0-9]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);

		//Non Word
		input = " ";
		regex = "\\W";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		input = " ";
		regex = "[^\\w]";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);	
		
		//Non-Digit Word
		input = "klj";
		regex = ".*[^0-9].*";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Six Digits
		input = "123458";
		regex = "\\d{6}";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Only Digit
		input = "123";
		regex = ".*[0-9].*";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);		

		//Email Address
		input = "info@gmail.com";
		regex = "^(.+)@(.+)$";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Email Address-2
		input = "info@gmail.com";
		regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);
		
		//Email Address-2
		input = "info@gmail.com";
		regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		isMatch = Pattern.matches(regex, input);
		System.out.println(isMatch);	
		
		// Mobile Number
		// Land Line Number
		// Mobile Number
		// Bank Account Number
		// Social Security No		
	}
}