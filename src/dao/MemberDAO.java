package dao;
import java.util.List;
import domain.*;

public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectMemberList();
	public List<MemberBean> selectSome(String word);
	public MemberBean selectOne(MemberBean member);
	public String selectMemberCount();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
}
