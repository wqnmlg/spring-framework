package org.springframework.beans.testfixture.beans;

public class TestA {

	public TestB testB;

	public TestA() {
	}

	public TestA(TestB testB) {
		this.testB = testB;
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	public void hello(String name){
		System.out.println(name);
	}
}
