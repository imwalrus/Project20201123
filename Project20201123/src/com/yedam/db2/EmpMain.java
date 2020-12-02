package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

import com.yedam.db.Employee;

public class EmpMain {
	public static void main(String[] args) {
		// 1. 전체조회 2. 한 건 조회 3. 입력 4. 수정 5. 삭제
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();

		while (true) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("① 전체조회 ② 한 건 조회 ③ 입력 ④ 수정 ⑤ 삭제 ⑥ 부서별 조회 ⑦ 종료");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}
			} else if (selectNo == 2) {
				System.out.println("조회할 사원번호 입력: ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();

			} else if (selectNo == 3) {
				System.out.println("사원번호 입력: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("이름 입력: ");
				String lastname = scn.nextLine();
				System.out.println("이메일 입력: ");
				String email = scn.nextLine();
				System.out.println("입사일 입력: ");
				String hireDate = scn.nextLine();
				System.out.println("JobID 입력: ");
				String jobId = scn.nextLine();

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setLastName(lastname);
				vo.setEmail(email);
				vo.setHireDate(hireDate);
				vo.setJobId(jobId);

				service.insertEmp(vo);

			} else if (selectNo == 4) {
				System.out.println("수정할 사원번호 입력: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 이메일 입력: ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호 입력: ");
				String phoneNumber = scn.nextLine();
				System.out.println("수정할 급여 입력: ");
				int salary = scn.nextInt();

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setSalary(salary);

				service.updateEmp(vo);
			} else if (selectNo == 5) {
				System.out.println("삭제할 사원번호를 입력: ");
				int empId = scn.nextInt();
				scn.nextLine();

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);

				service.deleteEmp(vo);
			} else if (selectNo == 6) {
				System.out.println("찾을 부서를 입력: ");
				scn.nextLine();
				String dept = scn.nextLine();

				List list = service.getDeptList(dept);
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}
			} else if (selectNo == 7) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}