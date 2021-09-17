package com.kh.web.member.model.service;

import java.sql.Connection;

import com.kh.web.common.JDBCTemplate;
import com.kh.web.member.model.dao.MemberDAO;
import com.kh.web.member.model.vo.Member;
import static com.kh.web.common.JDBCTemplate.*;

public class MemberService {
	private Connection con;
	private MemberDAO dao = new MemberDAO();

	public int insertMember(Member joinMember) {
		con = JDBCTemplate.getConnection();

		int result = dao.insertMember(con, joinMember);

		if (result <= 0) {
			rollback(con);
		} else {
			commit(con);
		}
		close(con);
		return result;
	}

}
