package P8;

public abstract class Decorator implements MessageSender{
    protected MessageSender sender;

    Decorator(MessageSender sender){this.sender=sender;}

    public void send(String m){}
}
