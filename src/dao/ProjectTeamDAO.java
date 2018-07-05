package dao;
import java.util.List;
import domain.*;

public interface ProjectTeamDAO {
	public void insertProjectTeam(ProjectTeamBean projectTeam);
	public List<ProjectTeamBean> selectProjectTeamList();
	public List<ProjectTeamBean> selectSome(String word);
	public ProjectTeamBean selectOne(ProjectTeamBean projectTeam);
	public String selectProjectTeamCount();
	public void updateProjectTeam(ProjectTeamBean projectTeam);
	public void deleteProjectTeam(ProjectTeamBean projectTeam);
}
