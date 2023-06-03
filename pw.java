public class IntroductionTo_loops {
    public static void main(String[] args) {

        //1.   For loop (--->1.initialisation;2.condition;3.Body of loop 4.update)
        for (int i = 0; i<6;i++ ){
            System.out.println(" I Love My India");
        }

        // 2. While loop
        int i=0;
        while(i<5){
            System.out.println("&");
            i++;
        }

        //3. do while loop
        int j=0;
        do {
            System.out.println("in do while loop the the body is executed once without checking condition ");
            j++;
        }while(j<5);


    }
}