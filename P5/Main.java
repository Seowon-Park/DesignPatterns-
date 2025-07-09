//프로토타입 패턴

//✅ 문제:
//문서 템플릿 복사기 (Prototype Pattern)
//어떤 문서 편집 시스템에서는 다양한 종류의 문서를 작성할 수 있습니다.
// 각 문서는 제목(title), 본문(body), 작성자(author) 등의 정보를 가지고 있으며,
// 자주 사용하는 템플릿을 기반으로 새로운 문서를 빠르게 복사하여 작성합니다.

//이 시스템에서는 다음 조건을 만족해야 합니다:
//새로운 문서를 만들 때는 기존 문서를 복사하여 생성해야 한다.
//복사된 문서는 기존 문서와는 별개의 인스턴스여야 한다.
//문서 객체를 복사할 때는 복사 메서드를 이용한다.

//📌 요구 사항:
//Document라는 클래스를 만들어 title, body, author를 속성으로 가진다.
//clone() 메서드를 구현하여 자신을 복제할 수 있도록 한다.
//main()에서는 아래와 같은 흐름을 실행한다.
//        "보고서 템플릿" 문서를 하나 만든다.
//이를 복사하여 새로운 "보고서 - 김철수 작성본" 문서를 만든다. (작성자와 제목만 수정)
//원본과 복제본의 내용을 출력한다.

package P5;

public class Main {
    public static void main(String[] args) {
        // 원본 문서 생성
        Document template = new Document("보고서 템플릿", "이 문서는 보고서 양식입니다.", "관리자");

        // 복제 문서 생성
        Document copied = template.clone();
        copied.setTitle("보고서 - 김철수 작성본");
        copied.setAuthor("김철수");

        // 출력
        System.out.println("[원본 문서]");
        System.out.println("제목: " + template.getTitle());
        System.out.println("본문: " + template.getBody());
        System.out.println("작성자: " + template.getAuthor());
        System.out.println();
        System.out.println("[복제 문서]");
        System.out.println("제목: " + copied.getTitle());
        System.out.println("본문: " + copied.getBody());
        System.out.println("작성자: " + copied.getAuthor());
    }
}
