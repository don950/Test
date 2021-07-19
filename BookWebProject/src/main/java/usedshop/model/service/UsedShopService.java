package usedshop.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import usedshop.model.dao.UsedShopDao;
import usedshop.model.vo.UsedShop;

public class UsedShopService {
	// +selectList():ArrayList
	// +getNewListCount():int
	// +selectUsedAuctionNewList():ArrayList<UsedShop>
	// +getBestListCount():int
	// +selectUsedAuctionBestList():ArrayList<UsedShop>
	// +getTimeLessListCount():int
	// +selectUsedAuctionTimeLessList():ArrayList<UsedShop>
	// +selectUsedNormalNewList():ArrayList<UsedShop>
	// +selectUsedNormalLowPriceList():ArrayList<UsedShop>
	// +selectUsedAuctionList():ArrayList<UsedShop>
	// +selectUsedNormalList():ArrayList<UsedShop>
	// +updateAuctionBid(int marketcd):int
	// +insertUsedAuction(Connection conn, UsedShop usedshop):int
	// +insertUsedNormal(Connection conn, UsedShop usedshop):int
	// +selectUsedAuction(int marketcd):UsedShop
	// +selectUsedNormal(int marketcd):UsedShop
	// +updateUsedAuction(UsedShop usedshop):int
	// +updateUsedNormal(UsedShop usedshop):int
	// +deleteUsedAuction(int marketcd):int
	// +deleteUsedNormal(int marketcd):int
	// +getListCount():int
	// +selectUsedAuctionSearchList():ArrayList<UsedShop>
	// +selectUsedNormalSearchList():ArrayList<UsedShop>
	
	public ArrayList<UsedShop> selectList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int getNewListCount() {
		int listCount = 0;
		return listCount;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionNewList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int getBestListCount() {
		int listCount = 0;
		return listCount;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionBestList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int getTimeLessListCount() {
		int listCount = 0;
		return listCount;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionTimeLessList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalNewList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalLowPriceList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int updateAuctionBid(int marketcd) {
		int result = 0;
		return result;
	}
	
	public int insertUsedAuction(UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public int insertUsedNormal(UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public UsedShop selectUsedAuction(int marketcd) {
		UsedShop usedshop = null;
		return usedshop;
	}
	
	public UsedShop selectUsedNormal(int marketcd) {
		UsedShop usedshop = null;
		return usedshop;
	}

	public int updateUsedAuction(UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public int updateUsedNormal(UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public int deleteUsedAuction(int marketcd) {
		int result = 0;
		return result;
	}
	
	public int deleteUsedNormal(int marketcd) {
		int result = 0;
		return result;
	}
	
	public int getListCount() {
		int result = 0;
		return result;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionSearchList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalSearchList() {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
}
