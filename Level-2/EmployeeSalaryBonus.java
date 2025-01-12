import java.util.Scanner;

public class EmployeeSalaryBonus {
    public static void main(String[] args) {
		//creating a scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Create and initialization of array
	    
		double salary[] = new double[10];
		double bonusAmount[] = new double[10];
		double yearOfService[]=new double[10];
		double newSalary[] = new double[10];
		
		//create variables
		double totalBonus=0.0;
		double totalOldSalary=0.0;
        double totalNewSalary=0.0;
		
		//Take salary and yearOfService from user
	    for(int i=0; i<10 ;i++){
		if(salary[i]<0){
		    System.out.println("You entered invalid of employee "+(i+1)+" Please Enter Again!");
		}
		System.out.println("Enter Salary of employee "+(i+1));
		salary[i] = sc.nextInt();
		
		System.out.println("Enter Year of Service of employee "+(i+1));
		yearOfService[i] = sc.nextInt();
		}
		
		//Calculate bonus Amount , new salary ,totalOldSalary,totalNewSalary
		for(int i=0; i<10 ;i++){
		  if(yearOfService[i]>5){
			bonusAmount[i]= salary[i]*(0.05);
			}else{
			bonusAmount[i]= salary[i]*(0.02);
			}
			newSalary[i] = salary[i]+bonusAmount[i];
			totalOldSalary+= salary[i];
			totalNewSalary += newSalary[i];
			totalBonus += bonusAmount[i];
			
		}
		
		//Print the Total 
		System.out.println("Total bonus of employee is : "+totalBonus);
		System.out.println("Total Old Salary of employees is : "+totalOldSalary);
		System.out.println("Total New Salary of employees is : "+totalNewSalary);

		sc.close();
}
}