import S13.ByeRobot;
import S13.HelloRobot;

public class CompanionObj {

    public static void main(String[] args) {

        HelloRobot.Companion.hello();
        // @JVMStatic 으로 선인시 자바 영역에서도 Companion 영역을 선언하지 않아도 바로 사요가능
        ByeRobot.bye();

    }

}
