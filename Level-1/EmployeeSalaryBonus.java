import java.util.Scanner;

public class EmployeeSalaryBonus {
    public static void main(String[] args) {
		//creating a scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Taking inputs from user
		System.out.println("Enter a number ");
		int number=sc.nextInt();
	    
		double salary[] = new double[10];
		double bonusAmount[] = new double[10];
		double yearOfService[]=new double[n];
		double newSalary[] = new double[10];
		
		double totalBonus=0.0;
		double totalOldSalary ;
        double totalNewSalary;
		
		int index=0;
	    for(int i=0; i<10 ;i++){
		if(salary<0){
		    System.out.println("You entered invalid of employee "+(i+1)+" Please Enter Again!");
		}
		System.out.println("Enter Salary of employee "+(i+1));
		salary[i] = sc.nextInt();
		
		System.out.println("Enter Year of Service of employee "+(i+1));
		yearOfService[i] = sc.nextInt();
		}
		
		//Calculate bonus Amount
		for(int i=0; i<10 ;i++){
		  if(yearOfService[i]>=5){
			bonusAmount[i]= salary*(5/100);
			}else{
			bonusAmount[i]= salary*(2/100);
			}
			newSalary[i] = salary[i]+bonusAmount[i];
			totalOldSalary+= salary[i];
			totalNewSalary += newSalary[i];
			totalBonus+= bonusAmount[i];
			
		}
		
		//Compute the new Salary
		System.out.println("Total bonus of employee is : "+totalBonus);
		System.out.println("Total Old Salary of employees is : "+totalOldSalary);
		System.out.println("Total New Salary of employees is : "+totalNewSalary);

		sc.close();
}
}