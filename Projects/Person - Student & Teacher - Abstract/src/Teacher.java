
public class Teacher extends Person 
{
	private String teachingSubject;
	private boolean isMaster;
	
	public String getTeachingSubject() {
		return teachingSubject;
	}
	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = teachingSubject;
	}
	public boolean isMaster() {
		return isMaster;
	}
	public void setMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}
	
	@Override
	public String toString() {
		return super.toString() +", teachingSubject: " +teachingSubject+", isMaster: "+isMaster;	
	}
	
	@Override
	public void morningAction() {
		System.out.println("Teacher action");
	}
	
	public void StartLesson() {
		System.out.println("Teacher start lesson");
	}
}
