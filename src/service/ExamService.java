package service;
import java.util.List;
import domain.*;

public interface ExamService {
	public void createExam(ExamBean exam);
	public List<ExamBean> list();
	public List<ExamBean> searchSome(String word);
	public ExamBean searchOne(ExamBean exam);
	public String examCount();
	public void modifyExam(ExamBean exam);
	public void removeExam(ExamBean exam);
}
