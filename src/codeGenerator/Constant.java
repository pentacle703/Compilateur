package codeGenerator;

public interface Constant {
	 public enum Type
	 {
		 INTEGER,
		 BOOLEAN,
		 FUNCTION,
		 ERROR
	 }
	 
	 public enum Operator
	 {
		 ADD,
		 MINUS,
		 MUL,
		 DIV,
		 LOWER,
		 GREATER,
		 LOWEREQ,
		 GREATEREQ,
		 EQUAL,
		 NEQUAL,
		 AND,
		 OR
	 }
}
