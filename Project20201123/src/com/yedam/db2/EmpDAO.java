package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체 조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 한 건 조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp1 where employee_id = ?";
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	// 한 건 입력
	public void insertEmp(EmployeeVO vo) {
		sql = "insert into emp1 (employee_id, last_name, email, hire_date, job_id) values(?, ?, ?, ?, ?)";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getLastName());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getHireDate());
			pstmt.setString(5, vo.getJobId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 한 건 수정
	public void updateEmp(EmployeeVO vo) {
		if (vo.getSalary() != 0) {
			sql = "update emp1 " //
					+ "set email = nvl('" + vo.getEmail() + "', email)" //
					+ ", phone_number = nvl('" + vo.getPhoneNumber() + "', phone_number)" //
					+ ",salary = nvl(" + vo.getSalary() + ", salary)" //
					+ "where employee_id =  " + vo.getEmployeeId(); //
		} else {
			sql = "update emp1 " //
					+ "set email = nvl('" + vo.getEmail() + "', email)" //
					+ ", phone_number = nvl('" + vo.getPhoneNumber() + "', phone_number)" //
					+ "where employee_id =  " + vo.getEmployeeId(); //
		}
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 한 건 삭제
	public void deleteEmp(EmployeeVO vo) {
		sql = "delete from emp1 where employee_id = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.executeUpdate();
			System.out.println("삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
