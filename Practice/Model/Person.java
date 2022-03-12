package Model;

import java.util.Arrays;

public class Person {
	private String name, gender, birthday, occupation;
	private String[] hobby;

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "姓名: " + name +
				"<br>性別: " + gender +
				"<br>生日: " + birthday +
				"<br>興趣: " + Arrays.toString(hobby)+
				"<br>職業: " + occupation;
	}

}