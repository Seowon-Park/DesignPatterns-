//팩토리 메서드

//🧩 문제: 알림(Notification) 시스템 구현
//[문제 설명]
//어떤 시스템은 사용자에게 다양한 방식으로 알림(Notification)을 보낼 수 있습니다.
// 알림 방식에는 다음과 같은 세 가지가 있습니다:
//이메일(Email)
//SMS(SMS)
//푸시 알림(Push)

//사용자의 설정에 따라 알림 방식을 다르게 생성해야 합니다.
//이때 팩토리 메서드 패턴을 사용하여 각 알림 객체를 생성하고,
//공통된 방식으로 notify(String message) 메서드를 호출해 메시지를 전송하도록 구현하세요.

//[요구사항]
//알림 방식에 따라 서로 다른 클래스를 생성하세요.
//(예: EmailNotification, SMSNotification 등)
//Notification이라는 인터페이스 또는 추상 클래스를 만들고 notify(String message) 메서드를 정의하세요.
//NotificationFactory라는 클래스를 만들어 알림 타입("EMAIL", "SMS", "PUSH")을 전달하면 알맞은 객체를 반환하게 하세요.
//아래 예시 입력에 따라 출력이 나오도록 구현하세요.

//public class P2 {
//    public static void main(String[] args) {
//        P2Notification notification = P2NotificationFactory.createNotification("EMAIL");
//        notification.notify("Hello via Email!");
//
//        notification = P2NotificationFactory.createNotification("SMS");
//        notification.notify("Hello via SMS!");
//
//        notification = P2NotificationFactory.createNotification("PUSH");
//        notification.notify("Hello via Push Notification!");
//    }
//}
