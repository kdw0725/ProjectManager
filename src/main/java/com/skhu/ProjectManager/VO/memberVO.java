package com.skhu.ProjectManager.VO;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class memberVO {
	private String member_name;
	private String member_id;
	private String member_pw;
	private String member_email;
	private String member_pnum;
	private int    member_rights;
	private int    project_num;
	
}
