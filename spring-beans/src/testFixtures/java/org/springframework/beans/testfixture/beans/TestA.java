package org.springframework.beans.testfixture.beans;

public class TestA {

	public TestB testB;

	public TestA(TestB testB) {
		this.testB = testB;
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
