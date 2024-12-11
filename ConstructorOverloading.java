import java.util.*;
public class ConstructorOverloading
{
    String name;
    ConstructorOverloading()
    {
        name="Rajesh";
    }
    ConstructorOverloading(String  name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        ConstructorOverloading c=new ConstructorOverloading();
        c.display();
        ConstructorOverloading c1=new ConstructorOverloading();
        c1.display();
    }
}
