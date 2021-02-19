public class Person {
	
	// Attributes
	String Name;
	int PhoneNumber;
	String EmailAddress;
	String PhysicalAddress;

	// Methods
	public Person(String Name, int PhoneNumber, String EmailAddress, String PhysicalAddress) {
		this.Name = Name;
		this.PhoneNumber = PhoneNumber;
		this.EmailAddress = EmailAddress;
		this.PhysicalAddress = PhysicalAddress;
	}
	
	public String getName() {
	       return Name;
	   }

	public String toString() {
	       String output = "Name: " + Name;
	       output += "\nTelephone Number:" + PhoneNumber;
	       output += "\nEmail Address:" + EmailAddress;
	       output += "\nPhysical Address:" + PhysicalAddress;
	   
	       return output;
	   }
}
