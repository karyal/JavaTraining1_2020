package exceptions;

class MyException extends Exception {
	private String str1;
	public MyException(String str1) {
		this.str1=str1;
	}
	@Override
	public String toString() {
		return("Error : "+this.str1);
	}
}

public class UserDefinedExceptions {
	public static void main(String[] args) {
		int n=15;
		try {
			if (n<1) {
				throw new MyException("Range of value is low");
			}
			else if (n>20) {
				throw new MyException("Range of value is high");
			}
			else {
				System.out.println("Range of value is normal");
			}			
		}
		catch(MyException mex) {
			System.out.println(mex);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
