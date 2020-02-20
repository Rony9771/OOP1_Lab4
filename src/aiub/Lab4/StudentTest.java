package aiub.Lab4;


	public class StudentTest {

		public static void main(String[] args) {
			Student s1=new Student();
			s1.setName("Rony");
			s1.setId("17-34738-2");
			s1.setDepartment("CSE");
			s1.setCgpa(4);
			s1.show();
			
			Student s2=new Student("Ahmed","17-34738-2","CSE",3);
			s2.show();


}


}
