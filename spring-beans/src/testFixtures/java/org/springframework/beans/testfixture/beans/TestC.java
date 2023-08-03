package org.springframework.beans.testfixture.beans;

public class TestC {

	public TestA testA;

	public TestC(TestA testA) {
		this.testA = testA;
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
