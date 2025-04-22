package lombok;

public class LombokTest {

    public static void main(String[] args) {
        // 자료형 변수명 = new 클래스생성자(파라미터);
        HelloLombok h1 = new HelloLombok(1, "롬복테스트", "안녕"); // @AllArgsConstructor
//        HelloLombok h2 = new HelloLombok(1); // @RequiredArgsConstructor
        HelloLombok h3 = new HelloLombok(); // @NoArgsConstructor
        System.out.println(h1); // @ToString
        System.out.println(h3); // @ToString
        h1.setName("롬복1"); // @Setter
        h1.setHello("헬로1"); //
        System.out.println(h1.getName()); // @Getter
        System.out.println(h1.getHello()); // get
    }
}
