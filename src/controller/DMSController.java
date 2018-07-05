package controller;
import javax.swing.JOptionPane;
import domain.*;
import service.*;
enum Butt {EXIT, EXAM_NAME, EXAM_SCORE};

public class DMSController {
	private static DMSController instance = new DMSController();
	public static DMSController getInstance() {return instance;}
	private DMSController() {}
	
	public static void main(String[] args) {
		ExamBean exam = null;
		Butt[] button = {Butt.EXIT, Butt.EXAM_NAME, Butt.EXAM_SCORE};
		while(true) {
			switch((Butt)JOptionPane.showInputDialog(null,"무엇을 도와드릴까요?","BIT_SCHOOL",JOptionPane.QUESTION_MESSAGE,null,button,null)) {
				case EXIT : return;
				case EXAM_NAME : 
					exam = new ExamBean();
					//exam.setMemberId(MemberServiceImpl.getInstance().searchSome(JOptionPane.showInputDialog("NAME?")).get(0).getMemberId());
					exam.setMemberId(JOptionPane.showInputDialog("ID?"));
					exam.setMonth(JOptionPane.showInputDialog("MONTH?"));
					ExamServiceImpl.getInstance().createExam(exam);
					break;
				case EXAM_SCORE : 
					exam = new ExamBean();
					exam.setScore(JOptionPane.showInputDialog("SCORE : Java,SQL,HTML5,R,Python"));
					ExamServiceImpl.getInstance().createExam(exam);
					break;
			}
		}
	}
}
