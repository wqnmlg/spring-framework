package org.springframework.beans.testfixture.beans;

public class TestB {

	public TestC testC;

	public TestB(TestC testC) {
		this.testC = testC;
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}
}
