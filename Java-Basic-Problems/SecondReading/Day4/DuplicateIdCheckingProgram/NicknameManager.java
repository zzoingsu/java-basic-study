package SecondReading.Day4.DuplicateIdCheckingProgram;

import java.util.HashSet;
import java.util.Set;

public class NicknameManager {
	private Set<String> nicknames = new HashSet<>();
	
	public void addNickname(String nickname) {
		validNickname(nickname);
		if(!nicknames.add(nickname)) {
			System.out.println("이미 사용중인 닉네임입니다");
		}
	}
	public boolean containsNickname(String nickname) {
		return nicknames.contains(nickname);
	}
	public void removeNickname(String nickname) {
		validNickname(nickname);
		if(!nicknames.remove(nickname)) {
			System.out.println("존재하지 않는 닉네임입니다");
			return;
		}
	}
	public void printNicknames() {
		for(String nickname : nicknames) {
			System.out.println(nickname);
		}
	}
	
	public static void validNickname(String nickname) {
		if(nickname == null || nickname.isBlank()) {
			throw new IllegalArgumentException("닉네임은 빈칸일 수 없습니다");
		}
	}
}
