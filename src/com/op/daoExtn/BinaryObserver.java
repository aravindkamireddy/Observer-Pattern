package com.op.daoExtn;

import com.op.mainApp.*;
import com.op.model.Subjectmain;
import com.op.dao.Observer;

public class BinaryObserver extends Observer {

	private Subjectmain subject;

	public BinaryObserver(Subjectmain subject) {

		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}