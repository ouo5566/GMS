package service;
import java.util.ArrayList;
import java.util.List;
import domain.*;

public class RecordServiceImpl implements RecordService{
	private static RecordService instance = new RecordServiceImpl();
	public static RecordService getInstance() {return instance;}
	private RecordServiceImpl() {}

	@Override
	public void createRecord(RecordBean record) {
	
	}

	@Override
	public List<RecordBean> list() {
		List<RecordBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<RecordBean> searchSome(String word) {
		List<RecordBean> result = new ArrayList<>();
		return result;
	}

	@Override
	public RecordBean searchOne(RecordBean record) {
		RecordBean result = new RecordBean();
		return result;
	}

	@Override
	public String countRecord() {
		String result = "";
		return result;
	}

	@Override
	public void changeRecord() {
		
	}

	@Override
	public void removeRecord() {
		
	}

}
