package com.adobe.aem.guides.MicroSite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ToggleImageItems {

	@ValueMapValue
	private String iconFileReference;

	@ValueMapValue
	private String altText;

	@ValueMapValue
	private String toggleimage;

    public String getToggleimage() {
        return toggleimage;
    }

    public void setToggleimage(String toggleimage) {
        this.toggleimage = toggleimage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ValueMapValue
	private String description;

    @ValueMapValue
	private String color;


	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIconFileReference() {
		return iconFileReference;
	}

	public void setIconFileReference(String iconFileReference) {
		this.iconFileReference = iconFileReference;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	

}

