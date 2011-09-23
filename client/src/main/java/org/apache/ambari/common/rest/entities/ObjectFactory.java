//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.30 at 04:53:46 PM PDT 
//


package org.apache.ambari.common.rest.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.hms.common.rest.entities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Clusters_QNAME = new QName("", "Clusters");
    private final static QName _Nodes_QNAME = new QName("", "Nodes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.hms.common.rest.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNodeType() {
        return new Node();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUserType() {
        return new User();
    }

    /**
     * Create an instance of {@link Roles }
     * 
     */
    public Roles createRolesType() {
        return new Roles();
    }

    /**
     * Create an instance of {@link RoleToNodesMap }
     * 
     */
    public RoleToNodesMap createRoleToNodesMapType() {
        return new RoleToNodesMap();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRoleType() {
        return new Role();
    }

    /**
     * Create an instance of {@link RoleToNodesMapEntry }
     * 
     */
    public RoleToNodesMapEntry createRoleToNodesMapEntryType() {
        return new RoleToNodesMapEntry();
    }

    /**
     * Create an instance of {@link ConfigPropertiesCategory }
     * 
     */
    public ConfigPropertiesCategory createCategoryType() {
        return new ConfigPropertiesCategory();
    }

    /**
     * Create an instance of {@link PackageRepository }
     * 
     */
    public PackageRepository createPackageType() {
        return new PackageRepository();
    }

    /**
     * Create an instance of {@link NodeAttributes }
     * 
     */
    public NodeAttributes createNodeMetricsType() {
        return new NodeAttributes();
    }

    /**
     * Create an instance of {@link ClusterDefinition }
     * 
     */
    public ClusterDefinition createClusterType() {
        return new ClusterDefinition();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServicesType() {
        return new Services();
    }

    /**
     * Create an instance of {@link Blueprint }
     * 
     */
    public Blueprint createBlueprintType() {
        return new Blueprint();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createPropertyType() {
        return new Property();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfigurationType() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createServiceType() {
        return new Service();
    }

    /**
     * Create an instance of {@link NodeState }
     * 
     */
    public NodeState createNodeToRolesMapType() {
        return new NodeState();
    }

    /**
     * Create an instance of {@link DiagnosticLog }
     * 
     */
    public DiagnosticLog createDiagnosticLogType() {
        return new DiagnosticLog();
    }

}
