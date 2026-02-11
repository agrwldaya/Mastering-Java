// String is a object in JAVA stored in heap.
    // String s = "hello";
//  But this is special object creation — it uses a pool.

class string_learn{

    public static void main(String a[]){

        // String s1 = new String("Daya");
        // String s2 = new String("Daya");

        // String s3 = "Daya";
        // String s4 = "Daya";

        // System.out.println(s1==s2);  -- false
        // System.out.println(s3==s4);  -- true
        // System.out.println(s1.equals(s3)); -- true


        // String s = new String("daya");
        // String i =  s.intern();
        // String b = "daya";

        // System.out.println(b==i);

        ///  Mutable string --- 

        // StringBuilder s1 =  new StringBuilder("Daya");
        // StringBuilder s2 = s1;
        // s2 = s2.append("Ji");

        // System.out.println(s1==s2);

         StringBuffer bf  = new StringBuffer("daya");
         bf.append(" agrawal");
         System.out.println(bf);

    }
}