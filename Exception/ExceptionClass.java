

class myAgeRestException extends Exception{

    public myAgeRestException(){
        super("This is age restrict exception!");
    }
    public myAgeRestException(String msg){
        super(msg);
    }
}

class AgecheckClas{
     int age = 15;
        AgecheckClas(int age){
            this.age = age;
        }
        int getAge() throws myAgeRestException{
            if(age<18){
                throw new myAgeRestException("No eligible!");
            }
            return age;
        }
        void setAge(int age){
            this.age = age;
        }
}


public class ExceptionClass{
    public static void main(String[] args) {
        boolean allow = false;
        AgecheckClas obj = new AgecheckClas(10);

       try{
            if(obj.getAge()>18){
                allow = true;
            }
       }catch(myAgeRestException e){
        String err = e.getMessage();
        System.out.println(err);
       }

        System.out.println("Allow = " + allow);
    }
}