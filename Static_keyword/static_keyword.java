
class demo{
    static String var = "this is static var";
    int x  = 10;

    static int add(int a,int b){
        return (a+b);
    }

    static void show(){
        demo st = new demo();
        System.out.print(st.x);
    }

    static {
        System.out.println("Static block");
    }   
}


public class static_keyword {
    public static void main(String[] args){
        int sum = demo.add(2,3);
        System.out.println(sum);
        demo.show();
    }
}

