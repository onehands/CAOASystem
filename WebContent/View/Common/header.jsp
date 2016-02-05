<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    Calendar c = Calendar.getInstance();
    c.add(Calendar.DATE, -2);

    Calendar d = Calendar.getInstance();
    d.add(Calendar.DATE, -1);
    String beginTime = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    String endTime = new SimpleDateFormat("yyyy-MM-dd").format(d.getTime());
%>

<base href="<%=basePath%>">