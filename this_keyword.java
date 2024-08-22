package programs;

public class this_keyword {
	int Age;
	String Name;
	public this_keyword (String name,int age) {
		this.Age=age;
		this.Name=name;
	}
   void display() {
	   System.out.println("NAME:"+Name+"\n"+"AGE:"+Age);
   }
   public static void main(String[]args) {
	   this_keyword myobj=new this_keyword("KEERTI",18);
	   myobj.display();
   }
}
