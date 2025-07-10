package P7;

public class PlatformIOS extends Platform{
    PlatformIOS(MessageSender ms){
        super(ms);
    }

    public void notifyUser(String title, String body){
        System.out.print("[iOS-"+sender.getType()+"]");
        sender.send(title, body);
    }
}
