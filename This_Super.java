package Com.Company;

class ekclass{
    ekclass(){
        System.out.println("I am a constructor");
    }
    int a;
    public int getA() {
        return a;
    }
    ekclass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}

class doclass extends ekclass{

    doclass(int c) {
        super(c);
        System.out.println("I am a constructor with value of c:"+c);
    }
}

public class This_Super {
    public static void main(String[] args) {
        //ekclass a = new ekclass(5);
        //System.out.println(a.getA());
        doclass a = new doclass(50);
    }
}
