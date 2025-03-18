//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, 
//and print their name and age.

class person{
  String name;
  int age;
  person(String name,int age){
    this.name = name;
    this.age = age;
  }
  void print(){
System.out.println(this.name+" "+this.age);
  }
}
class basiclvl{
    public static void main(String[] args) {
        person p = new person("nithya",19);
        p.print();
        person p1 = new person("shree",20);
        p1.print();

    }
}

