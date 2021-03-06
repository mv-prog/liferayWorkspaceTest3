package com.liferay.training.portlet.portletmodule.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.training.portlet.portletmodule.constants.PortletModulePortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
@Component(
	immediate=true, //this is telling the osgi container to start the component immediately if it is able to do that.
	property = {//we need 2 properties: 
			"javax.portlet.name=" + PortletModulePortletKeys.PORTLETMODULE,//1st one is which portlet i am listening to. when we create the portlet using a liferay module project is going to be stored within the constants, so I can reference the portlet keys.PortletModule 
			"mvc.command.name=handleForm"//2nd one is what the parameter that I am listening for is, that is, the MVCCommand name. this is the name declared within the actionURL. so if we go back to our jsp and look it up we'll see it's handleForm
	},  
	service = MVCActionCommand.class //if we see the keyword implements we do not need to add this, but if wee see the keyword extends this line is mandatory: 
	//we need to register the component as a specific serive type. Since we are not directly implementing
	//an interface the osgi is not gonna know so we gotta let the osgi container know which type of service we are gonna register this service type as.
	//typically, but not always, if we are looking at a liferay class, the interface is typically without the base.  
)

public class HandleFormMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		_handleActionCommand(actionRequest);
	}
	
	private void _handleActionCommand(ActionRequest actionRequest) {
		System.out.println("inside _handleActionCommand()"); 
		String backgroundColor = actionRequest.getRenderParameters().getValue("backgroundColor");//I am using this instead of actionRequest.getParameter("backgroundColor") because that one is deprecated. I have also added "javax.portlet.version=3.0" to my portlet @Component properties to avoid compatibility errors.
		System.out.println("Background Color is: " + backgroundColor);
	}
}
