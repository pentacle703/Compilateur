package codeGenerator;

import codeGenerator.Constant.Type;

public class IdVar extends Ident {

	// package visibility to increase access speed
	int offset;

	public IdVar(String nom, Type type, int offset) {
		super(nom, type);
		this.offset = offset;
	}
}
