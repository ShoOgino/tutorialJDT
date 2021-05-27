import visitor.VisiterForTutorial;

import java.util.HashMap;
import java.util.Map;

public class Dummy {
    public void test() {
        int a = 2;
        if (a == 2) {
            System.out.println("1-1");
            if(a < 3){
                System.out.println("1-2");
            }
        }
        int b = 1;
        if(b==1){
            System.out.println("2-1");
        }
        Map<VisiterForTutorial, String> map = new HashMap<>();
    }
}
