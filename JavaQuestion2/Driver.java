package Question2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyWorker ob=new HourlyWorker();
		ob.salaryRate=1000;
		ob.computePay(4);
		SalariedWorker ob1=new SalariedWorker();
		ob1.salaryRate=200;
		ob1.computePay(10);

	}

}
