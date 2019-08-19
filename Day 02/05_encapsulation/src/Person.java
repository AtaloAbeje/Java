/***
 * This represents a person in the world
 */
public class Person {
    private int age;

	public int getAge() {
		return age;
	}
	
	
    /***
     * 
     * @param age min 0 max 120
     */
	public void setAge(int age) {
		this.age = (age>=0 && age<=120)?age: this.age;
	}  
}