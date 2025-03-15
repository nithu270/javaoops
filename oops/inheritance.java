//sinlge level inheritance
class sli{
    public static void main(String[] args){
        son obj = new son();
        obj.fav();
    }
}
class father{
     String gender = "male";
     void fav(){
        System.out.print("coffee");
     }
}
class son extends father{
   //so i dont have any methods or fields here but i can print because of inhertance 
}

//multilevel inheritance

class mli{
    public static void main(String[] args){
        son obj = new son();
        System.out.print(obj.gender);
        obj.fav();
    }
}
class grandma{
    String gender = "female";
}
class Father extends grandma{
     String gender = "male";        // here gender is overridden so if we create obj for son and access this field it will 
                                        //print what is inside the father class
     void fav(){
        System.out.print("coffee");
     }
}
class Son extends father{
  //here son class inherits father and father class inherits grandma class so this is multilevel inheritance
}

//heirarchical inheritance
// 2 child classes and one parent class 


//hybrid inheritance
class inheritance{
    public static void main(String[] args){
       sonh s = new sonh();
System.out.print(s.gend); 
    }
}
class Grandmother{
char gend = 'F';
}
class fatherh extends Grandmother{
char gend = 'M';
}
class sonh extends fatherh{
    
}
class grandson extends fatherh{

}