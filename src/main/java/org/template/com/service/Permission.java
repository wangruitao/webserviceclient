
package org.template.com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.com.template.org/}baseModel">
 *       &lt;sequence>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="permissionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permission", propOrder = {
    "disabled",
    "id",
    "permissionCode",
    "permissionName",
    "permissionUrl"
})
public class Permission
    extends BaseModel
{

    protected Integer disabled;
    protected Long id;
    protected String permissionCode;
    protected String permissionName;
    protected String permissionUrl;

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisabled(Integer value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the permissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * Sets the value of the permissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionCode(String value) {
        this.permissionCode = value;
    }

    /**
     * Gets the value of the permissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * Sets the value of the permissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionName(String value) {
        this.permissionName = value;
    }

    /**
     * Gets the value of the permissionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionUrl() {
        return permissionUrl;
    }

    /**
     * Sets the value of the permissionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionUrl(String value) {
        this.permissionUrl = value;
    }

}
