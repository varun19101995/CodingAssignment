package Question2;

public class HourlyWorker extends Worker{
     void computePay(int hours)
     {
    	 int salary=0;
    	 if(hours<=40)
    	 {
    		 salary=hours*salaryRate;
    	 }
    	 if(hours>40)
    	 {
    		 int temp=hours-40;
    		 salary=3/2*temp*salaryRate+40*salaryRate;
    	 }
    	 System.out.println("Salary="+" "+salary);
     }
}
