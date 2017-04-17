
package org.template.com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.template.com.service package. 
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

    private final static QName _UpdateResponse_QNAME = new QName("http://service.com.template.org/", "updateResponse");
    private final static QName _FindAll_QNAME = new QName("http://service.com.template.org/", "findAll");
    private final static QName _Save_QNAME = new QName("http://service.com.template.org/", "save");
    private final static QName _SaveResponse_QNAME = new QName("http://service.com.template.org/", "saveResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.com.template.org/", "deleteResponse");
    private final static QName _FindByUserId_QNAME = new QName("http://service.com.template.org/", "findByUserId");
    private final static QName _Update_QNAME = new QName("http://service.com.template.org/", "update");
    private final static QName _FindByUserIdResponse_QNAME = new QName("http://service.com.template.org/", "findByUserIdResponse");
    private final static QName _LoadUserByLoginName_QNAME = new QName("http://service.com.template.org/", "loadUserByLoginName");
    private final static QName _FindAllResponse_QNAME = new QName("http://service.com.template.org/", "findAllResponse");
    private final static QName _LoadUserByLoginNameResponse_QNAME = new QName("http://service.com.template.org/", "loadUserByLoginNameResponse");
    private final static QName _Delete_QNAME = new QName("http://service.com.template.org/", "delete");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.template.com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FindByUserId }
     * 
     */
    public FindByUserId createFindByUserId() {
        return new FindByUserId();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link LoadUserByLoginNameResponse }
     * 
     */
    public LoadUserByLoginNameResponse createLoadUserByLoginNameResponse() {
        return new LoadUserByLoginNameResponse();
    }

    /**
     * Create an instance of {@link LoadUserByLoginName }
     * 
     */
    public LoadUserByLoginName createLoadUserByLoginName() {
        return new LoadUserByLoginName();
    }

    /**
     * Create an instance of {@link FindByUserIdResponse }
     * 
     */
    public FindByUserIdResponse createFindByUserIdResponse() {
        return new FindByUserIdResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Permission }
     * 
     */
    public Permission createPermission() {
        return new Permission();
    }

    /**
     * Create an instance of {@link BaseModel }
     * 
     */
    public BaseModel createBaseModel() {
        return new BaseModel();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "findByUserId")
    public JAXBElement<FindByUserId> createFindByUserId(FindByUserId value) {
        return new JAXBElement<FindByUserId>(_FindByUserId_QNAME, FindByUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUserIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "findByUserIdResponse")
    public JAXBElement<FindByUserIdResponse> createFindByUserIdResponse(FindByUserIdResponse value) {
        return new JAXBElement<FindByUserIdResponse>(_FindByUserIdResponse_QNAME, FindByUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadUserByLoginName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "loadUserByLoginName")
    public JAXBElement<LoadUserByLoginName> createLoadUserByLoginName(LoadUserByLoginName value) {
        return new JAXBElement<LoadUserByLoginName>(_LoadUserByLoginName_QNAME, LoadUserByLoginName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadUserByLoginNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "loadUserByLoginNameResponse")
    public JAXBElement<LoadUserByLoginNameResponse> createLoadUserByLoginNameResponse(LoadUserByLoginNameResponse value) {
        return new JAXBElement<LoadUserByLoginNameResponse>(_LoadUserByLoginNameResponse_QNAME, LoadUserByLoginNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com.template.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

}
