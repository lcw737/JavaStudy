package common;

public class Person {

	//멤버변수
	private String name;
	private int age;
	//생성자(우클릭 소스 생성)
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//getter/setter (우클릭 소스 생성)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//객체의 정보를 반환 (우클릭 소스 생성)
	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d", name, age);
	}
}
