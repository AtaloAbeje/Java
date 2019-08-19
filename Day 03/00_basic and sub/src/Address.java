
public class Address {
	public Address(String city, String country) {
		this.setCity(city);
		this.setCountry(country);
	}

	
	//------------- Properties -----------------
	// Encapsulation (הכמסה)
	private String city;
	private String country;
	
	
	//-------------Getter + Setter -------------
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	//-----------------Methods--------------------
	public String getDescription() {
		return country+" - "+city;
	}


	

	
}
