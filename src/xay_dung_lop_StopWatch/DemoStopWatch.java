package xay_dung_lop_StopWatch;

public class DemoStopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        watch.stop();
        System.out.println("The Elapsed time is: " + watch.getElapsedTime() + " milisec");
    }
}
