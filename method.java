public class Cal
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class advCal extends Cal
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}
public class method
{
    public static void main(String a[]) 
    {
        advCal obj = new advCal();
        int r1 =obj.add(3,5);
        System.out.println(r1);
    }
   
}

