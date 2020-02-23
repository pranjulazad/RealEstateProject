package info.business.realestate.projectname.models;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import info.business.realestate.projectname.utility.enums.ProjectWorkStatusEnum;

@Entity
@Table(name = "real_estate_projects")
public class ProjectWork {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Column(name = "project_name")
	private String projectName;

	@NotNull
	@Column(name = "description")
	private String description;

	@NotNull
	@Column(name = "cost")
	private int cost;

	@NotNull
	@Column(name = "location")
	private String location;

	@NotNull
	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "attached_image_path")
	private String[] attachedImagePath;

	@NotNull
	@Column(name = "status")
	private ProjectWorkStatusEnum status;
	
	
	public ProjectWork() {
	}

	public ProjectWork(@NotNull String projectName, @NotNull String description, @NotNull int cost,
			@NotNull String location, @NotNull Date startDate, Date endDate, String[] attachedImagePath,
			@NotNull ProjectWorkStatusEnum status) {
		this.projectName = projectName;
		this.description = description;
		this.cost = cost;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.attachedImagePath = attachedImagePath;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String[] getAttachedImagePath() {
		return attachedImagePath;
	}

	public void setAttachedImagePath(String[] attachedImagePath) {
		this.attachedImagePath = attachedImagePath;
	}

	public ProjectWorkStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ProjectWorkStatusEnum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProjectWork [id=" + id + ", projectName=" + projectName + ", description=" + description + ", cost="
				+ cost + ", location=" + location + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", attachedImagePath=" + Arrays.toString(attachedImagePath) + ", status=" + status + "]";
	}

}
