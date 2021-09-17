package com.kh.web.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kh.web.member.model.vo.Member;

import static com.kh.web.common.JDBCTemplate.close;

public class MemberDAO {

    public int insertMember(Connection con ,Member m) {
        int result = 0; // 추가된 행의 수

        // Statement st = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO MEMBER VALUES "
                + " (?, ?, ?, ?, ?, ?, ?, ?, ?, DEFAULT)";

        try {
            ps = con.prepareStatement(sql);

            // 데이터 베이스 값 추가 (DB 숫자 시작은 1부터!)
            ps.setString(1, m.getUserId());
            ps.setString(2, m.getUserPwd());
            ps.setString(3, m.getUserName());
            ps.setString(4, m.getGender());
            ps.setInt(5, m.getAge());
            ps.setString(6, m.getEmail());
            ps.setString(7, m.getPhone());
            ps.setString(8, m.getAddress());
            ps.setString(9, m.getHobby());

            result = ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(ps);
        }

        return result;
    }
}

