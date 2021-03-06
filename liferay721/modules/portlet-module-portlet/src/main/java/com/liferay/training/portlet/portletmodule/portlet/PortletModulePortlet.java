package com.liferay.training.portlet.portletmodule.portlet;

import com.liferay.training.portlet.portletmodule.constants.PortletModulePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author monica.veigapuente
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.version=3.0",//I am adding this to be able to use the getRenderParameters() instead of the deprecated getParameter.
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PortletModule",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletModulePortletKeys.PORTLETMODULE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletModulePortlet extends MVCPortlet {
}