import java.io.*; 

  class SuperClass { 
    void method() throws IOException 
    { 
        System.out.println("SuperClass"); 
    } 
} 

class SubClass extends SuperClass { 
    void method() 
    { 
        System.out.println("SubClass"); 
    } 

    public static void main(String args[]) 

    { 
        SuperClass s = new SubClass(); 

    try { 

        s.method(); 

} catch (IOException e) { 

        e.printStackTrace(); 
    } 

    } 
}