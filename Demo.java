class computer 
{
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost)
    {
        if (cost >= 10)
        return "pen";
          else
        return "Nothing";
    }
}

public class Demo
{
    public static void main(String a[])
    {
        computer obj = new computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}
