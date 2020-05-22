import java.util.Scanner;

public class Test {

    static int gm;
    static int game = gm;
    public static void main(String[] args) {



            System.out.println("Хотите еще раз играть? Если хотите, но нажмите 1, если нет, то 0");
            Scanner sc = new Scanner(System.in);
            gm = sc.nextInt();


        System.out.println(gm);

    }
}
