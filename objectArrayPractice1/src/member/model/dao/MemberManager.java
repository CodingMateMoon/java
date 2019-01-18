package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {

	public static int SIZE = 10;
	private int memberCount;
	// String id, String name, String password, String email, char gender, int age
	private Member[] mar = new Member[SIZE];
	static Scanner sc = new Scanner(System.in);
	{
		mar[0] = new Member("kim123*3", "김유신", "pwkkk34!", "kim123@naver.com", 'M', 35);
		mar[1] = new Member("qwe432", "신유현", "1234", "sin@daum.net", 'M', 25);
		mar[2] = new Member("asd123", "한예슬", "4321", "arthan@daum.net", 'F', 35);
		mar[3] = new Member("zxc234", "홍길동", "5678", "hong@gmail.com", 'M', 23);
		mar[4] = new Member("yksrose77", "윤경숙", "yksrose77", "yksrose77@daum.net", 'F', 29);
		memberCount = 5;
	}

	public MemberManager() {
	}

	public int getMemberCount() {
		return memberCount;
	}
	

	public Member[] getMar() {
		return mar;
	}

	public void setMar(Member[] mar) {
		this.mar = mar;
	}

	public void memberInput() {
		if (memberCount < 10) {
			// String id, String name, String password, String email, char gender, int age
			Member m = new Member();
			System.out.print("id : ");
			m.setId(sc.nextLine());
			System.out.print("이름 : ");
			m.setName(sc.nextLine());
			System.out.print("비밀번호 : ");
			m.setPassword(sc.nextLine());
			System.out.print("이메일 : ");
			m.setEmail(sc.nextLine());
			System.out.print("성별 : ");
			m.setGender(sc.nextLine().charAt(0));
			System.out.print("나이 : ");
			m.setAge(sc.nextInt());
			sc.nextLine();
			mar[memberCount++] = m;
		}
	}

	public void deleteMember() {
		
		int i, j, index;
		System.out.print("삭제할 아이디 입력 : ");
		String id = sc.nextLine();
		index = searchMemberId(id);
		if (index != -1) {
			System.out.println(mar[index].memberInfo());
			System.out.print("정말로 삭제하시겠습니까? (y/n) ");
			char accept = sc.nextLine().charAt(0);
			if (accept == 'Y' || accept == 'y') {
				
				if (index != memberCount - 1) {
					for (i = index; i < memberCount - 1; i++) {
						mar[i] = mar[i + 1];
					}
					mar[memberCount - 1] = null;
				} else {
					mar[index] = null;
				}
				memberCount--;
			}
		} else {
			System.out.println("아이디를 찾을 수 없습니다.");
		}
		
	}

	public void printAllMember() {
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar[i].memberInfo());
		}
	}
	
	public int searchMemberId(String id) {
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	public int searchMemberName(String name) {
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int searchMemberEmail(String email) {
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].getEmail().equals(email)) {
				return i;
			}
		}
		return -1;
	}
	
	public void printMember(int index) {
		System.out.println(mar[index].memberInfo());
	}
	
	public void sortIDAsc() {
		int i, j, minIndex;
		Member[] mems = new Member[memberCount];
		// String id, String name, String password, String email, char gender, int age
		for (i = 0; i < memberCount; i++) {
			mems[i] = new Member(mar[i].getId(), mar[i].getName(), mar[i].getPassword(), mar[i].getEmail()
					, mar[i].getGender(), mar[i].getAge());
		}
		
		for (i = 0; i < memberCount - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < memberCount; j++) {
				if (mems[minIndex].getId().compareTo(mems[j].getId()) > 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				Member temp = mems[i];
				mems[i] = mems[minIndex];
				mems[minIndex] = temp;
			}
		}
		
		for (i = 0; i < memberCount; i++) {
			System.out.println(mems[i].memberInfo());
		}
	}
	
	public void sortIDDes() {
		int i, j, maxIndex;
		Member[] mems = new Member[memberCount];
		// String id, String name, String password, String email, char gender, int age
		for (i = 0; i < memberCount; i++) {
			mems[i] = new Member(mar[i].getId(), mar[i].getName(), mar[i].getPassword(), mar[i].getEmail()
					, mar[i].getGender(), mar[i].getAge());
		}
		
		for (i = 0; i < memberCount - 1; i++) {
			maxIndex = i;
			for (j = i + 1; j < memberCount; j++) {
				if (mems[maxIndex].getId().compareTo(mems[j].getId()) < 0) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				Member temp = mems[i];
				mems[i] = mems[maxIndex];
				mems[maxIndex] = temp;
			}
		}
		
		for (i = 0; i < memberCount; i++) {
			System.out.println(mems[i].memberInfo());
		}
	}
	
	public void sortAgeAsc() {
		int i, j, minIndex;
		Member[] mems = new Member[memberCount];
		// String id, String name, String password, String email, char gender, int age
		for (i = 0; i < memberCount; i++) {
			mems[i] = new Member(mar[i].getId(), mar[i].getName(), mar[i].getPassword(), mar[i].getEmail()
					, mar[i].getGender(), mar[i].getAge());
		}
		
		for (i = 0; i < memberCount - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < memberCount; j++) {
				if (mems[minIndex].getAge() > mems[j].getAge()) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				Member temp = mems[i];
				mems[i] = mems[minIndex];
				mems[minIndex] = temp;
			}
		}
		
		for (i = 0; i < memberCount; i++) {
			System.out.println(mems[i].memberInfo());
		}
	}
	
	public void sortAgeDes() {
		int i, j, minIndex;
		Member[] mems = new Member[memberCount];
		// String id, String name, String password, String email, char gender, int age
		for (i = 0; i < memberCount; i++) {
			mems[i] = new Member(mar[i].getId(), mar[i].getName(), mar[i].getPassword(), mar[i].getEmail()
					, mar[i].getGender(), mar[i].getAge());
		}
		
		for (i = 0; i < memberCount - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < memberCount; j++) {
				if (mems[minIndex].getAge() < mems[j].getAge()) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				Member temp = mems[i];
				mems[i] = mems[minIndex];
				mems[minIndex] = temp;
			}
		}
		
		for (i = 0; i < memberCount; i++) {
			System.out.println(mems[i].memberInfo());
		}
	}
	
	public void sortGenderDes() {
		int i, j, maxIndex;
		Member[] mems = new Member[memberCount];
		// String id, String name, String password, String email, char gender, int age
		for (i = 0; i < memberCount; i++) {
			mems[i] = new Member(mar[i].getId(), mar[i].getName(), mar[i].getPassword(), mar[i].getEmail()
					, mar[i].getGender(), mar[i].getAge());
		}
		
		for (i = 0; i < memberCount - 1; i++) {
			maxIndex = i;
			for (j = i + 1; j < memberCount; j++) {
				if (mems[maxIndex].getGender() < mems[j].getGender()) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				Member temp = mems[i];
				mems[i] = mems[maxIndex];
				mems[maxIndex] = temp;
			}
		}
		
		for (i = 0; i < memberCount; i++) {
			System.out.println(mems[i].memberInfo());
		}
	}
	
	public Member findMember(int index) {
		return mar[index];
	}
}
