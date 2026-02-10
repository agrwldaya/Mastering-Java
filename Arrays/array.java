// ------ In Java array is a object stored in Heap
// | int arr[] = new int[5];
// | STACK                    HEAP
// | arr  ------------->   [0,0,0,0,0]
// | arr is NOT array
// | arr is a reference to array object  

// -----------Declaration & Initilization Styles
// int[] arr =  new int[5] or {1,2,3,4,5};
// int arr[];
// int []arr;

//------------ Default Values

// | Type    | Default  |
// | ------- | -------- |
// | int     | 0        |
// | double  | 0.0      |
// | boolean | false    |
// | char    | '\u0000' |
// | Object  | null     |


// int[] arr = {10,20,30};

// System.out.println(arr[1]);      // 20
// System.out.println(arr.length);  // 3

// arr.length   ✔
// arr.length() ❌
class Student{
    int id;
    String name;
}

class array{
    public static void main(String s[]){

        //---- 1D Arrays-----
                // int arr[] = {3,1,5,7,4,8};

                // for(int i=0;i<arr.length;i++){
                //     System.out.print(arr[i]+" ");
                // }

                // for(int x:arr){
                //     System.out.print(x+" ");
                // }


        //---- 2D Arrays-----

                // int grid[][] =  new int[3][4];

                //   int grid[][] =  {{1,2,3},{4,5,6}};

                //   for(int i=0;i<grid.length;i++){
                //     for(int j=0;j<grid[0].length;j++){
                //         System.out.print(grid[i][j]+" ");
                //     }
                //     System.out.println();
                //   }
        
        //------ Jagged Array (Very Java specific)
        //  Rows can have different sizes:

                // int jaggedArray[][] = int new[3][];

                // jaggedArray[0] = new int[2];
                // jaggedArray[1] = new int[3];
                // jaggedArray[2] = new int[4];
        

        // ------ Arrays of objects-------------

            Student arr[] = new Student[3];

            // Did 3 Student objects get created?
            // ❌ NO
            // Only 3 references are created.
            // creating actual object 

            arr[0] = new Student();
            arr[1] = new Student();
            arr[2] = new Student();

            // arr ---> [ ref | ref | ref ]

            // ref ---> Student object
            // ref ---> Student object
            // ref ---> Student object

            arr[0].id = 1;
            arr[0].name = "Rahul";

            arr[1].id = 2;
            arr[1].name = "Aman";

            arr[2].id = 3;
            arr[2].name = "Neha";


            for(Student st : arr){
                System.out.println(st.id + " " + st.name);
            }

    }
}
