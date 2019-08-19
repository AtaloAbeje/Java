public class Door {
	
	//---------properties----------
	protected boolean open;

	
	//---------constructors----------
	public Door() {
		this(true);
	}

	public Door(boolean state) {
		open = state;
	}

	//---------methods----------
	public void open() {
		open = true;
	}

	public void close() {
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
	
	
}
