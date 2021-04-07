package it.univaq.disim.sealab.metaheuristic.managers.ocl.uml;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Operation;

public class UMLOclStringManager {

	public String getAllArtifactsQuery() {
		return "Artifact.allInstances()";
	}

	public String getAllManifestationsQuery() {
		return "Manifestation.allInstances()";
	}

	public String getAllManifestationsOfQuery(Component component) {
		return "Manifestation.allInstances()->select(man | man.supplier->exists(s|s.qualifiedName='"
				+ component.getQualifiedName() + "'))";
	}

	public static String getAllNodesQuery() {
		return "Node.allInstances()->asSequence()";
	}

	public static String getAllComponentsQuery() {
		return "Component.allInstances()->asSequence()";
	}

	public String generateRandomComponentsQuery(int start, int end) {
		String query = "";
		query = "Component.allInstances()->select(comp | comp.getAppliedStereotypes()->exists(s | s.name = 'PaRunTInstance'))->asSequence()->subSequence ("
				+ start + ", " + end + ")";
		return query;
	}

	public String countComponentsQuery() {
		return "Component.allInstances()->select(comp | comp.getAppliedStereotypes()->exists(s | s.name = 'PaRunTInstance'))->size()";
	}

	public String getComponentsQuery(EList<Component> list_of_components) {
		String query;
		query = "Component.allInstances()->select(comp | comp.appliedStereotypes->exists(s | s.name = 'PaRunTInstance'))->"
				+ "select(c | ";

		Iterator<Component> iterator = list_of_components.iterator();
		while (iterator.hasNext()) {
			query += "c.name = '" + iterator.next().getName() + "'";
			if (iterator.hasNext())
				query += " or ";
		}
		query += " )";

		return query;
	}

	public String getRandomNodes(int start, int end) {
		String query = "";
		query = "Node.allInstances()->select(node | node.getAppliedStereotypes()->exists(s | s.name = 'GaExecHost'))->asSequence()->subSequence ("
				+ start + ", " + end + ")";
		return query;

	}

	public String countNodesQuery() {
		String query="";
		query = "Node.allInstances()->select(node : Node | node.getAppliedStereotypes()->exists(s | s.name = 'GaExecHost'))->size()";
		return query;
	}

	public static String getNodesQuery(List<Node> list_of_nodes) {
		String query;
		query = "Node.allInstances()->"
//				+ "select(node | node.getAppliedStereotypes()->exists(s | s.name = 'GaExecHost'))->"
				+ "select(n | ";
		Iterator<Node> iterator = list_of_nodes.iterator();
		while (iterator.hasNext()) {
			query += "n.name = '" + iterator.next().getName() + "'";
			if (iterator.hasNext())
				query += " or ";
		}
		query += " )";
		return query;
	}

	// TODO capire come far creare un component tramite ocl
	// sono riuscito a creare una classe ma non un component
	public String createRandomComponentQuery() {
		String query = "";
		return query;
	}

		public static String getComponentQuery(Component newComp) {
			String query;
	//		query = "Component.allInstances()->select(comp | comp.getAppliedStereotypes()->exists(s | s.name = 'PaRunTInstance'))->"
	//				+ "select(c | c.name = '" + newComp.getName() + "' )->asSequence()->first()";
			query = "Component.allInstances()->select(c | c.name = '" + newComp.getName() + "' )->asSequence()->first()";
			return query;
		}

	public String getDeploymentsOf(Node node) {
		String query;
		query = "Node.allInstances()->select(n | n.name = '" + node.getName() + "').getDeployedElements()";
		return query;
	}

	public String getAllDeployedElementsQuery(List<Node> targets) {
		String query = "";
		query = "Deployment.allInstances()->select(d | ";
		query += "(" + getNodesQuery(targets) + ").deployment->includes(d))";
		return query;
	}

	public static String getNodeQuery(Node newNode) {
		String query;
		query = "Node.allInstances()->"
//				+ "select(node | node.getAppliedStereotypes()->exists(s | s.name = 'GaExecHost'))->"
				+ "select(c | c.name = '" + newNode.getName() + "' )->asSequence()->first()";
		return query;
	}

	public String getNeighboursOf(Node node) {
		String query = "";
		return query;
	}

	public static String getAllOperationsQuery() {
		String query;
		query = "Operation.allInstances()->asSequence()";
//		->select(operation | operation.getAppliedStereotypes()->exists(s | s.name = 'GaStep'))";
		return query;
	}

	public static String getOperationQuery(Operation operation) {
		String query;
		query = "Operation.allInstances()->"
//				+ "select(operation | operation.getAppliedStereotypes()->exists(s | s.name = 'GaStep'))->"
				+ "select(op | op.name = '" + operation.getName() + "' )->asSequence()->first()";
		return query;
	}

	public static String getOperationsOfQuery(Component comp) {
		String query;
		query = "Component.allInstances()->select(n | n.name = '" + comp.getName()
				+ "').getOperations()->asSequence()";
//				+ "->select(o | o.getAppliedStereotypes()->exists(s | s.name = 'GaStep'))";
		return query;
	}

	public String countOperationsQuery() {
		return "Operation.allInstances()->select(op | op.getAppliedStereotypes()->exists(s | s.name = 'GaStep'))->size()";
	}

	public String operationsGetStereotypesQuery() {
		return "Operation.allInstances()->select(o | o.name = '').getAppliedStereotypes()";
	}

	public String generateRandomOperationsQuery(int start, int end) {
		String query = "";
		query = "Operation.allInstances()->select(op | op.getAppliedStereotypes()->exists(s | s.name = 'GaStep'))->asSequence()->subSequence ("
				+ start + ", " + end + ")";
		return query;
	}

	public String generateRandomNodesQuery(int start, int end) {
		String query = "";
		query = "Node.allInstances()->select(nd | nd.getAppliedStereotypes()->exists(s | s.name = 'GaExecHost'))->asSequence()->subSequence ("
				+ start + ", " + end + ")";
		return query;
	}

	///////// ANTIPATTERN FUNCTION/THRESHOLD QUERIES

	////////////////// Blob

	// OK
	public String getClientConnectsQuery(Component c) {
		String query = "";
		query = "self.allOwnedElements()->select(e|e.oclIsTypeOf(Usage))-size()";
		return query;
	}

	// OK
	public String getSupplierConnectsQuery(Component c) {
		String query = "";
		query = "self.allOwnedElements()->select(e|e.oclIsTypeOf(InterfaceRealization))->size()";
		return query;
	}

	// OK
	public String getNumSentMsgsQuery(Component c) {
		String query = "";
		query = "Lifeline.allInstances()->select(ll|ll.represents.type=self)->collect(coveredBy)->select(el|el.oclIsTypeOf(MessageOccurrenceSpecification) and Message.allInstances()->exists(m|m.sendEvent=el))->size()";
		return query;
	}

	// OK
	public String getNumReceivedMsgsQuery(Component c) {
		String query = "";
		query = "Lifeline.allInstances()->select(ll| ll.represents.type=self)->collect(coveredBy)->select(el|el.oclIsTypeOf(MessageOccurrenceSpecification) and Message.allInstances()->exists(m|m.receiveEvent=el))->size()";
		return query;
	}

	public String getNodesOfQuery(Component c) {
		String query = "";
		query = getAllNodesQuery() + "->select(n | n.deployedArtifact)";
		return query;
	}

	// FIXED
	public String getHwUtilQuery(Component c) {
		String query = "";
		// query =
		// "Deployment.allInstances()->select(d|d.supplier->exists(sup|Manifestation.allInstances()->select(man
		// |
		// man.supplier->exists(s|s.qualifiedName=self.qualifiedName))->collect(client)->includes(sup)))->collect(client)->asSequence()->first().getValue(getAppliedStereotype('GQAM::GaExecHost'),'utilization')->asSequence()->first()";

		// query = "Deployment.allInstances()->select(d|
		// d.deployedArtifact->exists(a|Manifestation.allInstances()->select(man
		// |
		// man.supplier->exists(s|s.qualifiedName=self.qualifiedName))->collect(client)->includes(a)))->collect(client)->asSequence()->first().getValue(getAppliedStereotypes()->select(s
		// | s.name = 'GaExecHost'),'utilization')->asSequence()->first()";
		query = "Node.allInstances()->select(n| n.deployedElement->includes(self))->collect(node | node.getValue(node.getAppliedStereotype('GQAM::GaExecHost'), 'utilization'))";
		return query;
	}

	// PAKIMOR _FIXME NOT OK - ATTUALMENTE ARRIVA AL CommunicationPath del PRIMO NODO
	// DOVE E'
	// DEPLOYED IL COMPONENT: GaCommHost NON C'E' CONTROLLATO, MA LA getValue
	// RITORNEREBBE COMUNQUE OclInvalid
	public String getNetUtilQuery(Component c) {
		String query = "";
		// query =
		// "Deployment.allInstances()->select(d|d.deployedArtifact->exists(a|Manifestation.allInstances()->select(man
		// |
		// man.supplier->exists(s|s.qualifiedName=self.qualifiedName))->collect(client)->includes(a)))->collect(client)->asSequence()->first().oclAsType(Device).ownedAttribute->select(p|p.association.oclIsTypeOf(CommunicationPath)
		// and
		// p.association.getAppliedStereotypes()->exists(s|s.name='GaExecHost'))->first().oclAsType(CommunicationPath).getValue(getAppliedStereotype('GQAM::GaCommHost'),'utilization')";

		return query;
	}

	/**
	 * NODI VICINI passato C Node.allInstances()->select(n : uml::Node |
	 * n.deployedElement->includes(self)).getCommunicationPaths()->collect(cp :
	 * uml::CommunicationPath | cp.memberEnd)->select( pr : uml::Property |
	 * pr.type.oclIsKindOf(uml::Node) and
	 * pr.owner.getAppliedStereotype('GQAM::GaExecHost')->notEmpty() and not
	 * Node.allInstances()->select(n : uml::Node |
	 * n.deployedElement->includes(self))->includes(pr.owner))->collect(owner)
	 * 
	 */

	/**
	 * 
	 * DATO il Nodo N restituisce tutti i nodi vicini
	 * self.getCommunicationPaths()->collect(cp : uml::CommunicationPath |
	 * cp.endType->select(et : uml::Type | et.oclIsKindOf(uml::Node) and
	 * et.isStereotypeApplied(getAppliedStereotype('GQAM::GaExecHost'))))->asOrderedSet()
	 * 
	 * 
	 * @param n
	 * @return
	 */

	public String getNeighsOf(Node n) {
		String query = "";
		query = "self.getCommunicationPaths()->collect(cp : uml::CommunicationPath | cp.endType->select("
				+ "et : uml::Type | et.oclIsKindOf(uml::Node) and et.isStereotypeApplied(getAppliedStereotype('GQAM::GaExecHost'))))->asOrderedSet()";
		return query;

	}

	////////////////// Cps

	// OK (PRENDE SOLO IL PRIMO)
	public String getQueueLengthQuery(Node n) {
		String query = "";
		query = "self.getValue(getAppliedStereotype('HLAM::RtUnit'),'queueSize')->asSequence()->first()";
		return query;
	}

	// OK (PRENDE SOLO IL PRIMO)
	public String getOverUtilQuery(Node n) {
		String query = "";
		query = "self.getValue(getAppliedStereotype('GQAM::GaExecHost'),'utilization')->asSequence()->first()";
		return query;
	}

	// FIXED
	public String getUnderUtilQuery(Node n) {
		String query = "";

		query = "Node.allInstances()->collect(" + "node : uml::Node | node.getCommunicationPaths()->collect("
				+ "cp : uml::CommunicationPath | cp.endType->select("
				+ "et : uml::Type | et.oclIsKindOf(uml::Node) and et <> self and et.isStereotypeApplied(getAppliedStereotype('GQAM::GaExecHost')))))->asOrderedSet()->select("
				+ "node | node.getValue(node.getAppliedStereotype('GQAM::GaExecHost'), 'utilization')->exists(v | v.toString().toReal() < 0.5))";

		return query;
	}

	// FIXED
	public String getOpDemandQuery(Node n) {
		String query = "";
		// query =
		// "Component.allInstances()->select(c|Manifestation.allInstances()->select(m|self.deployment->collect(supplier)->exists(s|m.supplier->includes(s)))->select(m|m.manifestation.supplier->includes(c)))";
		query = "Component.allInstances()->select("
				+ "comp : uml::Component | self.getDeployedElements()->includes(comp)).getOperations()->select("
				+ "op : uml::Operation | op.isStereotypeApplied(op.getAppliedStereotype('GQAM::GaStep')))->collect("
				+ "op | op.getValue(op.getAppliedStereotype('GQAM::GaStep'), 'servCount'))";
		return query;
	}

	////////////////// Paf

	// OK (PRENDE SOLO IL PRIMO)
	public String getResDemandQuery(Operation o) {
		String query = "";
		query = "self.getValue(getAppliedStereotype('GQAM::GaStep'),'servCount')->asSequence()->first()";
		return query;
	}

	// TODO
	public String getOpProbExecQuery(Operation o) {
		String query = "";
		query = "Message.allInstances()->select("
				+ "mes : uml::Message | mes.signature = self and mes.sendEvent.owner.isStereotypeApplied(mes.sendEvent.owner.getAppliedStereotype('GQAM::GaStep')))->collect("
				+ "mes | mes.sendEvent.owner.getValue(mes.sendEvent.owner.getAppliedStereotype('GQAM::GaStep'), 'prob'))";
		return query;
	}

	// TODO
	//Qui dobbiamo considerare tutti i nodi? o solo quelli con l'util maggiore
	// di una threshold?
	public String getHwUtilQuery(Operation o) {
		String query = "";
		query = "Node.allInstances()->select("
				+ "n : uml::Node | n.getDeployedElements()->includes(self.owner))->collect("
				+ "n : uml::Node | n.getValue(n.getAppliedStereotype('GQAM::GaExecHost'), 'utilization'))";
		return query;
	}

	//
	public String getServiceThroughputQuery(Operation o) {
		String query = "";
		query = "Message.allInstances()->select("
				+ "m : uml::Message | m.signature = self).getValue(getAppliedStereotype('GaExecHost'), 'throughput')";
		return query;
	}
	
	public String getMessageProbabilityQuery(Operation o){
		String query = "";
		query = "Message.allInstances()->select(m : uml::Message | m.signature = self).getValue(getAppliedStereotype('GaExecHost'), 'prob')";
		return query;
	}

	////////////////// Ep

	// OK (PRENDE IL PRIMO)
	public String getOverDemandQuery(Operation o) {
		String query = "";
		query = "self.getValue(getAppliedStereotype('GQAM::GaStep'),'servCount')->asSequence()->first()";
		return query;
	}

	// TODO
	public String getUnderDemandQuery(Operation o) {
		String query = "";
		query = "self.getValue";
		return query;
	}

	// TODO
	public String getOverDemandProbQuery(Operation o) {
		String query = "";
		query = "";
		return query;
	}

	// TODO
	public String getUnderDemandProbQuery(Operation o) {
		String query = "";
		query = "";
		return query;
	}

	//
	public String getServiceResponseTimeQuery(Operation o) {
		String query = "";
		query = "Interaction.allInstances()->select("
				+ "int : uml::Interaction | int.message.signature->includes(self))->asSequence()->first()->collect(useCase)->collect("
				+ "u : uml::UseCase | u.getValue(u.getAppliedStereotype('GQAM::GaScenario'), 'respT'))";
		return query;
	}
}
