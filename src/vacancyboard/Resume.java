package vacancyboard;

public class Resume {
	String work;
	String awards;
	String activities;
	String skills;
	String references;
	String personalInformation;
	String objective;
	String education;
	public Resume(String work, String awards, String activities, String skills, String references,
			String personalInformation, String objective, String education) {
		super();
		this.work = work;
		this.awards = awards;
		this.activities = activities;
		this.skills = skills;
		this.references = references;
		this.personalInformation = personalInformation;
		this.objective = objective;
		this.education = education;
	}

	public String getPersonalInformation() {
		return personalInformation;
	}
	public void setPersonalInformation(String personalInformation) {
		this.personalInformation = personalInformation;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getReferences() {
		return references;
	}
	public void setReferences(String references) {
		this.references = references;
	}



}
