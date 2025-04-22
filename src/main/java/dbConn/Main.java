package dbConn;

import java.sql.ResultSet;
import java.sql.Statement;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 3. 문장 실행
        // 문장 실행해줄 객체
        Statement stmt = conn.createStatement();

        // executeUpdate - Read를 제외한 모든 sql 명령어를 실행

        // Update
        String sql = "UPDATE dept SET dname='OPERATION2' WHERE deptno=99";

        // Create
//			String sql = "INSERT INTO dept VALUES (99, 'OPERATION', 'SEOUL')";

        // DELETE
//            String sql = "DELETE FROM dept WHERE deptno=99";

        // 그 결과로 실제 영향을 끼친 row의 수를 리턴
        int rs2 = stmt.executeUpdate(sql);
        System.out.println(rs2);

        sql = "select * from dept where dname='OPERATION2'";

        // 그 결과로 실제 영향을 받은 값 또는 영향을 미친 행의 수를 리턴해주는 ResultSet 객체
        // 실제 Result를 가지고 있는 객체
        /* 1. 커서(포인터)를 이동시키는 기능 next()
         * 2. 데이터를 리턴하는 기능 : getXxx(컬럼의 번호 or 컬럼 이름)
         * 				정수로 된 자료형의 컬럼 반환 : getInt(컬럼번호 or 컬럼명)
         * 				문자열로 된 자료형 컬럼 반환 : getString(컬럼번호 or 컬럼명)
         */
        // executeQuery - Read를 실행
        // 그 결과로 SELECT된 전체 행을 가져 리턴
        ResultSet rs = stmt.executeQuery(sql); // Get, Set,

        // DB에서 가져온 값으로 실제 동작을 수행
        while (rs.next()) {
            System.out.println(rs.getInt(1)); // 컬럼 순번(SQL의 규칙대로 1부터 시작) 정수형으로 된 자료 컬럼을 출력
            System.out.println(rs.getString("dname")); // 컬럼명으로 문자열로 된 자료 컬럼을 출력
        }

    }
}