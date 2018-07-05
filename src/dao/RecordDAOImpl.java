package dao;

import java.util.ArrayList;
import java.util.List;
import domain.*;

public class RecordDAOImpl implements RecordDAO{
	private static RecordDAO instance = new RecordDAOImpl();
	public static RecordDAO getInstance() {return instance;}
	private RecordDAOImpl() {}

	@Override
	public void insertRecord(RecordBean record) {
		
	}

	@Override
	public List<RecordBean> selectRecordList() {
		List<RecordBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<RecordBean> selectSome(String word) {
		List<RecordBean> result = new ArrayList<>();
		return result;
	}

	@Override
	public RecordBean selectOne(RecordBean record) {
		RecordBean result = new RecordBean();
		return result;
	}

	@Override
	public String selectRecordCount() {
		String result = "";
		return result;
	}

	@Override
	public void updateRecord(RecordBean record) {
		
	}

	@Override
	public void deleteRecord(RecordBean record) {
		
	}
}
