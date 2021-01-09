import java.util.Random;

public class Main {



    public static void main(String[] args) {
        Random random = new Random();
        int heads = 2, tails = 1;
        int i = random.nextInt(3) ;

         if (i==heads){
            System.out.println("HEADS");
        }else if (i==tails){
            System.out.println("TAILS");
        }else {
            System.out.println("EDGE");
        }

    }
}
