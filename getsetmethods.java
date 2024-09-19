/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Person {
    private String name;
    private String emp_id;
    private String designation;

    public String getDetails() {
        return "Name: " + name + ", Emp ID: " + emp_id + ", Designation: " + designation;
    }

    public void setDetails(String name, String emp_id, String designation) {
        this.name = name;
        this.emp_id = emp_id;
        this.designation = designation;
    }
}

public class getsetmethods {
    public static void main(String[] args) {
        Person A = new Person();
        A.setDetails("Keerti", "436", "CEO");
        System.out.println(A.getDetails());
    }
}
