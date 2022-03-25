package totalclass.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import totalclass.dao.OtherDAO;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class ReviewService {
	
	private ReviewService() {}// 생성자

	private static ReviewService instance;// 변수생성

	public static ReviewService getInstance() {
		if (instance == null) {
			instance = new ReviewService();
		}
		return instance;
	}

	private OtherDAO otherDAO = OtherDAO.getInstance();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date now = new Date();

	// 학생 Review 게시판 권한 - 완
	public int reviewStudent() {
		if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 1) {
			System.out.println("학생용 Review 입니다");
			rvStudentList();
			return View.MAIN;
		} else {
			System.out.println("권한이 없습니다.");
		}
		return View.MAIN;
	}
	
	// 학생 Review 게시글 목록 - 완
	public int rvStudentList() {
		List<Map<String, Object>> rvStudentList = OtherDAO.rvStudentList();

		System.out.println("=================[학생 Review]=================");
		System.out.println("번호\t과목\t제목\t작성자\t작성일");
		System.out.println("----------------------------------------------");
		for (Map<String, Object> REVIEW : rvStudentList) {
			System.out.println(REVIEW.get("RV_NUM") + "\t"
					+ REVIEW.get("SUB_NAME") + "\t"
					+ REVIEW.get("RV_TITLE") + "  "
					+ REVIEW.get("STU_ID") + "\t"
					+ sdf.format(REVIEW.get("RV_DATE")));
		}
		
		System.out.println("===============================================");
		System.out.println("1.조회\t2.등록\t0.돌아가기");
		System.out.print("입력>");
		
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			selectStudentRv();
			break;
		case 2:
			insertStudentRvAuth();
			break;
		case 0:
			break;
		default:
			System.out.println("번호를 잘못 입력하셨습니다.");
			rvStudentList();
			break;
		}
		return View.MAIN;
	}


	// 학생 Review 게시판 조회 - 완
	private void selectStudentRv() {
		System.out.println("조회할 게시글의 번호를 입력해주세요> ");
		int rvStudentNo = ScanUtil.nextInt();
		Map<String, Object> map = new HashMap<>();
		map.put("RV_NUM", rvStudentNo);

		List<Map<String, Object>> selectRvStudent = OtherDAO.selectRvStudent(map);
		String rvScore = null;
		if(((BigDecimal)selectRvStudent.get(0).get("RV_SCORE")).intValue() == 5) {
			rvScore = "★★★★★";
		} else if(((BigDecimal)selectRvStudent.get(0).get("RV_SCORE")).intValue() == 4) {
			rvScore = "★★★★☆";
		} else if(((BigDecimal)selectRvStudent.get(0).get("RV_SCORE")).intValue() == 3) {
			rvScore = "★★★☆☆";
		} else if(((BigDecimal)selectRvStudent.get(0).get("RV_SCORE")).intValue() == 2) {
			rvScore = "★★☆☆☆";
		} else {
			rvScore = "★☆☆☆☆";
		}	
		
		System.out.println("=================[학생 Review]=================");
		System.out.println("번호 : " + selectRvStudent.get(0).get("RV_NUM"));
		System.out.println("과목 : " + selectRvStudent.get(0).get("SUB_NAME"));
		System.out.println("강사 : " + selectRvStudent.get(0).get("LEC_NAME"));
		System.out.println("제목 : " + selectRvStudent.get(0).get("RV_TITLE"));
		System.out.println("내용 : " + selectRvStudent.get(0).get("RV_CONTENT"));
		System.out.println("평점 : " + rvScore);
		System.out.println("아이디 : " + selectRvStudent.get(0).get("STU_ID"));
		System.out.println("작성일 : " + sdf.format(selectRvStudent.get(0).get("RV_DATE")));
		
		System.out.println("============================================");
		System.out.println("1.수정\t2.삭제\t0.돌아가기");
		System.out.print("입력> ");
		
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			updateStudentRvAtuh(rvStudentNo);
			break;
		case 2:
			deleteStudentRvatuh(rvStudentNo);
			break;
		case 0:
			rvStudentList();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			selectStudentRv();
			break;
		}
	}
	
	// 학생 Review 게시판 수정권한 - 완
		public int updateStudentRvAtuh(int rvStudentNo) {
			Map<String, Object> map = new HashMap<>();

			map.put("RV_NUM", rvStudentNo);
			List<Map<String, Object>> selectRvStudent = OtherDAO.selectRvStudent(map);

			if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 1) {
					System.out.println("권한이 있습니다.");
					updateStudentRv(rvStudentNo);
			} else {
					System.out.println("권한이 없습니다.");
					rvStudentList();
			}
			return View.MAIN;
		}

		// 학생 Review 게시판 수정 - 완
		private void updateStudentRv(int rvStudentNo) {
			System.out.println("수정할 과목> ");
			String rvSubName = ScanUtil.nextLine();
			System.out.println("수정할 강사> ");
			String rvLecName = ScanUtil.nextLine();
			System.out.println("수정할 제목> ");
			String rvTitle = ScanUtil.nextLine();
			System.out.println("수정할 내용> ");
			String rvContent = ScanUtil.nextLine();
			System.out.println("수정할 평점> ");
			int rvScore = ScanUtil.nextInt();

			Map<String, Object> map = new HashMap<>();
			map.put("RV_NUM", rvStudentNo);
			map.put("SUB_NAME", rvSubName);
			map.put("LEC_NAME", rvLecName);
			map.put("RV_TITLE", rvTitle);
			map.put("RV_CONTENT", rvContent);
			map.put("RV_SCORE", rvScore);

			int result = OtherDAO.updateRvStudent(map);

			if (0 < result) {
				System.out.println("게시글이 수정 되었습니다.");
			} else {
				System.out.println("게시글이 수정을 실패하였습니다.");
			}
		}

		// 학생 Review 게시판 삭제권한 - 완
		public int deleteStudentRvatuh(int rvStudentNo) {
			Map<String, Object> map = new HashMap<>();

			map.put("RV_NUM", rvStudentNo);
			List<Map<String, Object>> selectRvStudent = OtherDAO.selectRvStudent(map);

			if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 1) {
					System.out.println("권한이 있습니다.");
					deleteStudentRv(rvStudentNo);
			} else {
				System.out.println("권한이 없습니다.");
				rvStudentList();
			}
			return View.MAIN;
		}

		// 학생 Review 게시판 삭제 - 완
		private void deleteStudentRv(int rvStudentNo) {
			System.out.println("현재 게시글을 삭제하시겠습니까? y or n");
			System.out.println("입력 > ");
			String input = ScanUtil.nextLine();

			switch (input) {
			case "Y":
			case "y":
				Map<String, Object> map = new HashMap<>();
				map.put("RV_NUM", rvStudentNo);
				int result = OtherDAO.deleteRvStudent(map);
				if (0 < result) {
					System.out.println("삭제를 완료하였습니다.");
				} else
					System.out.println("삭제를 실패하였습니다.");
				break;
			case "N":
			case "n":
				System.out.println("삭제를 취소하였습니다.");
				selectStudentRv();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println("이전메뉴로 돌아갑니다.");
				selectStudentRv();
				break;
			}
		}

		// 학생 Review 게시판 등록 권한 - 완
		public int insertStudentRvAuth() {
			if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 1) {
				System.out.println("권한이 있습니다.");
				insertStudentRv();
			} else {
				System.out.println("권한이 없습니다.");
				rvStudentList();
			}
			return View.MAIN;
		}

		
		// 학생 Review 게시글 등록 - 완
		private int insertStudentRv() {
			System.out.print("과목> ");
			String rvSubName = ScanUtil.nextLine();
			System.out.print("강사> ");
			String rvLecName = ScanUtil.nextLine();
			System.out.print("제목> ");
			String rvTitle = ScanUtil.nextLine();
			System.out.print("내용> ");
			String rvContent = ScanUtil.nextLine();
			System.out.print("평점> ");
			String rvScore = ScanUtil.nextLine();

			Map<String, Object> map = new HashMap<>();
			map.put("SUB_NAME", rvSubName);
			map.put("LEC_NAME", rvLecName);
			map.put("RV_TITLE", rvTitle);
			map.put("RV_CONTENT", rvContent);
			map.put("RV_SCORE", rvScore);
			map.put("STU_ID", MainService.login.get("STU_ID"));
			map.put("RV_DATE", sdf.format(now));

			int result = OtherDAO.insertStudentRv(map);

			if (0 < result) {
				System.out.println("등록하였습니다.");
			} else {
				System.out.println("등록에 실패하였습니다.");
			}
			return rvStudentList();
		}
		
		
		
		
		
		//---------------------------------------------------------------------------
	// ------------------------------------------------------------------------------
		
		
		
		
		
		// 관리자 Review 게시판 권한 - 완
		
		
		
		
		public int reviewLecturer() {
			if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
				System.out.println("관리자용 Review 입니다");
				rvLecturerList();
				return View.LECMAIN;
			} else {
				System.out.println("권한이 없습니다.");
			}
			return View.MAIN;
		}
		
		// 관리자 Review 게시글 목록 - 완
		public int rvLecturerList() {
			List<Map<String, Object>> rvLecturerList = OtherDAO.rvLecturerList();

			System.out.println("=================[관리자 Review]=================");
			System.out.println("번호\t과목\t제목\t아이디\t작성일");
			System.out.println("-----------------------------------------------");
			for (Map<String, Object> REVIEW : rvLecturerList) {
				System.out.println(REVIEW.get("RV_NUM") + "\t"
						+ REVIEW.get("SUB_NAME") + "\t"
						+ REVIEW.get("RV_TITLE") + "  "
						+ REVIEW.get("STU_ID") + "\t"
						+ sdf.format(REVIEW.get("RV_DATE")));
			}
			
			System.out.println("================================================");
			System.out.println("1.조회\t0.돌아가기");
			System.out.print("입력> ");
			
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				selectLecturerRv();
				break;
			case 0:
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				rvLecturerList();
				break;
			}
			return View.LECMAIN;
		}

		// 관리자 Review 게시판 조회 - 완
		private void selectLecturerRv() {
			System.out.print("조회할 게시글의 번호를 입력해주세요> ");
			int rvLecturerNo = ScanUtil.nextInt();
			Map<String, Object> map = new HashMap<>();
			map.put("RV_NUM", rvLecturerNo);

			List<Map<String, Object>> selectRvLecturer = OtherDAO.selectRvLecturer(map);
			String rvScore = null;
			if(((BigDecimal)selectRvLecturer.get(0).get("RV_SCORE")).intValue() == 5) {
				rvScore = "★★★★★";
			} else if(((BigDecimal)selectRvLecturer.get(0).get("RV_SCORE")).intValue() == 4) {
				rvScore = "★★★★☆";
			} else if(((BigDecimal)selectRvLecturer.get(0).get("RV_SCORE")).intValue() == 3) {
				rvScore = "★★★☆☆";
			} else if(((BigDecimal)selectRvLecturer.get(0).get("RV_SCORE")).intValue() == 2) {
				rvScore = "★★☆☆☆";
			} else {
				rvScore = "★☆☆☆☆";
			}	
			
			System.out.println("=================[관리자 Review]=================");
			System.out.println("번호 : " + selectRvLecturer.get(0).get("RV_NUM"));
			System.out.println("과목 : " + selectRvLecturer.get(0).get("SUB_NAME"));
			System.out.println("강사 : " + selectRvLecturer.get(0).get("LEC_NAME"));
			System.out.println("제목 : " + selectRvLecturer.get(0).get("RV_TITLE"));
			System.out.println("내용 : " + selectRvLecturer.get(0).get("RV_CONTENT"));
			System.out.println("평점 : " + rvScore);
			System.out.println("아이디 : " + selectRvLecturer.get(0).get("STU_ID"));
			System.out.println("작성일 : " + sdf.format(selectRvLecturer.get(0).get("RV_DATE")));
			
			System.out.println("================================================");
			System.out.println("1.삭제\t0.돌아가기");
			System.out.print("입력> ");
			
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				deleteLecturerRvatuh(rvLecturerNo);
				break;
			case 0:
				rvLecturerList();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				selectLecturerRv();
				break;
			}
		}

		// 관리자 Review 게시판 삭제권한 - 완
			public int deleteLecturerRvatuh(int rvLecturerNo) {
				Map<String, Object> map = new HashMap<>();
				map.put("RV_NUM", rvLecturerNo);
				List<Map<String, Object>> selectRvLecturer = OtherDAO.selectRvLecturer(map);
				if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
					System.out.println("권한이 있습니다.");
					deleteLecturerRv(rvLecturerNo);
				} else {
					System.out.println("권한이 없습니다.");
					rvLecturerList();
				}
				return View.LECMAIN;
			}
			
		// 관리자 Review 게시판 삭제 - 완
			private void deleteLecturerRv(int rvLecturerNo) {
				System.out.println("현재 게시글을 삭제하시겠습니까? y or n");
				System.out.print("입력 > ");
				String input = ScanUtil.nextLine();

				switch (input) {
				case "Y":
				case "y":
					Map<String, Object> map = new HashMap<>();
					map.put("RV_NUM", rvLecturerNo);
					int result = OtherDAO.deleteRvLecturer(map);
					if (0 < result) {
						System.out.println("삭제를 완료하였습니다.");
					} else
						System.out.println("삭제를 실패하였습니다.");
					break;
				case "N":
				case "n":
					System.out.println("삭제를 취소하였습니다.");
					selectLecturerRv();
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					System.out.println("이전메뉴로 돌아갑니다.");
					selectLecturerRv();
					break;
				}
			}
}		
		
		

