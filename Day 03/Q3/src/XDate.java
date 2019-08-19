import java.util.Date;

public class XDate extends Date {

	/*
	  Parameters: 
	  	year - the year. 
	  	month - the month between 1-12. 
	  	date - the day of the month between 1-31.
	 */
	public XDate(int date, int month, int year) {
		super(year - 1900, month - 1, date);
	}

	public static XDate now() {
		Date newDate = new Date();
		return new XDate(newDate.getDate(), newDate.getMonth() + 1, newDate.getYear() + 1900);
	}

	public XDate addDays(int days) {
		/*
		 * getTime() - Returns the number of milliseconds since January 1, 1970,
		 * 00:00:00 GMT represented by this Date object.
		 */
		long currentTime = getTime();

		/*
		 * public Date(long date) - Allocates a Date object and initializes it to
		 * represent the specified number of milliseconds since the standard base time
		 * known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
		 */
		Date newDate = new Date(currentTime + (days * 24 * 60 * 60 * 1000));
		return new XDate(newDate.getDate(), newDate.getMonth() + 1, newDate.getYear() + 1900);
	}

	@Override
	public int getYear() {
		return super.getYear() + 1900;
	}

	@Override
	public int getMonth() {
		return super.getMonth() + 1;
	}
}
