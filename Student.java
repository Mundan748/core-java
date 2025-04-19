/*
2. Create a class named 'Student' with String variable 'name' and integer 
   variable'roll_no'. Assign the value of roll_no as '2' and that of name as 
   "lalu" by creating an object of the class Student.
*/

class Student{
	String name;
	int roll_no;
	void get(String s,int r){
		name=s;
		roll_no=r;
	}
	void show(){
		System.out.println("Name    :"+name);
		System.out.println("Roll No.: "+roll_no);
	}
	public static void main(String ... a){
		Student s1=new Student();
		s1.get("lalu",2);
		s1.show();
	}
}