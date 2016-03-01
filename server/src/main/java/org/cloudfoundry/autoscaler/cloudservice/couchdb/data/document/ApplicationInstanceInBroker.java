package org.cloudfoundry.autoscaler.cloudservice.couchdb.data.document;

import org.ektorp.support.TypeDiscriminator;

@TypeDiscriminator ("doc.type=='ApplicationInstance_inBroker'")
public class ApplicationInstanceInBroker extends TypedCouchDbDocument {
	
	private String bindingId;
    private String serviceId;
    
    public ApplicationInstanceInBroker() {
    	this.type = "ApplicationInstance_inBroker";
    }
   
	public String getBindingId() {
		return bindingId;
	}

	public void setBindingId(String bindingId) {
		this.bindingId = bindingId;
	}
	
	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
}