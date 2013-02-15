package codeGenerator;

import codeGenerator.Constant.Type;

public class IdConst extends Ident {

	// package visiblity to increase access speed
	int value;

	public IdConst(String nom, Type type, int value) {
		super(nom, type);
		this.value = value;
	}
}