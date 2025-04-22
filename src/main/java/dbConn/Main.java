package dbConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DBUtil.getConnection(); // DB에 접속하는 객체를 재사용

            // 3. 문장 실행
            // 문장 실행해줄 객체
            Statement stmt = conn.createStatement();

            String sql = "select * from dept";

            ResultSet rs = stmt.executeQuery(sql); // Get, Set,

            // DB에서 가져온 값으로 실제 동작을 수행
            while (rs.next()) {
                System.out.println(rs.getInt(1)); // 컬럼 순번(SQL의 규칙대로 1부터 시작) 정수형으로 된 자료 컬럼을 출력
                System.out.println(rs.getString("dname")); // 컬럼명으로 문자열로 된 자료 컬럼을 출력
            }

            DBUtil.close(conn, stmt, rs); // 자원을 한꺼번에 닫도록 재사용
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
}