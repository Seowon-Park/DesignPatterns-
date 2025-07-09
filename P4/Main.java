//빌더 패턴

//✅ 문제: 사용자 프로필 생성기
//한 웹 서비스에서는 사용자 정보를 관리하기 위해 UserProfile 객체를 사용합니다.
//이 객체는 아래와 같은 정보를 포함합니다:
//이름 (필수)
//나이 (선택)
//이메일 (선택)
//전화번호 (선택)
//주소 (선택)

//웹 서비스는 사용자 등록 시 다양한 경우의 데이터를 받아 처리해야 하므로,
// 유연하게 객체를 생성할 수 있어야 합니다.

//요구사항:
//필수값(이름)을 제외한 값들은 입력될 수도 있고 안 될 수도 있음.
//각 필드는 체이닝 방식으로 설정할 수 있어야 함.
//최종적으로 build()를 호출하면 완성된 UserProfile 객체를 반환해야 함.
//아래 main 메서드를 참고하여 UserProfile과 그에 대한 Builder 클래스를 구현하시오.


package P4;

public class Main {
    public static void main(String[] args) {
        UserProfile user1 = new UserProfile.Builder("홍길동")
                .age(30)
                .email("hong@example.com")
                .build();

        UserProfile user2 = new UserProfile.Builder("이순신")
                .phone("010-1234-5678")
                .address("서울특별시 종로구")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
