package service;
import java.util.ArrayList;
import java.util.List;

import dao.ExamDAOImpl;
import domain.*;

public class ExamServiceImpl implements ExamService{
	private static ExamService instance = new ExamServiceImpl();
	public static ExamService getInstance() {return instance;}
	private ExamServiceImpl() {}	

		@Override
	public void createExam(ExamBean exam) {
		ExamDAOImpl.getInstance().insertExam(exam);
	}

	@Override
	public List<ExamBean> list() {
		List<ExamBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<ExamBean> searchSome(String word) {
		List<ExamBean> result = new ArrayList<>();
		return result;
	}

	@Override
	public ExamBean searchOne(ExamBean exam) {
		ExamBean result = new ExamBean();
		return result;
	}

	@Override
	public String examCount() {
		String result = "";
		return result;
	}

	@Override
	public void modifyExam(ExamBean exam) {
		
	}

	@Override
	public void removeExam(ExamBean exam) {
		
	}

}
