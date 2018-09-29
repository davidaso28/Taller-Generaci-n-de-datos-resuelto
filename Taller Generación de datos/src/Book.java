import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import uk.co.jemos.podam.common.PodamExclude;
import uk.co.jemos.podam.common.PodamIntValue;
import uk.co.jemos.podam.common.PodamStringValue;

@DatabaseTable(tableName = "Books")
public class Book {
	
	@PodamIntValue()
	@DatabaseField(generatedId = true)
	private int Id;
	@PodamStringValue(length = 3)
	@DatabaseField(columnName = "NAME", canBeNull = false)
	private String name;
	@PodamIntValue()
	@DatabaseField(columnName = "YEAR", canBeNull = false)
	private int year;
	@PodamStringValue(length = 3)
	@DatabaseField(columnName = "URL", canBeNull = false)
	private String url;
	@PodamExclude
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "AUTHOR")
	private Author author;
	@PodamStringValue(length = 3)
	@DatabaseField(columnName = "EDITORIAL", canBeNull = false)
	private String editorial;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Book(int id, String name, int year, String url, Author author, String editorial) {
		super();
		Id = id;
		this.name = name;
		this.year = year;
		this.url = url;
		this.author = author;
		this.editorial = editorial;
	}
	public Book() {
		
	}
	
	
}
