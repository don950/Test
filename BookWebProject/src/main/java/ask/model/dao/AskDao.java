package ask.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import ask.model.vo.Ask;

public class AskDao {

	   // +insertAsk(Ask ask):int							// 문의 등록(AskWrite)
	   // +listAskCount():int								// 문의 목록(AskList)
	   // +selectAskSearch(String keywords):ArrayList<Ask>		// 문의 검색(AskSearch)
	   // +selectAsk(int asknum):Ask						// 문의 상세(AskDetail)
	   // +updateAsk(Ask ask):int							// 문의 수정(AskUpdate)
	   // +updateAskReplyWrite(int asknum):int				// 문의 대댓글(AskReplyInsert)
	   // +deleteAsk(int asknum):int							// 문의 삭제(AskDelete)
	   // +insertAskWrite(Connection conn, Ask ask):int		// 문의 분류(AskClassIfication)

   public int insertAsk(Connection conn, Ask ask) {
      int result = 0;

      return result;
   }

   public int listAskCount(Connection conn) {
      int result = 0;

      return result;
   }

   public ArrayList<Ask> selectAskSearch(Connection conn, String keywords) {
      ArrayList<Ask> list = null;

      return list;
   }

   public Ask selectAsk(Connection conn, int asknum) {
      Ask ask = null;

      return ask;
   }

   public int updateAsk(Connection conn, Ask ask) {
      int result = 0;

      return result;
   }

   public int updateAskReplyWrite(Connection conn, int asknum) {
      int result = 0;

      return result;
   }

   public int deleteAsk(Connection conn, int asknum) {
      int result = 0;

      return result;
   }
   public int insertAskWrite(Connection conn, Ask ask) {
	   int result = 0;
	   
	   return result;
   }

}