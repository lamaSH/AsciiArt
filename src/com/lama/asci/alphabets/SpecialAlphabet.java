package com.lama.asci.alphabets;

public abstract class SpecialAlphabet {
int h;
int w;
String[] datas;

public int getH() {
	return h;
}
public int getW() {
	return w;
}
public String[] getDatas() {
	return datas;
}

public SpecialAlphabet(int h, int w, String[] datas) {
	this.h = h;
	this.w = w;
	this.datas = datas;
}

}
