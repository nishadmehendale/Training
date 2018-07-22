
public class Employee {
	private int Id;
	private String name;
	private double monthlyBasic;
	private float PF = 01.f;
	private double ESIC;
	private double hra;
	private double medical = 1250;
	private double conveyance = 800;
	private double profTax;
	
	
	public double getAnnualBasic() {
		//(return 12 * monthlyBasic;)
		return 12 * monthlyBasic;
	}
	public double getMonthlyGrossSalary() {
		//(monthlyBasic + hra + medical + conveyance)
		return (monthlyBasic + hra + medical + conveyance);
	}
	public double getAnnualGrossSalary() {
		//(12 * MonthlyGrossSalary)
		return 12 * getMonthlyGrossSalary();
		
	}
	public double getMonthlyDeductions() {
		//(pf + esic + profTax)
		return (double)(PF + ESIC + profTax);
	}
	public double getMonthlyTakeHome() {
		//(MonthlyGrossSalary- MonthlyDeductions)
		return getMonthlyGrossSalary() - getMonthlyDeductions(); 
	}
	public double getAnnualTakeHome() {
		//(12 * MonthlyTakeHome)
		return 12 * getMonthlyTakeHome();
	}
	public void setPFRate(float f) {
		this.PF = f;
	}
	public float getPFRate() {
		return PF;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
		this.hra = 0.5 * this.monthlyBasic;
		if (this.monthlyBasic <= 5000)
			this.ESIC = 0.0475 * this.monthlyBasic;
		if(getMonthlyGrossSalary() <= 10000)
			this.profTax = 50;
		else
			this.profTax = 100;
	}

	public double getESIC() {
		return ESIC;
	}
	public void setESIC(double eSIC) {
		ESIC = eSIC;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getProfTax() {
		return profTax;
	}
	public void setProfTax(double profTax) {
		this.profTax = profTax;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", monthlyBasic=" + monthlyBasic + ", getAnnualBasic()="
				+ getAnnualBasic() + ", getMonthlyGrossSalary()=" + getMonthlyGrossSalary()
				+ ", getAnnualGrossSalary()=" + getAnnualGrossSalary() + ", getMonthlyDeductions()="
				+ getMonthlyDeductions() + ", getMonthlyTakeHome()=" + getMonthlyTakeHome() + ", getAnnualTakeHome()="
				+ getAnnualTakeHome() + ", getPFRate()=" + getPFRate() + "]";
	}
}
