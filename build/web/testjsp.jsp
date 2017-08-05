<%-- 
    Document   : testjsp
    Created on : Oct 10, 2016, 12:09:53 AM
    Author     : Tarak
--%>

<%@page contentType="text/html" import="java.io.*" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%   
          String abc="tarak";%>
         <%
        String ghi=request.getParameter("file2");
        int i=0,j=0;
        while(i<ghi.length()){
            Character b=ghi.charAt(i);
            if(b.equals("/"))
                j++;
            if(j==2)
                break ;
        }
        String a=ghi.substring(0,i);
        String b=ghi.substring(i);
        
       
        System.out.println(ghi);
       
        System.out.println(ghi);
       
       
                %>
                <h1>Hello world <%=a%> <%=b%></h1>
                
    </body>
</html>
