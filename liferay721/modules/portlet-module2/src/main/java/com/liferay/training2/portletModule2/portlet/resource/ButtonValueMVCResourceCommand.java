package com.liferay.training2.portletModule2.portlet.resource;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training2.portletModule2.constants.PortletModule2PortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(
		immediate=true,
		property= {
				"javax.portlet.name="+PortletModule2PortletKeys.PORTLETMODULE2,
				"mvc.command.name=buttonValue"
		}
		)
public class ButtonValueMVCResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String cmd = ParamUtil.getString(resourceRequest,"cmd");
        if(cmd.equals("buttonA")) {
            System.out.println("button A clicked");
            return true;
        }
        if(cmd.equals("buttonB")) {
        	System.out.println("button B clicked");
            return true;
        }
		return false;
	}

}
