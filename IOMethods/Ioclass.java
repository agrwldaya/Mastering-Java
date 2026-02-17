import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IoUsingBufferedReader{

    public static void main(String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("String Input: ");
            String str = br.readLine(); // for string input
            
            System.out.println("Integer Input: ");
            int num = Integer.parseInt(br.readLine()); // for integer input

            System.out.println("Double Input: ");
            double dnum = Double.parseDouble(br.readLine()); // for double input

            System.out.println("String Output: " + str);
            System.out.println("Integer Output: " + num);

            System.out.println("Double Output: " + dnum);
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {    
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }   
        }
    }

}

class Ioclass{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("String Input: ");
        String str = sc.nextLine(); // for string input
        
        System.out.println("Integer Input: ");
        int num = sc.nextInt(); // for integer input

        System.out.println("Double Input: ");
        double dnum = sc.nextDouble(); // for double input

        System.out.println("String Output: " + str);
        System.out.println("Integer Output: " + num);

        System.out.println("Double Output: " + dnum);

        sc.close();
    }
}