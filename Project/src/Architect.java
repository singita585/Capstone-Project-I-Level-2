public class Architect {

	   // Attributes
	   String Name;
	   String PhoneNumber;
	   String EmailAddress;
	   String PhysicalAddress;
	   
	   // Methods
	   public Architect(String Name, String PhoneNumber, String EmailAddress, String PhysicalAddress) {
		   this.Name = Name;
		   this.PhoneNumber = PhoneNumber;
		   this.EmailAddress = EmailAddress;
		   this.PhysicalAddress = PhysicalAddress;
		}
	   
	   public String getName() {
		      return Name;
		   }
	   
	   public String getPhoneNumber() {
		      return PhoneNumber;
		   }
	   
	   public String getEmailAddress() {
		      return EmailAddress;
		   }
	   
	   public String getPhysicalAddress() {
		      return PhysicalAddress;
		   }
	   
	   public String toString() {
		      String output = "Name: " + Name;
		      output += "\nPhone Number:" + PhoneNumber;
		      output += "\nEmail Address:" + EmailAddress;
		      output += "\nPhysical Address:" + PhysicalAddress;
		   
		      return output;
		   }
	}