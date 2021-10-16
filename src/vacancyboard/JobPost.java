package vacancyboard;
import java.util.*;
public abstract class JobPost {
	String title;
	double salary;
	String description;
	Company company;
	Date startDate;
	public JobPost(String title, double salary, String description, Company company) {
		super();
		this.title = title;
		this.salary = salary;
		this.description = description;
		this.company = company;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}

}
