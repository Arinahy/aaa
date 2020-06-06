package Java_Design;

import java.sql.Date;
import java.util.List;
public interface LiteratureDAO {
	Literature selectById(long id);
	List<Literature> selectByTitle (String title);
	List<Literature> selectByAuthor (String author);
	List<Literature> selectByPublishTime (Date publishTime);
	void deleteById(long id) throws Exception;
	void update(Literature literature) throws Exception;
	void insert(Literature literature) throws Exception;
	List<Literature> loadFromFile(String filePath) throws Exception;
	void saveToFile(String filePath) throws Exception;
}
