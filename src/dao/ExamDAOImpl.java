package dao;

import java.util.ArrayList;
import java.util.List;
import domain.*;

public class ExamDAOImpl implements ExamDAO{
	private static ExamDAO instance = new ExamDAOImpl();
	public static ExamDAO getInstance() {return instance;}
	private ExamDAOImpl() {}
	
	@Override
	public void insertExam(ExamBean exam) {
		System.out.println("정보 잘 받았슈\n잘 저장하겠슈");
	}

	@Override
	public List<ExamBean> selectExamList() {
		List<ExamBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<ExamBean> selectSome(String word) {
		List<ExamBean> result = new ArrayList<>();
		return result;
	}

	@Override
	public ExamBean selectOne(ExamBean exam) {
		ExamBean result = new ExamBean();
		return result;
	}

	@Override
	public String selectExamCount() {
		String result = "";
		return result;
	}

	@Override
	public void updateExam(ExamBean exam) {
		
	}

	@Override
	public void deleteExam(ExamBean exam) {
		
	}

}
