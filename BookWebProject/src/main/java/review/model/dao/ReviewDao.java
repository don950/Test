package review.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import book.model.vo.Book;
import review.model.vo.Review;

public class ReviewDao {

	public ArrayList<Review> selectList(Connection conn){
		ArrayList<Review> list = new ArrayList<Review>();
		Statement stmt = null;
		ResultSet rset = null;
		
		return list;
	}
	
	public Review selectReview(Connection conn, int reviewcd) {
		Review review = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		return review;
	}
	
	public int insertReview(Connection conn, Review review) {
		int result = 0;
		
		return result;
	}
	

	public int updateReview(Connection conn, Review review) {
		int result = 0;

		return result;
	}
	

	public int deleteReview(Connection conn, int reviewcd) {
		int result = 0;
		
		return result;
	}

	public ArrayList<Review> selectTop6(Connection conn){
		ArrayList<Review> list = new ArrayList<Review>();
		Statement stmt = null;
		ResultSet rset = null;
		
		return list;
	}
	
	public Book selectCertificate(Connection conn, Book bookid) {	
		return bookid;
	}
	
	public Book selectCertificate(Connection conn, int bookid) {
		Book book = null;
		return book;
	}
}



