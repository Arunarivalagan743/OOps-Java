package ExceptionsHnadling;

public class Main {
    public static void main(String[] args) {
        int a =  6;
        int b  =   0;
        try{
           divde(a,b);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
    static  int divde(int a,int b) throws ArithmeticException, MyException {
        if(b== 0)
        {
            throw  new MyException("please do not");
        }
        return  a /b;
    }
}
