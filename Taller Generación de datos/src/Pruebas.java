import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

class Pruebas {
	private Dao<Book, Integer> bookDao;
	private Dao<Author, Integer> authorDao;
	private Dao<Customer, Integer> customerDao;
	private final static String DATABASE_URL = "jdbc:mysql://localhost/taller7";
	
	@Test
	void testAuthor() throws Exception  {
	
		JdbcConnectionSource connectionSource = null;
			connectionSource = new JdbcConnectionSource(DATABASE_URL,"root","root");
			authorDao = DaoManager.createDao(connectionSource, Author.class);
			PodamFactory factory = new PodamFactoryImpl();
			// This will use constructor with maximum arguments and
			// then setters to populate POJO
			Author author = factory.manufacturePojoWithFullData(Author.class);
			author.setBirthdate(new Date(10, 10,10));
			authorDao.create(author);
			if (connectionSource != null) {
				connectionSource.close();
			}
		
	}
	
	@Test
	void testCustomer() throws Exception  {
	
		JdbcConnectionSource connectionSource = null;
			connectionSource = new JdbcConnectionSource(DATABASE_URL,"root","root");
			customerDao = DaoManager.createDao(connectionSource, Customer.class);
			PodamFactory factory = new PodamFactoryImpl();
			// This will use constructor with maximum arguments and
			// then setters to populate POJO
			Customer customer = factory.manufacturePojoWithFullData(Customer.class);
			
			customerDao.create(customer);
			if (connectionSource != null) {
				connectionSource.close();
			}
		
	}
	
	@Test
	void testBooks() throws Exception  {
	
		JdbcConnectionSource connectionSource = null;
		connectionSource = new JdbcConnectionSource(DATABASE_URL,"root","root");
		authorDao = DaoManager.createDao(connectionSource, Author.class);
		bookDao = DaoManager.createDao(connectionSource, Book.class);
		PodamFactory factory = new PodamFactoryImpl();
		// This will use constructor with maximum arguments and
		// then setters to populate POJO
		Author author = factory.manufacturePojoWithFullData(Author.class);
		author.setBirthdate(new Date(2018, 10,28));
		authorDao.create(author);
		Book book = factory.manufacturePojoWithFullData(Book.class);
		book.setAuthor(author);
		bookDao.create(book);
		if (connectionSource != null) {
			connectionSource.close();
		}
		
	}
	 
	 

}
