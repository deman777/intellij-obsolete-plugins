// Generated on Tue Dec 11 18:29:45 MSK 2007
// DTD/Schema  :    http://jboss.com/products/seam/web

package com.intellij.seam.model.xml.web;


import com.intellij.seam.model.xml.components.BasicSeamComponent;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

/**
 * http://jboss.com/products/seam/web:multipart-filterElemType interface.
 */
public interface MultipartFilter extends SeamWebDomElement, BasicSeamComponent {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue();
	/**
	 * Sets the value of the simple content.
	 * @param value the new value to set
	 */
	void setValue(@NotNull String value);


	/**
	 * Returns the value of the url-pattern child.
	 * @return the value of the url-pattern child.
	 */
	@NotNull
	GenericAttributeValue<String> getUrlPattern();


	/**
	 * Returns the value of the disabled child.
	 * @return the value of the disabled child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisabled();


	/**
	 * Returns the value of the create-temp-files child.
	 * @return the value of the create-temp-files child.
	 */
	@NotNull
	GenericAttributeValue<CreateTempFiles> getCreateTempFiles();


	/**
	 * Returns the value of the max-request-size child.
	 * @return the value of the max-request-size child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaxRequestSize();


}
