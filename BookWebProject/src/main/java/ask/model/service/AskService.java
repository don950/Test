package ask.model.service;

import java.util.ArrayList;

import ask.model.vo.Ask;

public class AskService {

   // +insertAsk(Ask ask):int							// 문의 등록(AskWrite)
   // +listAskCount():int								// 문의 목록(AskList)
   // +selectAskSearch(String keywords):ArrayList<Ask>		// 문의 검색(AskSearch)
   // +selectAsk(int asknum):Ask						// 문의 상세(AskDetail)
   // +updateAsk(Ask ask):int							// 문의 수정(AskUpdate)
   // +updateAskReplyWrite(int asknum):int				// 문의 대댓글(AskReplyInsert)
   // +deleteAsk(int asknum):int							// 문의 삭제(AskDelete)

   public int insertAsk(Ask ask) {
      int result = 0;

      return result;
   }

   public int listAskCount() {
      int result = 0;

      return result;
   }

   public ArrayList<Ask> selectAskSearch(String keywords) {
      ArrayList<Ask> list = null;

      return list;
   }

   public Ask selectAsk(int asknum) {
      Ask ask = null;

      return ask;
   }

   public int updateAsk(Ask ask) {
      int result = 0;

      return result;
   }

   public int updateAskReplyWrite(int asknum) {
      int result = 0;

      return result;
   }

   public int deleteAsk(int asknum) {
      int result = 0;

      return result;
   }
   public int insertAskWrite(Ask ask) {
	   int result = 0;
	   
	   return result;
   }

}