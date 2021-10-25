package iterator;
import facade.*;
import java.util.*;
import vacancy.NetworkingJobs;
public class PrintNetworkJobsMenu implements PrintMenu {
	NetworkMenu networkMenu;

	public PrintNetworkJobsMenu(NetworkMenu networkMenu) {
		this.networkMenu = networkMenu;
	}

	@Override
	public void printMenu() {
		Iterator networkIterator = networkMenu.createIterator();
		printMenu(networkIterator);

	}
	public void printMenu(Iterator iterator) {
		System.out.println("\n\n==================Networking Jobs Qualifications==================\n");

		while(iterator.hasNext()) {
			NetworkingJobs job = (NetworkingJobs) iterator.next();
			System.out.println(job.getName() + " \n");
			System.out.println(job.getDescription());
			System.out.println("\nLevel: " +job.getLevel());
			System.out.println("Salary: " + job.getSalary() +"\n");
			System.out.println("\n=========================\n");
		}
	}


}
