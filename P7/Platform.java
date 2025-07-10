package P7;

public abstract class Platform {
    protected MessageSender sender;

    Platform(MessageSender sender){
        this.sender = sender;
    }

    void notifyUser(String title, String body){}
}
