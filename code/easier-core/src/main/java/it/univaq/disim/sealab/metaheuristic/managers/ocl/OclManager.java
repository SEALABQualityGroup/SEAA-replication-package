package it.univaq.disim.sealab.metaheuristic.managers.ocl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.types.OCLStandardLibrary;

import it.univaq.disim.sealab.metaheuristic.utils.EasierLogger;

public abstract class OclManager {

	public static Object evaluateOCL(String query, EObject contextualElement) {
		
		// create an OCL instance for Ecore
		OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE, contextualElement.eResource());

		// create an OCL helper object
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();

		// TODO check
		helper.setContext(contextualElement.eClass());

		OCLExpression<EClassifier> oclExpression;
		try {
			oclExpression = helper.createQuery(query);
			Query<EClassifier, EClass, EObject> oclQuery = ocl.createQuery(oclExpression);
			Object result = oclQuery.evaluate(contextualElement);
			if (result instanceof OCLStandardLibrary<?>) {
				System.err.println("EEROR invalid query");
			}
			oclQuery = null;
			oclExpression = null;
			helper = null;
			ocl = null;
			return result;
		} catch (ParserException e) {
			System.err.println("ContextualElement --> " + contextualElement.toString());
			System.err.println("Query --> " + query);
			e.printStackTrace();
		}
		return null;
	}
}
