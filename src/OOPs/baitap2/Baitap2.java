package OOPs.baitap2;

public class Baitap2 {
    public static void main(String[] args) {
        Time testTime = new Time();
        testTime.inputTime();
        System.out.println("testTime:" + testTime.toString());
        while (true) {
            System.out.println(testTime.toString());
            try {
                Thread.sleep(1000);
                testTime.tangSecond();
            } catch (Exception ex){

            }
        }
    }
}
