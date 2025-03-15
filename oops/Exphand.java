class Exphand {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.print(a/b);
        }
        catch(ArithmeticException E){
            System.out.println("cannot be divided by 0");
        }
        catch(Exception E){
            System.out.println("cannot be divided by 0"); //handled the error by ourselves without throwing it to compiler;
        }
        finally{
            System.out.println("hii");
        }
        System.out.println("helo");
    }
}

//throw keyword
class excep{
    static void check(int age){   // static method 
        if(age<18){
                throw new ArithmeticException("invalid age"); // we throwing error to a catch block
        }
    }

    public static void main(String[] args) {
        try{
            check(17);
        }
        catch(ArithmeticException E){
            System.out.print(E.getMessage());
        }
    }
}
