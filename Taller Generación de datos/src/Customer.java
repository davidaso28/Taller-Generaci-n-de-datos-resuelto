import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import uk.co.jemos.podam.common.PodamIntValue;
import uk.co.jemos.podam.common.PodamStringValue;
@DatabaseTable(tableName = "Customers")
public class Customer {
	@PodamIntValue()
	@DatabaseField(generatedId = true)
	private int id;
	@PodamStringValue(length = 20)
	@DatabaseField(columnName = "NAME", canBeNull = false)
	private String name;
	@PodamStringValue(length = 20)
	@DatabaseField(columnName = "LASTNAME", canBeNull = false)
	private String lastname;
	@PodamStringValue(length = 20)
	@DatabaseField(columnName = "AGE", canBeNull = false)
	private int age;
	@PodamStringValue(length = 20)
	@DatabaseField(columnName = "NICKNAME", canBeNull = false)
	private String nickname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Customer(int id, String name, String lastname, int age, String nickname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.nickname = nickname;
	}
	public Customer() {
		super();
	}
	
	
	
	
}
