package dao;

import java.util.ArrayList;
import java.util.List;
import domain.*;

public class ProjectTeamDAOImpl implements ProjectTeamDAO{
	private static ProjectTeamDAO instance = new ProjectTeamDAOImpl();
	public static ProjectTeamDAO getInstance() {return instance;}
	private ProjectTeamDAOImpl() {}

	@Override
	public void insertProjectTeam(ProjectTeamBean projectTeam) {
		
	}

	@Override
	public List<ProjectTeamBean> selectProjectTeamList() {
		List<ProjectTeamBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<ProjectTeamBean> selectSome(String word) {
		List<ProjectTeamBean> result = new ArrayList<>();
		return result;
	}

	@Override
	public ProjectTeamBean selectOne(ProjectTeamBean projectTeam) {
		ProjectTeamBean result = new ProjectTeamBean();
		return result;
	}

	@Override
	public String selectProjectTeamCount() {
		String result = "";
		return result;
	}

	@Override
	public void updateProjectTeam(ProjectTeamBean projectTeam) {
		
	}

	@Override
	public void deleteProjectTeam(ProjectTeamBean projectTeam) {
		
	}

}
