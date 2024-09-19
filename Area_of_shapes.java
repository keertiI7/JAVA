/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Areas {
    public void square (int s) {
        System.out.println("The Area is : "+ s*s);
    }
    public void square (Double s) {
        System.out.println("The Area is : "+ s*s);
    }

    public void rectangle(int l,int b) {
        System.out.println("The Area is : "+ l*b);
        
    }
    public void rectangle(Double l,Double b) {
        System.out.println("The Area is : "+ l*b);
        
    }
    public void circle(int r) {
        System.out.println("The Area is : "+ 3.14*(r*r));
        
    }
    public void circle(Double r) {
        System.out.println("The Area is : "+ 3.14*(r*r));
        
    }
    
}

public class Area_of_shapes{
    public static void main(String[] args) {
        Areas A = new Areas();
        A.square(4);
        A.square(4.56);
        A.rectangle(12,13);
        A.rectangle(11.1,12.09);
        A.circle(9);
        A.circle(3.33);
        
    }
}
