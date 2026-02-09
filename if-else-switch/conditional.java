class conditional{

    public static void main(String m[]){
    // int n = 72;

    //    if(n>=90 ){
    //      System.out.println('A');
    //    }else if(n>=80){
    //      System.out.println('B');
    //    }else if(n>=65){
    //      System.out.println('C');
    //    }else if(n>=50){
    //      System.out.println('D');
    //    }else{
    //      System.out.println("Fail");
    //    }

    int   n = 3;

    switch(n){
        case 1:
            System.out.println('A');
            break;
        case 2:
            System.out.println('B');
            break;
        case 3:
            System.out.println('C');
            break;
        case 4:
            System.out.println('D');
            break;
        default : 
            System.out.println("Fail");
            break;
    }

    }
}