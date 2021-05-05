<%@ include file="/init.jsp" %>

    <%
        String cssStyle = "";
        String backgroundColor = request.getParameter("backgroundColor");
        if (backgroundColor != null && !backgroundColor.isEmpty()) {
            cssStyle = "background-color: " + backgroundColor + ";";
        }
    %>

    <div style="<%=cssStyle%>">
        <p>
            <b><liferay-ui:message key="portlet-module-portlet.caption"/></b>
        </p>
    </div>

    <portlet:renderURL var="viewRedURL">
        <portlet:param name="backgroundColor" value="red" />
    </portlet:renderURL>

    <portlet:renderURL var="viewYellowURL">
        <portlet:param name="backgroundColor" value="yellow" />
    </portlet:renderURL>

    <div class="btn-group">
        <a class="btn btn-default" href="<%=viewRedURL%>">Set red</a> <a
            class="btn btn-default" href="<%=viewYellowURL%>">Set yellow</a>
    </div>

    <portlet:actionURL name="handleForm" var="actionURL"/>

    <aui:form action="<%= actionURL %>" style="margin-top: 2rem;">
        <aui:select name="backgroundColor">
            <aui:option label="aqua"/>
            <aui:option label="gray"/>
            <aui:option label="lime" />
            <aui:option label="olive" />
            <aui:option label="silver" />
        </aui:select>
        <aui:button-row>
            <aui:button type="submit" value="send"/>
        </aui:button-row>
    </aui:form>
