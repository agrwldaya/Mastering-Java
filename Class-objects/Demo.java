class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiplie(int a,int b){
        return a*b;
    }

    public int devide(int a,int b){
        if(b==0){
            System.out.print("B should not be Zero!");
            return -1;
        }
        return a/b;
    }
}

class Demo{

    public static void main(String s[]){

        int a = 12;
        int b = 3;

        System.out.println(a+b);

        // Only reference created (no object)
        Calculator c1;

        // Object created in heap, reference stored in stack
        c1 = new Calculator();

        int addRes  = c1.add(a,b);
        int subRes  = c1.subtract(a,b);
        int mulRes  = c1.multiplie(a,b);
        int devideRes  = c1.devide(a,b);

        System.out.println(addRes);
        System.out.println(subRes);
        System.out.println(mulRes);
        System.out.println(devideRes);
    }
}
