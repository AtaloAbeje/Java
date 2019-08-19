
public class Program {

	public static void main(String[] args) {
		LockableDoor d1=new LockableDoor();
		
		d1.showLockableDoorState();  //--> open: true , locked: false
		
		d1.lock(); //--> Sorry - the door is open - can not be locked
		
		d1.close();
		
		d1.showLockableDoorState(); //--> open: false , locked: false
		
		d1.lock();
		
		d1.open();  //--> Sorry - the door is locked
		
		d1.showLockableDoorState();  //--> open: false , locked: true
		
		d1.unlock();
		
		d1.open();
		
		d1.showLockableDoorState();  //--> open: true , locked: false
		
		d1.lock(); //--> Sorry - the door is open - can not be locked

	}

}
