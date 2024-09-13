public class samplexyz {
    public static void main(String [] args)
    {
        int x = 10;
        int y = 80;
        int z = 78;

        if(x>y && x>z){
            System.out.println(x);
        }else if(y>x && y>z){
            System.out.println(y);
        }else if (z>x && z>y){
            System.out.println(z);
        }
    }
}
