package com.liferay.training.portlet.jsr286;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class JSR286Portlet implements Portlet {

	@Override
	public void init(PortletConfig config) throws PortletException {
		System.out.println("inside init()");

	}

	@Override
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
		System.out.println("inside processAction()");

	}

	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		System.out.println("inside render()");
//		PrintWriter printWriter = response.getWriter();//or we could change //the parameter response for renderResponse this one too, in order //not to misunderstand this response with other //methods' responses. 
//		printWriter.write("Frugal output from the JSR286Portlet, instead of a proper jsp.");
//		printWriter.write("\nSodes todos uns pasmons do carallo.");
		String path = "/META-INF/resources/view.jsp";
		PortletSession ps = request.getPortletSession();
		PortletContext pc = ps.getPortletContext();
		PortletRequestDispatcher prd = pc.getRequestDispatcher(path);
		if (prd == null) {
			System.err.println(path + " is not valid");
		} else {
			prd.include(request, response);
		}
	}

	@Override
	public void destroy() {
		System.out.println("inside destroy()");

	}

}
