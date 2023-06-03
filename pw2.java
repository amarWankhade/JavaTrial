public class Paterrn_programming {
    public static void main(String[] args) {

        //1. to print the 4*4 matrix of "*"

// for(int i=0; i<4;i++) {
//     for (int j = 0; j < 4; j++) {
//         System.out.print("*");
//    }
//     System.out.println(  );
        //}

        //2.


//        int n=12;
//        for(int i=0; i<n; i++)
        //       {
        //           for(int j=0; j<n; j++)
//            {
//                System.out.print("* ");
        //           }
        //           System.out.println();
        //      }
        // we can modify these program modifying value of i at if
        int n=5;
            for(int i=0; i<n; i++)
            {
             for(int j=0; j<n; j++)
             {
                 if(i==0  ||j==0 || i==0)
                 {
                     System.out.print("*");
                 }
                 else
                 {
                 System.out.print(" ");
                 }
             }
             System.out.println();
            }


    }
    }

