//package it.univaq.disim.sealab.metaheuristic.refactoring.operator;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//
//import org.eclipse.ocl.ParserException;
//
//import logicalSpecification.EqualOperator;
//import logicalSpecification.impl.EqualOperatorImpl;
//
//public class EqualRefactoringOperator extends EqualOperatorImpl {
//
//	
//	public boolean evaluateOperator(EqualOperator operator) throws ParserException {
//		if (operator.getLhs().getResolvingExpr() == null || operator.getLhs().getResolvingExpr().contentEquals("")
//				|| operator.getRhs().getResolvingExpr() == null
//				|| operator.getRhs().getResolvingExpr().contentEquals("")) {
//			// getNotOperator(), getAndOperator() and getOrOperator(), are opposites -> TO
//			// CHECK IF SET (POSSIBLE null VALUES)
//			if (operator.getNotOperator() != null) {
//				if (operator.getNotOperator().getAndOperator() != null)
//					return true;
//				if (operator.getNotOperator().getOrOperator() != null)
//					return false;
//			} else {
//				if (operator.getAndOperator() != null)
//					return true;
//				if (operator.getOrOperator() != null)
//					return false;
//			}
//		}
//		Object lhsRes = getOclManager().evaluateOCL(operator.getLhs().getResolvingExpr(), getModel());
//		Object rhsRes = getOclManager().evaluateOCL(operator.getRhs().getResolvingExpr(), getModel());
//		if ((lhsRes instanceof Integer && rhsRes instanceof Integer)
//				|| (lhsRes instanceof Double && rhsRes instanceof Double)) {
//			double lhs = Double.parseDouble(lhsRes.toString());
//			double rhs = Double.parseDouble(rhsRes.toString());
//			// System.out.print(lhs + " ?=? " + rhs);
//			if (lhs < operator.getFactor() * rhs)
//				return false;
//		} else {
//			HashSet<Object> lhsHS = (HashSet<Object>) getOclManager().evaluateOCL(operator.getLhs().getResolvingExpr(),
//					getModel());
//			HashSet<Object> rhsHS = (HashSet<Object>) getOclManager().evaluateOCL(operator.getRhs().getResolvingExpr(),
//					getModel());
//			if (lhsHS.size() == rhsHS.size()) {
//				List<Object> lhsObjs = new ArrayList<Object>();
//				for (Object object : lhsHS) {
//					if (object instanceof Double)
//						lhsObjs.add((double) object);
//					else
//						return false;
//				}
//				List<Object> rhsObjs = new ArrayList<Object>();
//				for (Object object : rhsHS) {
//					if (object instanceof Double)
//						rhsObjs.add((double) object);
//					else
//						return false;
//				}
//				Iterator<Object> lhsIterator = lhsObjs.iterator();
//				Iterator<Object> rhsIterator = rhsObjs.iterator();
//				while (lhsIterator.hasNext()) {
//					Object appLhs = lhsIterator.next();
//					Object appRhs = rhsIterator.next();
//					if (((Double) appLhs).doubleValue() != operator.getFactor() * ((Double) appRhs).doubleValue())
//						return false;
//				}
//			}
//		}
//		return true;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public boolean evaluateOperator(EqualOperator operator, Object contextualElement) {// throws ParserException {
//		if (operator.getLhs().getResolvingExpr() == null || operator.getLhs().getResolvingExpr().contentEquals("")
//				|| operator.getRhs().getResolvingExpr() == null
//				|| operator.getRhs().getResolvingExpr().contentEquals("")) {
//			if (operator.getNotOperator() != null) {
//				if (operator.getNotOperator().getAndOperator() != null)
//					return true;
//				if (operator.getNotOperator().getOrOperator() != null)
//					return false;
//			} else {
//				if (operator.getAndOperator() != null)
//					return true;
//				if (operator.getOrOperator() != null)
//					return false;
//			}
//		}
//		Object lhsRes = getOclManager().evaluateOCL(operator.getLhs().getResolvingExpr(), contextualElement);
//		Object rhsRes = getOclManager().evaluateOCL(operator.getRhs().getResolvingExpr(), contextualElement);
//		if ((lhsRes instanceof Integer && rhsRes instanceof Integer)
//				|| (lhsRes instanceof Double && rhsRes instanceof Double)) {
//			double lhs = Double.parseDouble(lhsRes.toString());
//			double rhs = Double.parseDouble(rhsRes.toString());
//			// System.out.print(lhs + " ?=? " + rhs);
//			if (lhs < operator.getFactor() * rhs)
//				return false;
//		} else {
//			HashSet<Object> lhsHS = (HashSet<Object>) getOclManager().evaluateOCL(operator.getLhs().getResolvingExpr(),
//					contextualElement);
//			HashSet<Object> rhsHS = (HashSet<Object>) getOclManager().evaluateOCL(operator.getRhs().getResolvingExpr(),
//					contextualElement);
//			if (lhsHS.size() == rhsHS.size()) {
//				List<Object> lhsObjs = new ArrayList<Object>();
//				for (Object object : lhsHS) {
//					if (object instanceof Double)
//						lhsObjs.add((double) object);
//					else
//						return false;
//				}
//				List<Object> rhsObjs = new ArrayList<Object>();
//				for (Object object : rhsHS) {
//					if (object instanceof Double)
//						rhsObjs.add((double) object);
//					else
//						return false;
//				}
//				Iterator<Object> lhsIterator = lhsObjs.iterator();
//				Iterator<Object> rhsIterator = rhsObjs.iterator();
//				while (lhsIterator.hasNext()) {
//					Object appLhs = lhsIterator.next();
//					Object appRhs = rhsIterator.next();
//					if (((Double) appLhs).doubleValue() != operator.getFactor() * ((Double) appRhs).doubleValue())
//						return false;
//				}
//			}
//		}
//		return true;
//	}
//}
