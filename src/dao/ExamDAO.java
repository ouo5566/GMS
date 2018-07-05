package dao;
import java.util.List;
import domain.*;

public interface ExamDAO {
	public void insertExam(ExamBean exam);
	public List<ExamBean> selectExamList();
	public List<ExamBean> selectSome(String word);
	public ExamBean selectOne(ExamBean exam);
	public String selectExamCount();
	public void updateExam(ExamBean exam);
	public void deleteExam(ExamBean exam);	
}
