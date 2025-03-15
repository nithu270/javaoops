abstract class stu_det{
    void print(){
        System.out.print("stu has 9 cgpa");  // we cannot create obj for this class;
    }
    abstract void gender();
}

class stu1 extends stu_det{
    void gender(){
        System.out.print("male");    // we should create a method defifnition here when we use abstract methods
    }
}

class Abstract{
    public static void main(String[] args){
stu1 s = new stu1(); // we should create obj for the extended class stu1 not the abstract class
s.print();
s.gender();
    }
}