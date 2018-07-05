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
		
	}

	@Override
	public List<MemberBean> selectMemberList() {
		List<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<MemberBean> selectSome(String word) {
		List<MemberBean> result = new ArrayList<>();
		return result;
	}

	@Override
	public MemberBean selectOne(MemberBean member) {
		MemberBean result = new MemberBean();
		return result;
	}

	@Override
	public String selectMemberCount() {
		String result = "";
		return result;
	}

	@Override
	public void updateMember(MemberBean member) {
		
	}

	@Override
	public void deleteMember(MemberBean member) {
		
	}

}
