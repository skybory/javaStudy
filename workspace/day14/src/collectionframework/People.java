package collectionframework;

// 주소록 데이터를 표현하기 위한 javaBeans
public class People {
	private String name;
	private String phoneNo;
	
	//파라미터가 있는 생성자
	public People(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
