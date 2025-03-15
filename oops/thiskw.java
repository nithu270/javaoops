class Father {
    int age;
    char gend;

    // Parameterized constructor
    Father(int age, char gend) {
        this.age = age;
        this.gend = gend; //this keyword is mainly used for differentiating instance var and parameterized var
    }

    void print() {
        System.out.println(age + " " + gend);
    }
}

class Thiskw {  
    public static void main(String[] args) {
        Father f = new Father(50, 'm');  
        f.print();  
    }
}
