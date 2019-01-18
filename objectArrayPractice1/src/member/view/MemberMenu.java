package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberManager mManager = new MemberManager();

	public MemberMenu() {
	}

	public void mainMenu() {
		boolean flag = true;
		do {
			System.out.println("최대 등록 가능한 회원 수는 " + mManager.SIZE + " 명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mManager.getMemberCount() + "명 입니다.");
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				mManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("정말로 끝내시겠습니까? (y/n) : ");
				char answer = sc.nextLine().charAt(0);
				if (answer == 'y' || answer == 'Y') {
					System.out.println("메뉴 프로그램 종료");
					return;
				}
				break;
			}
		} while (flag);
	}

	public void searchMenu() {
		while (true) {
			System.out.println("***** 회원 정보 검색 메뉴 *****");
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int index = -1, menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {

			case 1:
				System.out.print("아이디 입력 : ");
				String id = sc.nextLine();
				index = mManager.searchMemberId(id);
				System.out.println("아이디로 검색 index : " + index);
				break;
			case 2:
				System.out.print("이름 입력 : ");
				String name = sc.nextLine();
				index = mManager.searchMemberName(name);
				break;
			case 3:
				System.out.print("이메일 입력 : ");
				String email = sc.nextLine();
				index = mManager.searchMemberEmail(email);
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			}
			if (index > -1) {
				System.out.println("mManager 호출");
				mManager.printMember(index);
			} else {
				System.out.println("회원정보가 존재하지 않습니다.");
			}
		}
	}

	public void sortMenu() {
		while (true) {
			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				mManager.sortIDAsc();
				break;
			case 2:
				mManager.sortIDDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			}
		}
	}

	public void modifyMenu() {
		while (true) {
			System.out.println("***** 회원 정보 수정 메뉴 *****");
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int index = -1, menu = sc.nextInt();
			sc.nextLine();
			if (menu != 9) {
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				index = mManager.searchMemberId(id);
			}
			switch (menu) {

			case 1:
				if (index > -1) {
					mManager.printMember(index);
					System.out.print("변경할 암호 : ");
					String pw = sc.nextLine();
					mManager.getMar()[index].setPassword(pw);
					System.out.println("회원의 정보가 변경되었습니다.");
				} else {
					System.out.println("아이디가 존재하지 않습니다!");
				}

				break;
			case 2:
				if (index > -1) {
					mManager.printMember(index);
					System.out.print("변경할 이메일 : ");
					String email = sc.nextLine();
					mManager.getMar()[index].setEmail(email);
					System.out.println("회원의 정보가 변경되었습니다.");
				} else {
					System.out.println("아이디가 존재하지 않습니다!");
				}
				break;
			case 3:
				if (index > -1) {
					mManager.printMember(index);
					System.out.print("변경할 이메일 : ");
					String email = sc.nextLine();
					mManager.getMar()[index].setEmail(email);
					System.out.println("회원의 정보가 변경되었습니다.");
				} else {
					System.out.println("아이디가 존재하지 않습니다!");
				}
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			}
		}
	}
}
