import java.util.Random;
import java.util.Scanner;


public class one {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        games games = new games();


        System.out.println("숫자를 맞춰보자!");
        System.out.println("게임을 시작할려면 1을 입력해주세요");
        int gmStartST = sc.nextInt();

        if (gmStartST == 1) {

            System.out.println("게임을 시작합니다.");
            Thread.sleep(10);
            System.out.println("숫자를 입력해주세요");

            //게임시작

            int randomInt = games.randomInt();
            System.out.println(randomInt);
            //뽑힌 수 보여주는 코드
            //디버깅 할때 활성화 할 것
            int playCounting = 0;

            while (true) {

                if (games.mainGame(randomInt)) {

                    System.out.println("축하합니다 숫자를 정확히 맞추셨습니다!");
                    Thread.sleep(50);
                    System.out.println("정답 숫자: " + randomInt);
                    System.out.println("시도한 수: " + playCounting);


                    return;
                }

                playCounting = playCounting + 1;

            }


        } else {
            System.out.println("입력하신 수 가 1이 아니므로 게임을 종료합니다");
        }


    }
}

class games {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public int randomInt() {

        int randomINT = random.nextInt(100);

        return randomINT;

    }

    public boolean mainGame(int randInt) {


        int inputInt = sc.nextInt();

        if (randInt == inputInt) {

            return true;
        } else if (randInt > inputInt) {

            System.out.println("Up");

            return false;

        } else {
            System.out.println("Down");
            return false;
        }

    }


}
