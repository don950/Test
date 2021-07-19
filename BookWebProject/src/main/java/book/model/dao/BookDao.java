package book.model.dao;

import java.sql.Connection;
import java.util.ArrayList;
import static common.JDBCTemp.*;
import book.model.vo.Book;

public class BookDao {
	public ArrayList<Book> selectBookList(Connection conn) {
		ArrayList<Book> list = new ArrayList<Book>();
		return list;	
	}
	
	public ArrayList<Book> selectTop10(Connection conn) {
		ArrayList<Book> list = new ArrayList<Book>();
		return list;
	}
	
	public ArrayList<Book> selectNewBookList(Connection conn) {
		ArrayList<Book> list = new ArrayList<Book>();
		return list;
	}
	public ArrayList<Book> selectBookStoreList(Connection conn) {
		ArrayList<Book> list = new ArrayList<Book>();
		return list;
		
	}
	
	public int selectBookDetail(Connection conn, int bookId){
		int result = 0;
		return result;
		
	}
	
	public int insertAdminBookInfo(Connection conn, Book book) {
		int result = 0;
		return result;
		
	}
	
	public int deleteAdminBookInfo(Connection conn, int bookId) {
		int result = 0;
		return result;
		
	}
	

}
