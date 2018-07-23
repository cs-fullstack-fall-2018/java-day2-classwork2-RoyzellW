import java.util.Scanner;

public class Exercise16 {

        public static void main(String[] args) {

            function();

        }

        public static void function(){
            Scanner scanIn = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int mouse = scanIn.nextInt();
            Scanner scanIn2 = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int mouse2 = scanIn2.nextInt();

            while (mouse < mouse2){
                System.out.println(mouse);
                mouse +=1;
        }


    }

}
