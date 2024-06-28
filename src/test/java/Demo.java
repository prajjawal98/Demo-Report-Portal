public class Demo {
    private int a;
    private int b;
    private String c;

    // Constructor 1
    public Demo() {
        this(10, 20); // Calls Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized constructor called");
    }
    public Demo(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Parameterized constructor called");
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b );
    }

    public static void main(String[] args) {
        Demo ex = new Demo(2, 3); // This will call Constructor 1 which in turn calls Constructor 2
        ex.display();
    }
}
