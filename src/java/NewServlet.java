import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.servlet.ServletException;  
import javax.servlet.http.Cookie;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class NewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        String sub=request.getParameter("subject");
        String att=request.getParameter("attendance"); 
  try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wpproject","root","");
 
  ResultSet rs;
Statement st=con.createStatement();
if(att.equals("1"))
 rs=st.executeQuery("select * from wpproject1 where "+sub+">65 and "+sub+"<75"); 
else if(att.equals("2"))
 rs=st.executeQuery("select * from wpproject1 where "+sub+" <65");   
        
else
rs=st.executeQuery("select * from wpproject1 where "+sub+" >75");

out.println("<html><table border=1><tr>");
out.println("<th>name</th><th>rollno</th><th>"+sub+" attendance</th></tr>");
while(rs.next())
{

out.println("<tr><td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(sub)+"</td></tr>");
} 


out.println("</table></html>"); 

  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}
          
        
        out.close();  
    }  
  
}  
