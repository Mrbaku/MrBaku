package Day44_encapsulation;

import java.util.ArrayList;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobClass job = new JobClass();
		JobClass job1 = new JobClass("Java Developer");
		JobClass job2 = new JobClass("SDET", "Amazon", 130_000.0);

		System.out.println(job.toString());
		System.out.println(job1.toString());
		System.out.println(job2.toString());

		// create a list of jobs and add 5 different jobs with company, salary and
		// salary

		ArrayList<JobClass> jobs = new ArrayList<>();
		jobs.add(job2);
		jobs.add(new JobClass("Scrum Master", "Google", 123000.0));
		jobs.add(new JobClass("SDET", "FreddieMac", 115000.0));
		jobs.add(new JobClass("BA", "Leidos", 98000.0));
		jobs.add(new JobClass("Senior QA Tester", "Delta", 150000.0));

		System.out.println(jobs);

		// find the highest paying job and print toString for that

		double maxSalary = 0.0;
		int index = -1;

		for (int i = 0; i < jobs.size(); i++) {
			if (jobs.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobs.get(i).getAnnualSalary();
				index = i;
			}
		}
		System.out.println("Highest Salary: " + jobs.get(index));

	}

}
