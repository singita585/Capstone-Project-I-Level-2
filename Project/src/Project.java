import java.util.Date;

public class Project {
	//Attributes    
    int Number;
    String Name;
    String building;
    String Address;
    int erfNumber;
    Double TotalFee;
    Double TotalAmount;
    String DueDate;
    String projectCompleted;
    Date dateCompleted;
   
    
    // Adding people to add them in the project
    
    Person Architect;
    Person Customer;
    Person Contractor;
   
    // Constructor
    
    public Project(int Number, String Name, String building, String Address, int erfNumber, Double TotalFee,
                    Double TotalAmount, String DueDate, String projectCompleted,Date dateCompleted,Person Architect, Person Customer, Person Contractor) {
       
        this.Number = Number;
        this.Name = Name;
        this.building = building;
        this.Address = Address;
        this.erfNumber = erfNumber;
        this.TotalFee = TotalFee;
        this.TotalAmount = TotalAmount;
        this.DueDate = DueDate;
        this.projectCompleted = projectCompleted;
        this.dateCompleted = dateCompleted; 
        this.Architect = Architect;
        this.Customer = Customer;
        this.Contractor = Contractor;
    }
    
    public int getNumber() {
	      return Number;
	   }
 
 public String getName() {
	      return Name;
	   }
 
 public String getbuilding() {
	      return building;
	   }
 
 public String getAddress() {
	      return Address;
	   }
 
 public int erfNumber() {
	 return erfNumber;
 }
 
 public double TotalFee() {
	 return TotalFee;
 }
 
 public double TotalAmount() {
	 return TotalAmount;
 }
 
 public String DueDate() {
	 return DueDate;
 }
 
 public String projectCompleted() {
	 return projectCompleted;
 }
 
 public Date dateCompleted() {
	 return dateCompleted;
 }
   
    
     //Create a toString method
     
     
    public String toString() {
        String output = "";
        output += "\nProject Number: " + Number;
        output += "\nProject Name: " + Name;
        output += "\nBuilding Type: " + building;
        output += "\nPhysical Address: " + Address;
        output += "\nErf Number: " + erfNumber;
        output += "\nTotal Fee: " + TotalFee;
        output += "\nAmount Paid: " + TotalAmount;
        output += "\nDeadline: " + DueDate;
        output += "\nIs Project Completed: " + projectCompleted;
        output += "\nCompleted Date: " + dateCompleted;
        return output;
    }
   
 }  