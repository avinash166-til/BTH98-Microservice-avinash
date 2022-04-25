/*   4. WAP to calculate employees bonus based on his designation by below rule
Manager --> 30%
Lead --> 25%
Associate --> 20%
create employee class with id, name ,salary and commission parameters
bonus will be salary + commision
Follow oops   */

package THBS.JAVAPRG;

class Employee1{
	private String name;
	private int id;
	private int salary;
	private int commision;
	private String Design;
	Employee1( String name,	int id,	int salary,	int commision,String Design)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.commision=commision;
		this.Design=Design;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommision() {
		return commision;
	}
	public void setCommision(int commision) {
		this.commision = commision;
	}
	public String getDesign()
	{
		return Design;
	}
	
	public void setDesign(String Design)
	{
		this.Design=Design;
	}
}


public class EmployeeBonus {
	
	public static void empBonus(Employee1[] emp)
	{
		for(int i=0;i<=emp.length-1;i++)
		{
		//System.out.println(emp[i].getId());
		
			if(emp[i].getDesign()=="Manager")
			{
				int a=emp[i].getSalary()+emp[i].getCommision();
				int b=a/100*30+a;
				System.out.println("Manager: "+ b);
				
			}
			
			else if(emp[i].getDesign()=="Associate")
			{
				int a=emp[i].getSalary()+emp[i].getCommision();
				int b=a/100*20+a;
				System.out.println("Associate: "+ b);
			}
			
			else if(emp[i].getDesign()=="Lead")
			{
				int a=emp[i].getSalary()+emp[i].getCommision();
				int b=a/100*25+a;
				System.out.println("Lead: "+ b);
			}
		
		
		}
		
	}

	public static void main(String[] args) {
		Employee1 emp1=new Employee1("ravi",11,1000,100,"Associate");
		Employee1 emp2=new Employee1("kavi",12,1000,100,"Lead");
		Employee1 emp3=new Employee1("mavi",13,1000,100,"Manager");
		
		
		Employee1[] em= {emp1,emp2,emp3};
		empBonus(em);
		//System.out.println(em[1]);
	
		
	}

}
