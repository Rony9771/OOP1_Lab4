package aiub.Lab4;

public class Student {
	
		private String name;
		private String id;
		private String department;
		private float cgpa;
		
		
		public Student() {
			
		}
		
		public Student(String name, String id, String department, float cgpa) {
			super();
			this.name = name;
			this.id = id;
			this.department = department;
			this.cgpa = cgpa;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public float getCgpa() {
			return cgpa;
		}
		public void setCgpa(float cgpa) {
			this.cgpa = cgpa;
		}

		public void show() {
			System.out.println("ID:"+id+" NAme:"+name+" Dept:"+department+" Cgpa:"+cgpa);
		}

}