
public class User {
	
	private String userName; // Required
	private String emailAddress; // Required
	
	private String firstName; // Optional
	private String lastName;  // Optional
	private int phoneNumber; // Optional
	private String address; // Optional
	
	private User(Builder builder){
		this.userName = builder.userName;
		this.emailAddress = builder.emailAddress;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailAddress=" + emailAddress
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}	
	
	
	
	public static class Builder{
		
		private String userName; // Required
		private String emailAddress; // Required
		
		private String firstName; // Optional
		private String lastName;  // Optional
		private int phoneNumber; // Optional
		private String address; // Optional
		
		
		public Builder(String userName, String email){
			this.userName = userName;
			this.emailAddress = email;
		}
		
		public Builder firstName(String value){
			this.firstName = value;
			return this;
		}
		
		public Builder lastName(String value){
			this.lastName = value;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
		
	}

	
}
