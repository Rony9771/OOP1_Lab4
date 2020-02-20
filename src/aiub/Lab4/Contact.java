package aiub.Lab4;

public class Contact {


		private String PersonName;
		private String PersonID;
		private int Age;
		private String Mobile;
		private String Gender;
		
		public Contact() 
		{
			
			
		}
		
		
		public Contact(String personName, String personID, int age, String mobile, String gender) 
		{
			
			PersonName = personName;
			PersonID = personID;
			Age = age;
			Mobile = mobile;
			Gender = gender;
		}
		
		
		public void DetectOperator()
		{
			if ( Mobile =="017")
			{
				System.out.println(" Moble Operator is  GrameenPhone " );
				
			}
			else if (Mobile =="018")
			{
				
				System.out.println(" Mobile Operator is Robi");
				
			}
			
			else if (Mobile =="019")
			{
				
				System.out.println(" Mobile Operator is Banglalink");
				
			}
				
			else if (Mobile =="016")
			{
					
					System.out.println(" Mobile Operator is Airtel");
					
			}
			
			else
			{
					System.out.println(" Other Operator");
					
			}
				
			}
		
		
		
		
		public String toString() 
		{
			return "Contact [PersonName=" + PersonName + ", PersonID=" + PersonID + ", Age=" + Age + ", Mobile=" + Mobile
					+ ", Gender=" + Gender + "]";
		}


		public void ShowInfo()
		{
			
			System.out.println(" Name is : " + PersonName);
			System.out.println(" ID is : " + PersonID);
			System.out.println(" Age is : " + Age);
			System.out.println(" Mobile Number is : " + Mobile);
			System.out.println(" Gender is : " + Gender);
			
		}
			
	}
		


