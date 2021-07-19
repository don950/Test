package usedshop.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import usedshop.model.vo.UsedShop;

public class UsedShopDao {
	// +selectList(Connection):ArrayList
	// +getNewListCount(Connection conn):int
	// +selectUsedAuctionNewList(Connection conn):ArrayList<UsedShop>
	// +getBestListCount(Connection conn):int
	// +selectUsedAuctionBestList(Connection conn):ArrayList<UsedShop>
	// +getTimeLessListCount(Connection conn):int
	// +selectUsedAuctionTimeLessList(Connection conn):ArrayList<UsedShop>
	// +selectUsedNormalNewList(Connection conn):ArrayList<UsedShop>
	// +selectUsedNormalLowPriceList(Connection conn):ArrayList<UsedShop>
	// +selectUsedAuctionList(Connection conn):ArrayList<UsedShop>
	// +selectUsedNormalList(Connection conn):ArrayList<UsedShop>
	// +updateAuctionBid(Connection conn, int marketcd):int
	// +insertUsedAuction(Connection conn, UsedShop usedshop):int
	// +insertUsedNormal(Connection conn, UsedShop usedshop):int
	// +selectUsedAuction(Connection conn, int marketcd):UsedShop
	// +selectUsedNormal(Connection conn, int marketcd):UsedShop
	// +updateUsedAuction(Connection conn, UsedShop usedshop):int
	// +updateUsedNormal(Connection conn, UsedShop usedshop):int
	// +deleteUsedAuction(Connection conn, int marketcd):int
	// +deleteUsedNormal(Connection conn, int marketcd):int
	// +getListCount(Connection conn):int
	// +selectUsedAuctionSearchList(Connection conn):ArrayList<UsedShop>
	// +selectUsedNormalSearchList(Connection conn):ArrayList<UsedShop>
	
	public ArrayList<UsedShop> selectList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int getNewListCount(Connection conn) {
		int listCount = 0;
		return listCount;
	}

	public ArrayList<UsedShop> selectUsedAuctionNewList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int getBestListCount(Connection conn) {
		int listCount = 0;
		return listCount;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionBestList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int getTimeLessListCount(Connection conn) {
		int listCount = 0;
		return listCount;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionTimeLessList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalNewList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalLowPriceList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public int updateAuctionBid(Connection conn, int marketcd) {
		int result = 0;
		return result;
	}
	
	public int insertUsedAuction(Connection conn, UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public int insertUsedNormal(Connection conn, UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public UsedShop selectUsedAuction(Connection conn, int marketcd) {
		UsedShop usedshop = null;
		return usedshop;
	}
	
	public UsedShop selectUsedNormal(Connection conn, int marketcd) {
		UsedShop usedshop = null;
		return usedshop;
	}
	
	public int updateUsedAuction(Connection conn, UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public int updateUsedNormal(Connection conn, UsedShop usedshop) {
		int result = 0;
		return result;
	}
	
	public int deleteUsedAuction(Connection conn, int marketcd) {
		int result = 0;
		return result;
	}
	
	public int deleteUsedNormal(Connection conn, int marketcd) {
		int result = 0;
		return result;
	}

	public int getListCount(Connection conn) {
		int result = 0;
		return result;
	}
	
	public ArrayList<UsedShop> selectUsedAuctionSearchList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
	public ArrayList<UsedShop> selectUsedNormalSearchList(Connection conn) {
		ArrayList<UsedShop> list = null;
		return list;
	}
	
}
