package com.op.mainApp;

import com.op.daoExtn.BinaryObserver;
import com.op.daoExtn.HexaObserver;
import com.op.daoExtn.OctalObserver;
import com.op.model.Subjectmain;

public class MainApp {
	public static void main(String[] args) {
		Subjectmain subject = new Subjectmain();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
