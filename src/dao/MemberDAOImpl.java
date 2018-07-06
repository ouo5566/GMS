package dao;

import java.util.ArrayList;
import java.util.List;
import domain.*;

public class MemberDAOImpl implements MemberDAO{
	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {}
	@Override
	public void insertMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<MemberBean> selectMemberAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> selectByWord(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean selectById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String selectMemberCount() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	
}
