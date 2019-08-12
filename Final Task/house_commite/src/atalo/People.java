package atalo;
import java.io.Serializable;


@SuppressWarnings("serial")
public class People implements Serializable {
 protected static int id;
 protected String firstName;
 protected String lastName;
 
//-------------------constructor:
 public People(int id1, String firstName1, String lastName1) {
     id = id1;
     firstName = firstName1;
     lastName = lastName1;
 }
 
//---------------------first name:
 public String GetFirstName() {
     return this.firstName;
 }

 public void SetFirstName(String firstName1) {
     firstName = firstName1;
 }
 
//-----------------------last name:  
 public String GetLastName() {
     return this.lastName;
 }

 public void SetLastName(String lastName1) {
     lastName = lastName1;
 }
 
//------------------------------id:
 public int GetId() {
     return People.id;
 }

 public void SetId(int id1) {
     id = id1;
 }
}
