package day18.silsub;

public class CharacterProcess {

	public CharacterProcess() {}
	
	public int countAlpha(String s) throws CharCheckException{
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
				count++;
			} else if (c == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
			}
		}
		return count;
	}
}
