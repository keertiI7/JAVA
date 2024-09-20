
class Rectangle {
    private int length;
    private int width;

    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public int getLength() {
        return length;
    }

    
    public void setLength(int length) {
        this.length = length;
    }

    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

public class RecTangle {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(8, 9);
        
    
        System.out.println("Initial Length: " + r.getLength());
        System.out.println("Initial Width: " + r.getWidth());

        r.setLength(10);
        r.setWidth(12);

        System.out.println("Updated Length: " + r.getLength());
        System.out.println("Updated Width: " + r.getWidth());
    }
}
