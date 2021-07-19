package book.model.service;

import static common.JDBCTemp.*;
import java.sql.Connection;
import java.util.ArrayList;

import book.model.dao.BookDao;
import book.model.vo.Book;

public class BookService {
	private BookDao bdao = new BookDao();
	
	public ArrayList<Book> selectBookList() {
		Connection conn = getConnection();
		ArrayList<Book> list = bdao.selectBookList(conn);
		close(conn);
		return list;
	}
	
	public ArrayList<Book> selectTop10(){
		Connection conn = getConnection();
		ArrayList<Book> list = bdao.selectTop10(conn);
		close(conn);
		return list;
	}
	
	public ArrayList<Book> selectNewBookList() {
		Connection conn = getConnection();
		ArrayList<Book> list = bdao.selectNewBookList(conn);
		close(conn);
		return list;
		
	}
	public ArrayList<Book> selectBookStoreList() {
		Connection conn = getConnection();
		ArrayList<Book> list = bdao.selectBookStoreList(conn);
		close(conn);
		return list;
	}

	
	public int selectBookDetail(int bookId){
		int result = 0;
		return result;
		
	}
	
	public int insertAdminBookInfo(Book book) {
		int result = 0;
		return result;
		
	}
	
	public int deleteAdminBookInfo(int bookId) {
		int result = 0;
		return result;
		
	}

}
