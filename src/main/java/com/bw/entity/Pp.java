package com.bw.entity;

public class Pp {
	private Integer pid;
	
	private String pname;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Pp(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public Pp() {
		super();
	}

	@Override
	public String toString() {
		return "Pp [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
	
	
}
