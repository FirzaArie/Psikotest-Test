package com.juaracoding.psikotes.mobile.utils;

public enum TestCases {
	
	T1("Home"),
	T2("Daftar"),
	T3("Sign In"),
	T4("Psikotest");
	
	private String testName;
	
	private TestCases(String Value) {
		this.testName = Value;
	}

	public String getTestName() {
		return testName;
	}
	
}
