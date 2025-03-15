class Super{
    public static void main(String[] args){
Father f = new Father();
System.out.print(f.gend);
    
    Daughter d = new Daughter();
    d.print();
}
}
class Father{
    char gend = 'm';
}
class  Daughter extends Father{
    char gend = 'f';
    void print(){
        System.out.print(super.gend);
    }
}