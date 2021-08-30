package com.op.daoExtn;

import com.op.mainApp.*;
import com.op.model.Subjectmain;
import com.op.dao.Observer;

public class OctalObserver extends Observer {

	private Subjectmain subject;

	public OctalObserver(Subjectmain subject) {

		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}