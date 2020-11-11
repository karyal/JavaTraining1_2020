package control_statements;

public class BeanchingStatements {
	
	public static void main(String[] args) {
		int stop_no2 = 0;
	       for(;;){
	           stop_no2 ++;
	           if (stop_no2==5)
	            continue;
	           if (stop_no2 > 10){
	               break;
	           }
	           else{
	               System.out.println(stop_no2);               
	           }               
	       }
	    
	    for (int i=1; i<=10; i++){
	        if (i == 5){
	            continue;
	        }
	        else{
	            System.out.println(i);
	        }
	    }
	}
}
