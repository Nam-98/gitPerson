package kh.spring.dto;

import java.util.Date;

public class PersonDTO {
	private int seq;
	private String name;
	private String contact;
	private Date reg_date;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public PersonDTO(int seq, String name, String contact, Date reg_date) {
		super();
		this.seq = seq;
		this.name = name;
		this.contact = contact;
		this.reg_date = reg_date;
	}
	public PersonDTO() {
		super();
	}
	
}
