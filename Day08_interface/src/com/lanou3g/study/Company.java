package com.lanou3g.study;

public class Company {
	private Teacher t;
	private Doctor doc;
	private Student stu;

	public Teacher getT() {
		return t;
	}

	public void setT(Teacher t) {
		this.t = t;
	}

	public Doctor getD() {
		return doc;
	}

	public void setD(Doctor d) {
		this.doc = d;
	}

	public Student getS() {
		return stu;
	}

	public void setS(Student s) {
		this.stu = s;
	}

	public void work() {
		if (doc != null) {
			doc.work();
		}
		if (t != null) {
			t.work();
		}
		if (stu != null) {
			stu.work();
		}
	}

}
