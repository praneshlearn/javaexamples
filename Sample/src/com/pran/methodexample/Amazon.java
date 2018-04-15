package com.pran.methodexample;

public class Amazon {
	int sessionId;
	static String protocol = "https";

	void signup() {
		System.out.println(sessionId + " " + protocol);

	}

	static void pay() {
		Amazon a = new Amazon();
		System.out.println(a.sessionId + " " + protocol);
	}

	public static void main(String[] args) {
		Amazon.pay();

	}
}
