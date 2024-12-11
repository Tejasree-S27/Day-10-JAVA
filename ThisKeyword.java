public class ThisKeyword 
{
    void display()
    {
        System.out.println("Hello");
    }
    void callDisplay()
    {
        // Using 'this' to call the display method
        this.display(); 
    }
    public static void main(String args[])
    {
        ThisKeyword t = new ThisKeyword();
        t.callDisplay(); 
    }
}
