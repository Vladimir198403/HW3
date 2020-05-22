import java.util.Random;
import java.util.Scanner;

public class Guess {
    /*нужно  методы: загодать число, ввести число, выдать резльтат, предложить играть снова
     */
    public static int attem;
    public static int ansewr;
    public static int game;
    public static int letter = new Random().nextInt(100);
    public static int attempt;

    public static void determineAttempt() { //выбор количества попыток
        System.out.println("Напишите, за сколько попыток вы хотите угадать число");
        Scanner sc = new Scanner(System.in);
        attempt = sc.nextInt();
    }

    public static void userAnswer() {//получить ответ от пользователя
        Scanner sc = new Scanner(System.in);
        ansewr = sc.nextInt();
    }

    public static void comparision() { // сравнение ответа пользователя с загаданным числом
        forComparision();
    }

    public static void forComparision(){// перебор для сравнения
        for (int i = 0; i < attempt; i++) {
            userAnswer();
            if (letter == ansewr) {
                System.out.println("Вы победили!");
            } else if (letter > ansewr) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
    }

    public static void comparision_1() { // сравнение ответа пользователя с загаданным числом
        System.out.println("Отлично, давай поиграем еще раз!!! Попробуй снова его отгадать");
        forComparision();
    }

    public static void choiceGame() {// продолжить или остановить игру
        System.out.println("Хотите еще раз играть? Если хотите, но нажмите 1, если нет, то 0");
        Scanner sc = new Scanner(System.in);
        game = sc.nextInt();
        }

    public static void main(String[] args) {
        System.out.println("Привет, я загадал число от 0 до 100. Тебе нужно его угадать");
        determineAttempt(); //определили количество попыток
        System.out.println("Вы можете угадывать число за " + attempt + " раз/а");
        System.out.println("Введите ваше число");
        comparision();
        for (int i = 0; i < 100; i++) {
            choiceGame();
            if (game == 1) {
                comparision_1();
            } else if (game == 0) {
                break;
            }
        }System.out.println("Как жаль! До свидания");
    }
}

//Можно еще реализовать уровни сложности (предел рандома), количество игроков и еще что-нибудь. Но не хватает время.