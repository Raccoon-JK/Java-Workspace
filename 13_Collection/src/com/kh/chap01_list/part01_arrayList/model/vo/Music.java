package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {
	
	private String title; //제목
	private String arties; //가수명
	
	public Music() {
		
	}

	public Music(String title, String arties) {
		super();
		this.title = title;
		this.arties = arties;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArties() {
		return arties;
	}

	public void setArties(String arties) {
		this.arties = arties;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", arties=" + arties + "]";
	}

	
	
	
	
	
	
}
