package codeGenerator;

import codeGenerator.Constant.Type;

public abstract class Ident {
	
	// package visibility to increase access speed
	String nom;
	Type type;

	public Ident(String nom, Type type) {
		super();
		this.nom = nom;
		this.type = type;
	}
}
