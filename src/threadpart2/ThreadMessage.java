package threadpart2;

public class ThreadMessage implements Runnable {

    Message message = new Message();

    @Override
    public void run() {
        message.show();
    }
}
