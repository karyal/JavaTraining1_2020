package utilities;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberTest {
	public static void main(String[] args) {
		
		Random rand = new Random(); 
		System.out.println(rand.nextInt(100)); //0-99
		
		System.out.println(Math.random());
		
		System.out.println(ThreadLocalRandom.current().nextInt());
	}
}
