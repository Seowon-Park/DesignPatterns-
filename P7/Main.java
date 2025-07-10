package P7;
//브릿지 패턴
//회사는 여러 **플랫폼(예: Android, iOS)**과 다양한 **메시지 전송 방식(예: SMS, 이메일)**을 지원하는 알림 시스템을 개발하려 합니다.
//기기(플랫폼)마다 메시지를 전송하는 UI가 다르지만, 전송 방식은 공통입니다.
//플랫폼과 메시지 전송 방식을 독립적으로 확장할 수 있어야 하므로 브릿지 패턴을 사용하여 구조를 설계해야 합니다.


public class Main {
    public static void main(String[] args){
        MessageSender sms = new MessageSMS();
        MessageSender email = new MessageEmail();

        Platform android = new PlatformAndroid(sms);
        Platform ios = new PlatformIOS(email);

        android.notifyUser("경고", "배터리가 부족합니다.");
        ios.notifyUser("업데이트", "새로운 버전이 있습니다.");
    }
}
