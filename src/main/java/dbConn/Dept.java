package dbConn;

import lombok.AllArgsConstructor;
import lombok.Data;

// 테이블명과 같은 이름으로 클래스명을 작성합니다. 단 클래스이므로 맨 앞글자가 대문자
@AllArgsConstructor
@Data
public class Dept {

    public int deptno;
    public String dname;
    public String loc;
}
