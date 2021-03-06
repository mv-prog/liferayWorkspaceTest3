package com.liferay.training2.portletModule2.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.training2.portletModule2.constants.PortletModule2PortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
@Component(
		immediate=true,
		property= {
				"javax.portlet.name="+PortletModule2PortletKeys.PORTLETMODULE2,
				"mvc.command.name=formHandler"
		},
		service=MVCActionCommand.class
		)
public class FormHandlerMVCActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		System.out.println("inside PortletModule2's doProcessAction();");
		String buttonBgColor = actionRequest.getRenderParameters().getValue("buttonBgColor");//I am using this instead of actionRequest.getParameter("backgroundColor") because that one is deprecated. I have also added "javax.portlet.version=3.0" to my portlet @Component properties to avoid compatibility errors.
	}

}
