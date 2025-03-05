package Java8Practice;

import java.time.LocalDate;

public class Employee {
		private int eid;
		private String name;
		private LocalDate bornDate;
		private String sex;
		private String maritalStatus;
		private LocalDate hireDate;
		private String department;
		private String jobTitle;
		private long ctc;
		private String workLocation;
		
		public Employee(int eid, String name, LocalDate bornDate, String sex, String maritalStatus, LocalDate hireDate,
				String department, String jobTitle, long ctc, String workLocation) {
			super();
			this.eid = eid;
			this.name = name;
			this.bornDate = bornDate;
			this.sex = sex;
			this.maritalStatus = maritalStatus;
			this.hireDate = hireDate;
			this.department = department;
			this.jobTitle = jobTitle;
			this.ctc = ctc;
			this.workLocation = workLocation;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getBornDate() {
			return bornDate;
		}
		public void setBornDate(LocalDate bornDate) {
			this.bornDate = bornDate;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public LocalDate getHireDate() {
			return hireDate;
		}
		public void setHireDate(LocalDate hireDate) {
			this.hireDate = hireDate;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public long getCtc() {
			return ctc;
		}
		public void setCtc(long ctc) {
			this.ctc = ctc;
		}
		public String getWorkLocation() {
			return workLocation;
		}
		public void setWorkLocation(String workLocation) {
			this.workLocation = workLocation;
		}

		
		
}
