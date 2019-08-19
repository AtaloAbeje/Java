
public class LockableDoor extends Door {
	// ---------properties----------
	private boolean locked;

	// ---------constructors----------
	public LockableDoor() {
		super(); // we call the ctor that created "open=true"
		locked = false;
	}

	// ---------methods----------
	@Override
	public void open() {
		if (!locked)
			super.open();
		else
			System.out.println("Sorry - the door is locked");
	}

	@Override
	public void close() {
		super.close();
	}

	public void lock() {
		if (super.isOpen())
			System.out.println("Sorry - the door is open - can not be locked");
		else
			locked = true;

	}

	public void unlock() {
		locked = false;
	}
		
		
		public boolean isLocked() {
			return locked;
		}
		
		
		public void showLockableDoorState() {
			System.out.println("open: "+super.isOpen()+ " , locked: "+locked);
		}
		

}
