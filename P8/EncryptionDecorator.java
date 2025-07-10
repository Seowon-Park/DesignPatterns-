package P8;

public class EncryptionDecorator extends Decorator{

    EncryptionDecorator(MessageSender sender){super(sender);}// "[Compressed]"+"안녕" 보낼 수 있는 객체 저장

    public void send(String m){
        sender.send("[Encrypted]"+m);
    }
}
