package pl.stalostech.creational.builder;

/**
 * Domain class with builder.
 * 
 * @author Bartosz Wysocki
 *
 */
public class Client {

	private final String lastName;

	private final String firstName;

	private final String middleName;

	private final String streetAddress;

	private final String city;

	private final String state;

	private final boolean isFemale;

	private final boolean isEmployed;

	private final boolean isHomewOwner;

	public Client(ClientBuilder builder) {
		this.lastName = builder.lastName;
		this.firstName = builder.firstName;
		this.middleName = builder.middleName;
		this.streetAddress = builder.streetAddress;
		this.city = builder.city;
		this.state = builder.state;
		this.isFemale = builder.isFemale;
		this.isEmployed = builder.isEmployed;
		this.isHomewOwner = builder.isHomewOwner;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public boolean isFemale() {
		return isFemale;
	}

	public boolean isEmployed() {
		return isEmployed;
	}

	public boolean isHomewOwner() {
		return isHomewOwner;
	}

	public static class ClientBuilder {

		private final String lastName;

		private final String firstName;

		private String middleName;

		private String streetAddress;

		private String city;

		private String state;

		private boolean isFemale;

		private boolean isEmployed;

		private boolean isHomewOwner;

		public ClientBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public ClientBuilder withMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public ClientBuilder withStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
			return this;
		}

		public ClientBuilder withCity(String city) {
			this.city = city;
			return this;
		}

		public ClientBuilder withState(String state) {
			this.state = state;
			return this;
		}

		public ClientBuilder withFemaleInfo(boolean isFemale) {
			this.isFemale = isFemale;
			return this;
		}

		public ClientBuilder withEmployedInfo(boolean isEmployed) {
			this.isEmployed = isEmployed;
			return this;
		}

		public ClientBuilder withHomeOwnerInfo(boolean isHomewOwner) {
			this.isHomewOwner = isHomewOwner;
			return this;
		}

		public Client build() {
			return new Client(this);
		}

	}

	@Override
	public String toString() {
		return "Client [lastName=" + lastName + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", isFemale=" + isFemale
				+ ", isEmployed=" + isEmployed + ", isHomewOwner=" + isHomewOwner + "]";
	}

}
