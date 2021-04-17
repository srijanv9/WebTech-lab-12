import java.io.*;
class Q3
{
    void m() throws IOException 
    {
        throw new IOException("IOException Thrown");
    }
    void n() throws IOException 
    {
        m();
    }
    void p()
     {
        try 
        {
            n();
        }
        catch (Exception e)
        {
            System.out.println("IOException Handled");
        }
    }
    public static void main(String args[])
    {
        Q3 obj = new Q3();
        obj.p();
        System.out.println("Default Flow");
    }
}