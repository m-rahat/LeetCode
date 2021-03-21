
public class Print_In_Order {

    private volatile int indicator = 1;
    
    public Print_In_Order() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        indicator++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (indicator != 2);
        printSecond.run();
        indicator++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (indicator != 3) ;
        printThird.run();
    }
	
}
