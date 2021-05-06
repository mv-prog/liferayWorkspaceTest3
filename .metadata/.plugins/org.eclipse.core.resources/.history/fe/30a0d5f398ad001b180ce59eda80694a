package com.liferay.training2.portletModule2.portlet.render;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.training2.portletModule2.constants.PortletModule2PortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
@Component(
		immediate=true,
		property= {
				"javax.portlet.name="+PortletModule2PortletKeys.PORTLETMODULE2,
				"mvc.command.name=edit-component"
		}
		)
public class EditPageMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/edit.jsp";
	}

}
