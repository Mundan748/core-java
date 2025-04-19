/*
3. Assign and print the roll number, phone number and address of two students 
   having names "Sam" and "John" respectively by creating two objects of class
   'Student'.
*/

class Student1{
	int roll_no;
	String name,address,phone_no;
	void get(String n,int r,String p,String add){
		name=n;
		roll_no=r;
		phone_no=p;
		address=add;
	}
	void show(){
		System.out.println("Name     :"+name);
		System.out.println("Roll No. : "+roll_no);
		System.out.println("Phone No.:"+phone_no);
		System.out.println("Address  :"+address);
	}
	public static void main(String ... a){
		Student1 s1=new Student1();
		s1.get("Sam",1,"+91 8271408975","xyz");
		s1.show();
		Student1 s2=new Student1();
		s2.get("John",2,"+91 8271408975","xyz");
		s2.show();
	}
}