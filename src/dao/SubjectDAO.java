package dao;
import java.util.List;
import domain.*;

public interface SubjectDAO {
	public void insertSubject(SubjectBean subject);
	public List<SubjectBean> selectSubjectList();
	public List<SubjectBean> selectSome();
	public SubjectBean selectOne();
	public String selectSubjectCount();
	public void updateSubject(SubjectBean subject);
	public void deleteSubject(SubjectBean subject);
}
