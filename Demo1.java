class Mobile
{
    String brand;
    int price;
    String name;


      public void show()
      {
      System.out.println(brand + " : " + price + " : " + name);
      }
    }
public class Demo1 
{
    public static void main(String a [])
    {
         Mobile obj1 = new Mobile();
         obj1.brand = "Apple";
         obj1.price = 1500;
         obj1.name = "Smartphone";


         Mobile obj2 = new Mobile();
         obj2.brand = "Samsung";
         obj2.price = 1700;
         obj2.name = "Smartphone";

         
         obj1.show();
         obj2.show();

    }
}
