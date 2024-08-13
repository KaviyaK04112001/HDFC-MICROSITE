package com.adobe.aem.guides.MicroSite.core.models;

import javax.inject.Inject;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ToggleImageModel {

	@Inject
	private List<ToggleImageItems> sectionOneBrandDetails;

    
	public List<ToggleImageItems> getSectionOneBrandDetails() {
		return sectionOneBrandDetails;
	}

   

	public void setSectionOneBrandDetails(List<ToggleImageItems> sectionOneBrandDetails) {
		this.sectionOneBrandDetails = sectionOneBrandDetails;
	}

	
}

