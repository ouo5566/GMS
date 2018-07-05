package dao;
import java.util.List;
import domain.*;

public interface RecordDAO {
	public void insertRecord(RecordBean record);
	public List<RecordBean> selectRecordList();
	public List<RecordBean> selectSome(String word);
	public RecordBean selectOne(RecordBean record);
	public String selectRecordCount();
	public void updateRecord(RecordBean record);
	public void deleteRecord(RecordBean record);
}
