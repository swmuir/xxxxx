package org.ncpdp.uml.telecom.util;

import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.ncpdp.uml.telecom.DocumentRoot;
import org.ncpdp.uml.telecom.Response;
import org.ncpdp.uml.telecom.TelecomFactory;
import org.ncpdp.uml.telecom.TelecomPackage;
import org.ncpdp.uml.telecom.Transmission;

public class TelecomUtil {

	public static final String TELECOM_ANNOTATION_SOURCE="http://www.ncpdp.org/uml/telecom/annotation";
	
	private static final Pattern COMPONENT_PATTERN = Pattern.compile("(^[A-Za-z0-9]+)(\\[([1-9]+[0-9]*)\\])?");


	public interface LoadHandler {
		public boolean handleUnknownFeature(EObject owner, EStructuralFeature feature, Object value);
	}
	
	public static void save(Transmission transmission, OutputStream out) throws Exception {
		save(transmission, out, true);
	}
	
	public static void save(Transmission transmission, OutputStream out, boolean defaults) throws Exception {
		Resource resource = prepare(transmission, defaults);
		resource.save(out, null);
	}
	
	public static void save(Transmission transmission, Writer writer) throws Exception {
		save(transmission, writer, true);
	}
	
	public static void save(Response response, OutputStream out) throws Exception {
		save(response, out, true);
	}
	
	public static void save(Response response, OutputStream out, boolean defaults) throws Exception {
		Resource resource = prepare(response, defaults);
		resource.save(out, null);
	}
	
	public static void save(Response response, Writer writer) throws Exception {
//		save(response, writer, true);
	}
	
	public static void save(Transmission transmission, Writer writer, boolean defaults) throws Exception {
//		Resource resource = prepare(transmission, defaults);
//		resource.save(writer, null);
	}

	private static Resource prepare(Transmission transmission, boolean defaults) {
		if (defaults) {
			handleDefaults(transmission);
		}
		
		DocumentRoot root = TelecomFactory.eINSTANCE.createDocumentRoot();
		root.setTransmission(transmission);
		root.getXMLNSPrefixMap().put("", TelecomPackage.eNS_URI);
		
		XMLResource resource = (XMLResource) new TelecomResourceFactoryImpl().createResource(URI.createURI(TelecomPackage.eNS_URI));;
		
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		resource.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		resource.getContents().add(root);
		return resource;
	}

	
	private static Resource prepare(Response response, boolean defaults) {
		if (defaults) {
			handleDefaults(response);
		}
		
		DocumentRoot root = TelecomFactory.eINSTANCE.createDocumentRoot();
		root.setResponse(response);
		root.getXMLNSPrefixMap().put("", TelecomPackage.eNS_URI);
		
		XMLResource resource = (XMLResource) new XMLResourceFactoryImpl().createResource(URI.createURI(TelecomPackage.eNS_URI));;
		
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		resource.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
//		resource.setEncoding(CDAResource.DEFAULT_ENCODING);
		
		resource.getContents().add(root);
		return resource;
}
	
	// iterative breadth-first traversal using queue
	@SuppressWarnings("unchecked")
	private static void handleDefaults(EObject root) {
		Queue<EObject> queue = new LinkedList<EObject>();
		queue.add(root); // root
		while (!queue.isEmpty()) {
			EObject eObject = queue.remove();
			EClass eClass = eObject.eClass();
			for (EAttribute attribute : eClass.getEAllAttributes()) { // visit
				if (!eObject.eIsSet(attribute) && attribute.getLowerBound() > 0 && attribute.getDefaultValueLiteral() != null) {
					if (attribute.isMany()) {
						List<Object> list = (List<Object>) eObject.eGet(attribute);
						list.add(attribute.getDefaultValue());
					} else {
						eObject.eSet(attribute, attribute.getDefaultValue());
					}
				}
			}
			for (EReference reference : eClass.getEAllReferences()) { // process successors
				Object value = eObject.eGet(reference);
				if (value != null) {
					if (reference.isMany()) {
						queue.addAll((List<EObject>) value);
					} else {
						queue.add((EObject) value);
					}
				}
			}
		}
	}
	
	public static boolean validate(Transmission transmission) {
		return validate(transmission, null);
	}
	
	public static boolean validate(Transmission transmission, ValidationHandler handler) {
		return validate(transmission, handler, true);
	}
	
	public static boolean validate(Transmission transmission, ValidationHandler handler, boolean defaults) {
		if (defaults) {
			handleDefaults(transmission);
		}
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(transmission);
		if (handler != null) {
			processDiagnostic(diagnostic, handler);
		}
		return diagnostic.getSeverity() != Diagnostic.ERROR;
	}
	
	public static boolean validate(Response response) {
		return validate(response, null);
	}
	
	public static boolean validate(Response response, ValidationHandler handler) {
		return validate(response, handler, true);
	}
	
	public static boolean validate(Response response, ValidationHandler handler, boolean defaults) {
		if (defaults) {
			handleDefaults(response);
		}
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(response);
		if (handler != null) {
			processDiagnostic(diagnostic, handler);
		}
		return diagnostic.getSeverity() != Diagnostic.ERROR;
}
	
	// iterative breadth-first traversal of diagnostic tree using queue
	private static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic);	// root
		while (!queue.isEmpty()) {
			Diagnostic d = queue.remove();
			handleDiagnostic(d, handler);	// visit
			for (Diagnostic childDiagnostic : d.getChildren()) {	// process successors
				queue.add(childDiagnostic);
			}
		}
	}
	
	private static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		switch (diagnostic.getSeverity()) {
		case Diagnostic.ERROR:
			handler.handleError(diagnostic);
			break;
		case Diagnostic.WARNING:
			handler.handleWarning(diagnostic);
			break;
		case Diagnostic.INFO:
			handler.handleInfo(diagnostic);
			break;
		}
	}
	
	public interface ValidationHandler {
		public void handleError(Diagnostic diagnostic);
		public void handleWarning(Diagnostic diagnostic);
		public void handleInfo(Diagnostic diagnostic);
	}

	
	// annotation processing to populate runtime instance
	public static void init(EObject eObject) {
		List<EClass> classes = new ArrayList<EClass>(eObject.eClass().getEAllSuperTypes());
		classes.add(eObject.eClass());
		for (EClass eClass : classes) {
			EAnnotation annotation = eClass.getEAnnotation(TELECOM_ANNOTATION_SOURCE);
			if (annotation != null) {
				init(eObject, annotation.getDetails().map());
			}
		}
	}
	
	private static void init(EObject eObject, Map<String, String> details) {
		List<String> created = new ArrayList<String>();
		for (String key : details.keySet()) {
			try {
				String path = key.replace(".", "/");
				if (path.contains("/")) {
					String s = path.substring(0, path.lastIndexOf("/"));
					if (!created.contains(s)) {
						create(eObject, s);
						created.add(s);
					}
				}
				set(eObject, path, details.get(key));
			} catch (Exception e) {}
		}
	}
	
	// BEGIN: Path Expression Support
	public static <T> T create(EObject root, String path) {
		return create(root, path, null);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T create(EObject root, String path, EClass eClass) {
		EObject current = root;
		String[] components = path.split("/");
		int currentIndex = 0;
		for (String component : components) {
			EStructuralFeature feature = current.eClass().getEStructuralFeature(component);
			if (feature instanceof EReference) {
				EObject eObject = null;
				Object value = current.eGet(feature);
				if (value == null || feature.isMany()) {
					EClass type = (EClass) feature.getEType();
					if (currentIndex == components.length - 1 && eClass != null && type.isSuperTypeOf(eClass)) {
						eObject = EcoreUtil.create(eClass);
					} else {
						eObject = EcoreUtil.create(type);
					}
					if (feature.isMany()) {
						List<EObject> list = (List<EObject>) value;
						list.add(eObject);
					} else {
						current.eSet(feature, eObject);
					}
				} else {
					eObject = (EObject) value;
				}
				current = eObject;
			}
			currentIndex++;
		}
		return (T) current;
	}
	
	
	@SuppressWarnings("unchecked")
	public static void set(EObject root, String path, Object value) {
		String last = path.substring(path.lastIndexOf("/") + 1);
	    EObject target = path.equals(last) ? root : (EObject) get(root, path.substring(0, path.lastIndexOf("/")));
        if (target != null) {
        	String name = null;
        	Integer index = null;
        	Matcher matcher = COMPONENT_PATTERN.matcher(last);
        	if (matcher.matches()) {
        		name = matcher.group(1);
        		if (matcher.group(3) != null) {
        			index = Integer.valueOf(matcher.group(3)) - 1;
        		}
	            EStructuralFeature feature = target.eClass().getEStructuralFeature(name);
	            if (feature != null && value != null) {
	                if (FeatureMapUtil.isFeatureMap(feature) && value instanceof String) {
	                    FeatureMap featureMap = (FeatureMap) target.eGet(feature);
	                    FeatureMapUtil.addText(featureMap, (String) value);
	                } else {
	    	            if (feature instanceof EAttribute) {
	    	                EDataType type = (EDataType) feature.getEType();
	    	                if (value instanceof String && !type.isInstance(value)) {
	    	                    value = EcoreUtil.createFromString(type, (String) value);
	    	                }
	    	            }
	                	if (feature.isMany()) {
		                    List<Object> list = (List<Object>) target.eGet(feature);
		                    if (index != null) {
		                    	if (index >= 0 && index < list.size()) {
		                    		list.set(index, value);
		                    	}
		                    } else {
		                    	list.add(value);
		                    }
		                } else {
		                    target.eSet(feature, value);
		                }
	                }
	            }
        	}
        }
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T get(EObject root, String path) {
	    Object result = null;
	    EObject current = root;
	    String[] components = path.split("/");
	    for (String component : components) {
	        if (current != null) {
	        	String name = null;
	        	Integer index = null;
	        	Matcher matcher = COMPONENT_PATTERN.matcher(component);
	        	if (matcher.matches()) {
	        		name = matcher.group(1);
	        		if (matcher.group(3) != null) {
	        			index = Integer.valueOf(matcher.group(3)) - 1;
	        		}
		            EStructuralFeature feature = current.eClass().getEStructuralFeature(name);
		            if (feature != null) {
		            	if (feature.isMany()) {
		            		List<Object> list = (List<Object>) current.eGet(feature);
		            		if (index == null) {
		            			index = list.size() - 1;
		            		}
		            		result = (index >= 0 && index < list.size()) ? list.get(index) : null;
		            	} else {
		            		result = current.eGet(feature);
		            	}
		            	if (feature instanceof EReference) {
		            		current = (EObject) result;
		            	}
		            } else {
		            	result = current = null;
		            }
	        	}
	        }
	    }
	    return (T) result;
	}

	public static boolean isSet(EObject root, String path) {
	    return get(root, path) != null;
	}

	@SuppressWarnings("unchecked")
	public static void unset(EObject root, String path) {
	    String last = path.substring(path.lastIndexOf("/") + 1);
	    EObject target = path.equals(last) ? root : (EObject) get(root, path.substring(0, path.lastIndexOf("/")));
	    if (target != null) {
    		String name = null;
    		Integer index = null;
	    	Matcher matcher = COMPONENT_PATTERN.matcher(last);
	    	if (matcher.matches()) {
	    		name = matcher.group(1);
	    		if (matcher.group(3) != null) {
	    			index = Integer.valueOf(matcher.group(3)) - 1;
	    		}
		        EStructuralFeature feature = target.eClass().getEStructuralFeature(name);
		        if (feature != null) {
		        	if (feature.isMany() && index != null) {
		        		List<Object> list = (List<Object>) target.eGet(feature);
		        		if (index >= 0 && index < list.size()) {
		        			list.remove(index);
		        		}
		        	} else {
		        		target.eUnset(feature);
		        	}
		        }
	    	}
	    }
	}
}
