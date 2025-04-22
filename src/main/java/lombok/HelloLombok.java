package lombok;

// 특정 인스턴스 안의 여러 속성, 기능을 사용해서 DB의 행들을 인스턴스처럼 제어

@NoArgsConstructor // final 필드가 없는 경우에는 사용 가능 가능
@AllArgsConstructor // 모든 생성자를 자동으로 만들어줍니다.
//@RequiredArgsConstructor // final 필드만 받음
//@Getter
//@Setter
//@ToString // 접근제어자와 상관 없이 모든ㅇ 변수에 대해 결과를 String으로 출력
@Data // Getter, Setter, ToString, eqauls, hashcode, RequiredArgConstructor를 모두 한번에 적용
public class HelloLombok {

//    final int num;
    int num;
    @ToString.Exclude // 직접 속성 위에 제외할 속성에 대한 Exclude를 명기합니다.
    private String name; // private 변수로 선언해도 ToString을 통해 외부 노출이 되기 때문에
    String hello;

//    // setter
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // getter
//    public String getName() {
//        return this.name;
//    }
}
