package controller;
import java.util.List;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
enum Butt {EXIT, EXAM_NAME, EXAM_SCORE};

public class GMSController {
	public static void main(String[] args) {
		ExamBean exam = null;
		MemberBean member = null;
		Butt[] button = {Butt.EXIT, Butt.EXAM_NAME, Butt.EXAM_SCORE};
		while(true) {
			switch((Butt)JOptionPane.showInputDialog(null,"무엇을 도와드릴까요?","BIT_SCHOOL",JOptionPane.QUESTION_MESSAGE,null,button,null)) {
				case EXIT : return;
				case EXAM_NAME : 
					exam = new ExamBean();
					String[] arr = JOptionPane.showInputDialog("NAME,MONTH").split(",");
					exam.setMemberId(arr[0]);
					/*List<MemberBean> list = MemberServiceImpl.getInstance().searchSome(arr[0]);
					if(list.size() == 0) {
						JOptionPane.showMessageDialog(null,"해당 이름을 가진 학생이 없습니다.");
					}else if(list.size() == 1) {
						exam.setMemberId(list.get(0).getMemberId());
					}else {
						JOptionPane.showMessageDialog(null,list);
					}*/
					exam.setMonth(arr[1]);
					break;
				case EXAM_SCORE :
					if(exam == null) {
						JOptionPane.showMessageDialog(null,"[EXAM_NAME]에서 이름을 먼저 입력하세요.");
						break;
					}
					exam.setScore(JOptionPane.showInputDialog("SCORE : Java,SQL,HTML5,R,Python"));
					ExamServiceImpl.getInstance().createExam(exam);
					break;
			}
		}
	}
}
