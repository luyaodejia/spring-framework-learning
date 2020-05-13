package com.xu.spring;

public class TestBean {
	private  String str="Hello bean";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void println(){
		System.out.println(str+"---------------------------------------------");
	}
}
