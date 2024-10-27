class man
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

public class human {
    public static void main(String a[])
    {
       man obj =new man();
       obj.setAge(21);
       obj.setName("Jino");

       System.out.println(obj.getName() + " " + obj.getAge ()+ " ");
    }
}
