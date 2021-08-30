package com.op.daoExtn;

import com.op.mainApp.*;
import com.op.model.Subjectmain;
import com.op.dao.Observer;

public class HexaObserver extends Observer {

	private Subjectmain subject;

	public HexaObserver(Subjectmain subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}
