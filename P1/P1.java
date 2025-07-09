//싱글톤

//🧠 문제: 로그 기록기 (Logger) 구현하기
//당신은 여러 모듈에서 호출될 수 있는 로그 기록 시스템을 구현하고자 합니다.
//이때, 로그 기록기는 애플리케이션 전체에서 하나의 인스턴스만 존재해야 하며, 다음과 같은 기능을 제공합니다:

//Logger.getInstance()를 통해 항상 동일한 Logger 인스턴스를 반환해야 합니다.
//log(String message) 메서드를 통해 로그를 기록합니다.
//getLogs() 메서드를 통해 지금까지 기록된 로그 메시지를 List<String>으로 반환합니다.

//<조건>
//Java로 구현할 것
//로그 메시지는 기록된 순서대로 저장되어야 함
//외부에서는 Logger 클래스의 생성자를 호출할 수 없어야 함
//main() 메서드에서 Logger 인스턴스를 여러 번 가져오고 로그를 남겼을 때,
//로그 내역이 하나의 인스턴스에서 공유되어야 함

//public class P1 {
//    public static void main(String[] args) {
//        P1Logger logger1 = P1Logger.getInstance();
//        logger1.log("첫 번째 로그");
//
//        P1Logger logger2 = P1Logger.getInstance();
//        logger2.log("두 번째 로그");
//
//        System.out.println(logger1.getLogs());
//        // 출력: [첫 번째 로그, 두 번째 로그]
//
//        System.out.println(logger1 == logger2);
//        // 출력: true
//    }
//}