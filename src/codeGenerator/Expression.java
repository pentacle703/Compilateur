package codeGenerator;

import java.util.Stack;

import codeGenerator.Constant.Operator;
import codeGenerator.Constant.Type;

public class Expression {
	Stack<Operator> operatorStack;
	Stack<Ident> operandStack;
	
	Type evaluate(Type typeE1, Type typeE2, Operator operator)
	{
		return typeE2;
	}
}
