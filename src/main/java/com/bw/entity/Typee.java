package com.bw.entity;

public class Typee {
	private Integer tid;
	
	private String tname;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Typee(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public Typee() {
		super();
	}

	@Override
	public String toString() {
		return "Typee [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
	
}
