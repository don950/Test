package notice.model.service;

import java.util.ArrayList;

import notice.model.vo.Notice;

public class NoticeService {
		// +InsertNotice(Notice noitce):int											공지 등록(AskedWrite)
		// +listNoitceCount():int 													공지 목록(NoticeList)
		// +deleteNotice(int noticeno):int 											공지 삭제(NoticeDelete)
		// +updateNotice(Notice notice):int											공지 수정(NoticeUpdate)
		// +ArrayList<Notice> selectNoticeSearch(String keywords):ArrayList<Notice>  		공지 검색(NoticeSearch)
		// +ArrayList<Notice> selectNoticeUpdateView(int notice):ArrayList<Notice>  		공지 고정(NoticeImportant)
		// +ArrayList<Notice> selectNoticeUpdateView(Connection conn, int noticenum)		공지 수정페이지(NoticeUpdateView)
	
	public int InsertNotice(Notice noitce) {
		int result = 0;
		
		return result;
	}
	
	public int listNoitceCount(){
		int result =0;
		
		return result;
	}
	
	public int deleteNotice(int noticeno) {
		int result = 0;
		
		return result;
		
	}
	public int updateNotice(Notice notice) {
		int result = 0;
		
		return result;
	}
	
	public ArrayList<Notice> selectNoticeSearch(String keywords){
		ArrayList<Notice> list = null;
		
		return list;
	}
	
	public Notice selectNotice(int noticenum) {
		 Notice notice = null;
		 
		 return notice;
	}
	
	public ArrayList<Notice> selectNoticeUpdateView(int notice) {
		ArrayList<Notice> list = null;
		
		return list;
	}
	
}