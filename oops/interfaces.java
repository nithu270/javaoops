interface father{
    abstract void gender();
}
interface mother{
    abstract void gender();
}

class son implements father,mother{
    public void gender(){
        char gend = 'm';   //gender doesnt depend on father or mother because the method is defined inside the class
        System.out.println("Gender: " + gend); 
    }
}
class interfaces{
    public static void main(String[] args) {
        son s = new son();
        s.gender();
    }
}