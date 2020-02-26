package com.bw.entity;

import java.awt.print.Printable;

public class Goods {
	private Integer id;
	private String name;
	private String Ename;
	private Integer pid;
	private Integer tid;
	private Integer size;
	private Integer price;
	private Integer number;
	private String bq;
	private String pic;
	private String pname;
	private String tname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Goods(Integer id, String name, String ename, Integer pid, Integer tid, Integer size, Integer price,
			Integer number, String bq, String pic, String pname, String tname) {
		super();
		this.id = id;
		this.name = name;
		Ename = ename;
		this.pid = pid;
		this.tid = tid;
		this.size = size;
		this.price = price;
		this.number = number;
		this.bq = bq;
		this.pic = pic;
		this.pname = pname;
		this.tname = tname;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", Ename=" + Ename + ", pid=" + pid + ", tid=" + tid + ", size="
				+ size + ", price=" + price + ", number=" + number + ", bq=" + bq + ", pic=" + pic + ", pname=" + pname
				+ ", tname=" + tname + "]";
	}
	
	
	
	
}
