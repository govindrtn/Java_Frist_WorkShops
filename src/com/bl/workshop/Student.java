package com.bl.workshop;	
	
	class Student {
		
		int id ;
		String name;
		String lName;
		
		Student(){
			 System.out.println("This is default constructor");
		 }
		
		public Student(int id, String name, String lName) {
			super();
			this.id = id;
			this.name = name;
			this.lName = lName;
		}

		public Student(String name, String lName) {
			super();
			this.name = name;
			this.lName = lName;
		}
		public static void main(String[] args) {
			Student myObj = new Student();
			System.out.println(myObj.id +" --- " +  myObj.name + " ---- " + myObj.lName); 
			
			
			Student myObj1 = new Student(1, "Govind", "maithil");
			System.out.println(myObj1.id +" --- " +  myObj1.name + " ---- " + myObj1.lName); 
			
			Student myObj2 = new Student("Sachin","maithil");
			System.out.println(myObj2.name + " --- " + myObj2.lName); 
		}
	}
	 
