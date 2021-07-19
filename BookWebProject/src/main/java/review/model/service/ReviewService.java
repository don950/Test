package review.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import book.model.vo.Book;
import review.model.dao.ReviewDao;
import review.model.vo.Review;

public class ReviewService {
	private ReviewDao rdao = new ReviewDao();
	
	public ArrayList<Review> selectList()	{
		Connection conn = getConnection();
		ArrayList<Review> list = rdao.selectList(conn);
		close(conn);
		return list;

	}

	public Review selectReview(int reviewcd) {
		Review review = null;
		return review;
	}
	
	public int insertReview(Review review) {
		int result = 0;
		return result;
	}
	
	public int updateReview(Review review) {
		int result = 0;
		return result;
	}
	
	public int deleteReview(int reviewcd) {
		int result = 0;
		return result;
	}
	
	public ArrayList<Review> selectTop6()	{
		Connection conn = getConnection();
		ArrayList<Review> list = rdao.selectList(conn);
		close(conn);
		return list;

	}
	
	public Book selectCertificate(int bookid) {
		Book book = null;
		return book;
	}
}
