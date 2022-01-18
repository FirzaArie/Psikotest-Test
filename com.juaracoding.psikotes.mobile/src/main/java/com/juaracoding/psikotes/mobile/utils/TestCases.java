package com.juaracoding.psikotes.mobile.utils;

public enum TestCases {
	
	T1("Home"),
	T2("Daftar");
	
	private String testName;
	
	private TestCases(String Value) {
		this.testName = Value;
	}

	public String getTestName() {
		return testName;
	}
	
}
