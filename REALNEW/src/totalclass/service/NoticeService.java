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

public class NoticeService {

	NoticeService(){}
	
	private static NoticeService instance;
	
	public static NoticeService getInstance(){
		if(instance == null){
			instance = new NoticeService();
		}
		return instance;
	}
	
	private OtherDAO otherDAO = OtherDAO.getInstance();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date now = new Date();
	
	
	// 공지사항 게시판 권한 - 완
	public int noticeLecturer() {
		if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
			System.out.println("관리자용 공지사항 입니다");
			ncLecturerList();
			return View.LECMAIN;
		} else {
			System.out.println("권한이 없습니다.");
		}
	return View.MAIN;
	}
		
	// 관리자 공지사항 목록 - 완
		public int ncLecturerList() {
			List<Map<String, Object>> ncLecturerList = OtherDAO.ncLecturerList();
			
			System.out.println("====================[공지사항]===================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------------------------");
			for (Map<String, Object> NOTICE : ncLecturerList) {
				System.out.println(NOTICE.get("NC_NUM") + "\t"
						+ NOTICE.get("NC_TITLE") + "\t"
						+ NOTICE.get("LEC_ID") + "\t"
						+ sdf.format(NOTICE.get("NC_DATE")));
			}
			System.out.println("=============================================");
			System.out.println("1.조회\t2.등록\t0.돌아가기");
			System.out.print("입력>");

			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				selectLecturerNc();
				break;
			case 2:
				insertLecturerNcAuth();
				break;
			case 0:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				ncLecturerList();
				break;
			}
			return View.MAIN;
		}

		// 관리자 공지사항 게시판 조회 - 완
		private void selectLecturerNc() {
			System.out.print("조회할 게시글의 번호를 입력해주세요> ");
			int ncLecturerNo = ScanUtil.nextInt();
			Map<String, Object> map = new HashMap<>();
			map.put("NC_NUM", ncLecturerNo);

			List<Map<String, Object>> selectNcLecturer = OtherDAO.selectNcLecturer(map);
			
			System.out.println("=================[학생 Notice]=================");
			System.out.println("번호 : " + selectNcLecturer.get(0).get("NC_NUM"));
			System.out.println("제목 : " + selectNcLecturer.get(0).get("NC_TITLE"));
			System.out.println("내용 : " + selectNcLecturer.get(0).get("NC_CONTENT"));
			System.out.println("작성자 : " + selectNcLecturer.get(0).get("LEC_ID"));
			System.out.println("작성일 : " + sdf.format(selectNcLecturer.get(0).get("NC_DATE")));
			
			System.out.println("============================================");
			System.out.println("1.수정\t2.삭제\t0.돌아가기");
			System.out.print("입력> ");
			
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				updateLecturerNcAtuh(ncLecturerNo);
				break;
			case 2:
				deleteLecturerNcatuh(ncLecturerNo);
				break;
			case 0:
				ncLecturerList();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				selectLecturerNc();
				break;
			}
		}
		
		// 관리자 공지사항 게시판 수정권한 - 완
			public int updateLecturerNcAtuh(int ncLecturerNo) {
				Map<String, Object> map = new HashMap<>();

				map.put("NC_NUM", ncLecturerNo);
				List<Map<String, Object>> selectNcLecturer = OtherDAO.selectNcLecturer(map);

				if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
						System.out.println("권한이 있습니다.");
						updateLecturerNc(ncLecturerNo);
						return View.MAIN;
				} else {
						System.out.println("권한이 없습니다.");
						ncLecturerList();
						return View.MAIN;
				}
			}

			// 관리자 공지사항 게시판 수정 - 완
			private void updateLecturerNc(int ncLecturerNo) {
				System.out.print("수정할 제목> ");
				String ncTitle = ScanUtil.nextLine();
				System.out.print("수정할 내용> ");
				String ncContent = ScanUtil.nextLine();

				Map<String, Object> map = new HashMap<>();
				map.put("NC_NUM", ncLecturerNo);
				map.put("NC_TITLE", ncTitle);
				map.put("NC_CONTENT", ncContent);

				int result = OtherDAO.updateNcLecturer(map);

				if (0 < result) {
					System.out.println("게시글이 수정 되었습니다.");
				} else {
					System.out.println("게시글이 수정을 실패하였습니다.");
				}
			}

			// 관리자 공지사항 게시판 삭제권한 - 완
			public int deleteLecturerNcatuh(int ncLecturerNo) {
				Map<String, Object> map = new HashMap<>();

				map.put("NC_NUM", ncLecturerNo);
				List<Map<String, Object>> selectNcLecturer = OtherDAO.selectNcLecturer(map);

				if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
						System.out.println("권한이 있습니다.");
						deleteLecturerNc(ncLecturerNo);
				} else {
					System.out.println("권한이 없습니다.");
					ncLecturerList();
				}
				return View.MAIN;
			}

			// 관리자 공지사항 게시판 삭제 - 완
			private void deleteLecturerNc(int ncLecturerNo) {
				System.out.println("현재 게시글을 삭제하시겠습니까? y or n");
				System.out.print("입력 > ");
				String input = ScanUtil.nextLine();

				switch (input) {
				case "Y":
				case "y":
					Map<String, Object> map = new HashMap<>();
					map.put("NC_NUM", ncLecturerNo);
					int result = OtherDAO.deleteNvLecturer(map);
					if (0 < result) {
						System.out.println("삭제를 완료하였습니다.");
					} else
						System.out.println("삭제를 실패하였습니다.");
					break;
				case "N":
				case "n":
					System.out.println("삭제를 취소하였습니다.");
					selectLecturerNc();
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					System.out.println("이전메뉴로 돌아갑니다.");
					selectLecturerNc();
					break;
				}
			}

			// 관리자 공지사항 게시판 등록 권한 - 완
			public int insertLecturerNcAuth() {
				if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
					System.out.println("권한이 있습니다.");
					insertLecturerNc();
				} else {
					System.out.println("권한이 없습니다.");
					ncLecturerList();
				}
				return View.MAIN;
			}

			
			// 관리자 공지사항 게시글 등록 - 완
			private int insertLecturerNc() {
				System.out.print("제목> ");
				String ncTitle = ScanUtil.nextLine();
				System.out.print("내용> ");
				String ncContent = ScanUtil.nextLine();

				Map<String, Object> map = new HashMap<>();
				map.put("NC_TITLE", ncTitle);
				map.put("NC_CONTENT", ncContent);
				map.put("LEC_ID", MainService.login.get("LEC_ID"));
				map.put("NC_DATE", sdf.format(now));

				int result = OtherDAO.insertLecturerNc(map);

				if (0 < result) {
					System.out.println("등록하였습니다.");
				} else {
					System.out.println("등록에 실패하였습니다.");
				}
				return ncLecturerList();
			}
	
// ----------------------------------------------------------------		
			
			// 학생 공지사항 게시판 권한 - 완
			public int noticeStudent() {
				if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 1) {
					System.out.println("학생용 공지사항 입니다");
					ncStudentList();
					return View.MAIN;
				} else {
					System.out.println("권한이 없습니다.");
				}
				return View.MAIN;
			}
			
			// 학생 공지사항 목록 - 완
			public int ncStudentList() {
				List<Map<String, Object>> ncStudentList = OtherDAO.ncStudentList();

				System.out.println("=================[학생 Notice]=================");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("---------------------------------------------");
				for (Map<String, Object> NOTICE : ncStudentList) {
					System.out.println(NOTICE.get("NC_NUM") + "\t"
							+ NOTICE.get("NC_TITLE") + "  "
							+ NOTICE.get("LEC_ID") + "\t"
							+ sdf.format(NOTICE.get("NC_DATE")));
				}
				
				System.out.println("============================================");
				System.out.println("1.조회\t0.돌아가기");
				System.out.print("입력> ");
				
				int input = ScanUtil.nextInt();
				switch (input) {
				case 1:
					selectStudentNc();
					break;
				case 0:
					break;
				default:
					System.out.println("번호를 잘못 입력하셨습니다.");
					ncStudentList();
					break;
				}
				return View.MAIN;
			}

			// 학생 공지사항 조회 - 완
			private void selectStudentNc() {
				System.out.print("조회할 게시글의 번호를 입력해주세요> ");
				int ncStudentNo = ScanUtil.nextInt();
				Map<String, Object> map = new HashMap<>();
				map.put("NC_NUM", ncStudentNo);

				List<Map<String, Object>> selectNcStudent = OtherDAO.selectNcStudent(map);
				
				System.out.println("=================[학생 Notice]=================");
				System.out.println("번호 : " + selectNcStudent.get(0).get("NC_NUM"));
				System.out.println("제목 : " + selectNcStudent.get(0).get("NC_TITLE"));
				System.out.println("내용 : " + selectNcStudent.get(0).get("NC_CONTENT"));
				System.out.println("아이디 : " + selectNcStudent.get(0).get("LEC_ID"));
				System.out.println("작성일 : " + sdf.format(selectNcStudent.get(0).get("NC_DATE")));
				
				System.out.println("============================================");
				System.out.println("1.삭제\t0.돌아가기");
				System.out.print("입력> ");
				
				int input = ScanUtil.nextInt();
				switch (input) {
				case 1:
					deleteStudentNcatuh(ncStudentNo);
					break;
				case 0:
					ncStudentList();
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					selectStudentNc();
					break;
				}
			}

			// 학생 공지사항 삭제권한 - 완
				public int deleteStudentNcatuh(int ncStudentNo) {
					Map<String, Object> map = new HashMap<>();
					map.put("RV_NUM", ncStudentNo);
					List<Map<String, Object>> selectNcStudent = OtherDAO.selectNcStudent(map);
					if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 1) {
						System.out.println("권한이 있습니다.");
						deleteStudentNc(ncStudentNo);
					} else {
						System.out.println("권한이 없습니다.");
						ncStudentList();
					}
					return View.MAIN;
				}
				
			// 학생 공지사항 삭제 - 완
				private void deleteStudentNc(int ncStudentNo) {
					System.out.println("현재 게시글을 삭제하시겠습니까? y or n");
					System.out.print("입력 > ");
					String input = ScanUtil.nextLine();

					switch (input) {
					case "Y":
					case "y":
						Map<String, Object> map = new HashMap<>();
						map.put("NC_NUM", ncStudentNo);
						int result = OtherDAO.deleteNcStudent(map);
						if (0 < result) {
							System.out.println("삭제를 완료하였습니다.");
						} else
							System.out.println("삭제를 실패하였습니다.");
						break;
					case "N":
					case "n":
						System.out.println("삭제를 취소하였습니다.");
						selectStudentNc();
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						System.out.println("이전메뉴로 돌아갑니다.");
						selectStudentNc();
						break;
					}
				}


}
