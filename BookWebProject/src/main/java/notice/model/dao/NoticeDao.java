package notice.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.vo.Notice;

public class NoticeDao {

	

	public int InsertNotice(Connection conn, Notice notice) {
		int result = 0;
		
		return result;
	}
	
	public int listNoitceCount(Connection conn){
		int result = 0;
		
		return result;
	}
	
	public int deleteNotice(Connection conn, int noticeNum) {
		int result = 0;
		
		return result;
	}
	
	public int updateNotice(Connection conn, Notice notice) {
		int result = 0;
		
		return result;
	}
	
	public ArrayList<Notice> selectNoticeSearch(Connection conn, String keywords){
		ArrayList<Notice> list = null;
		
		return list;
	}
	
	public Notice selectNotice(Connection conn, int noticeNum) {
		Notice notice = null;
		
		return notice;
	}
	
	public ArrayList<Notice> selectNoticeUpdateView(Connection conn, int noticenum) {
		ArrayList<Notice> list = null;
		
		return list;
	}
	
}
