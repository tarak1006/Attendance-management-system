package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import java.math.BigDecimal;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.hssf.util.CellRangeAddress8Bit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.IllegalStateException;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.*;
import java.util.*;
import java.sql.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \n");
      out.write("\t\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
//@page buffer="15000kb" autoFlush="true" 
      out.write('\n');
//@page import= "org.apache.commons.lang3.StringUtils" 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String soc_cat="temp";
            String finalstr="";
            int count=0;
            int vi=0,vj=0;
            String values[][]=new String[200][10];
            String filepath;
            filepath=getServletContext().getInitParameter("file-upload");
            System.out.println("filepath"+filepath);
            String abc=request.getParameter("arr");
            System.out.println("abc"+abc);
            
            /* Create Connection objects */
            try {

                //Class.forName("com.mysql.jdbc.Driver");
                // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
                // PreparedStatement sql_statement = null;
                XSSFWorkbook my_xls_workbook = null;
                HSSFWorkbook my_xls_workbook1 = null;
                Sheet my_worksheet = null;
                Iterator<Row> rowIterator = null;
                //String file = request.getParameter("file");
                String fname = "sample1.xlsx";   //(String) request.getAttribute("fname");
                String fpath = "C:\\new folder\\";//(String) request.getAttribute("fpath");
                ///soc_cat=(String) request.getAttribute("soc_cat");
                //out.println("file name"+ file);
                String fileName = fname;
                String filePath = fpath;

                int ch;
                int n = fileName.lastIndexOf('\\');
                if (n != -1) {
                    fileName = fileName.substring(n + 1);
                }
                //out.println(filePath + fileName);
                //  try {
                //String jdbc_insert_sql = "INSERT INTO fee_xls VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                // sql_statement = conn.prepareStatement(jdbc_insert_sql);
                InputStream input_document = new FileInputStream(new File("C:/new folder/" + fileName));
                /* We should now load excel objects and loop through the worksheet data */
                /* Load workbook */
                //File file = new File("d:/temp/"+fileName);
                if (fileName.charAt(fileName.length() - 1) == 'x') //if input excel file is *.xlsx
                {
                    my_xls_workbook = new XSSFWorkbook(input_document);
                    my_worksheet = my_xls_workbook.getSheetAt(0);
                    rowIterator = my_worksheet.iterator();
                } else {
                    my_xls_workbook1 = new HSSFWorkbook(input_document);
                    my_worksheet = my_xls_workbook1.getSheetAt(0);
                    rowIterator = my_worksheet.iterator();
                }
                /* Load worksheet */
                List<CellRangeAddress> regionsList = new ArrayList<CellRangeAddress>();
                //out.println("value:" + my_worksheet.getNumMergedRegions());
                for (int i = 0; i < my_worksheet.getNumMergedRegions(); i++) {
                    regionsList.add(my_worksheet.getMergedRegion(i));

                }
               
                int k = 0;
                
                // we loop through and insert data
                
                
                while (rowIterator.hasNext()) {
                    
                    Row row = rowIterator.next;
                    int i = 0;
                    int j=0;
                    Iterator<Cell> cellIterator = row.cellIterator();
                    count=0; 
                     String t1 = "";
                    int counter=0;
                    vj=0;
                    while (cellIterator.hasNext()) 
                    {
                        Cell cell = cellIterator.next;
                         if(count>0 && cell.getRowIndex()== cell.getColumnIndex() && cell.getRowIndex()== j)
                        //out.println("<br/>"+cell.getCellType());
                        for (Iterator<CellRangeAddress> it = regionsList.iterator(); it.hasNext();) {
                            CellRangeAddress region = it.next;

                            k = 0;
                            
                           // out.println("hello "+cell.getRowIndex()+" "+ cell.getColumnIndex()+"<br>");

                           
                            if (region.isInRange(cell.getRowIndex(), cell.getColumnIndex())) {
                                // Now, you need to get the cell from the top left hand corner of this
                                int rowNum = region.getFirstRow();
                                int colIndex = region.getFirstColumn();
                                cell = my_worksheet.getRow(rowNum).getCell(colIndex);
                                //out.println("<font color=\"red\">Merged</font> region value is "
                                //  + cell.getStringCellValue());
                                String temp1 = cell.getStringCellValue();
                                //out.println(temp1);
                                //out.println("<br>");
                                
                                k = 1;
                                break;
                            }
                           //break;
                            //if(t1.length()==7)
                            // break;
                        }

                        if (k == 0) {
                            int rowNum = cell.getRowIndex();
                            int colIndex = cell.getColumnIndex();
                            cell = my_worksheet.getRow(rowNum).getCell(colIndex);
                           // out.println("<font color=\"blue\">UnMerged</font> region value is"
                            // + cell.getStringCellValue());

                        }
                            String str="";
                        try {
                            
//System.out.println(bd.doubleValue());
                            
                            switch (cell.getCellType()) 
                            {
                                 case Cell.CELL_TYPE_NUMERIC:
                                if(DateUtil.isCellDateFormatted(cell)) 
                                {
                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                                out.print(dateFormat.format(cell.getDateCellValue()) + ";");
                                finalstr=finalstr+dateFormat.format(cell.getDateCellValue())+" ; ";
                                } 
                                else 
                                {
                               BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
                                    out.println( bd.toString()+ ";");
                                    finalstr=finalstr+bd.toString()+" ; ";
                                    str= bd.toString();
                                }
                                break;
                                /*case 0:
                                    // out.println("    " + cell.getNumericCellValue() + "       ");
                                    try{
                                    BigDecimal bd = new BigDecimal(cell.getDateCellValue());
                                    out.println("  : " + bd.toString()+ "      ");
                                    }catch(IllegalStateException ise){
                                    BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
                                    out.println("  : " + bd.toString()+ "      ");
                                    }
                                    break;*/
                                case 1:
                                    
                                        out.println( cell.getStringCellValue() + ";");
                                        str=cell.getStringCellValue();
                                        finalstr=finalstr+cell.getStringCellValue()+" ; ";
                                        
                                    break;
                                case 2:
                                    out.println(cell.getCellFormula() + ";");
                                    str=cell.getCellFormula();
                                    finalstr=finalstr+cell.getCellFormula()+" ; ";
                                    break;
                                case 3:
                                    out.println("");
                                    
                                    break;
                                case 4:
                                    out.println(cell.getBooleanCellValue() + ";");
                                   
                                    finalstr=finalstr+cell.getBooleanCellValue()+" ; ";
                                    break;
                                case 5:
                                    out.println(cell.getErrorCellValue() + ";");
                                    
                                    finalstr=finalstr+cell.getErrorCellValue()+" ; ";
                                    break;
                                   

                            }
                            counter++;
                        } catch (IllegalStateException ise) {
                            out.println(ise);
                        }
                        //System.out.println("str="+str);
                        values[vi][vj]=str;
                       //out.println("data is:"+cell.getStringCellValue());
                        // sql_statement.setString(++i, (cell.getStringCellValue()).toString());
                        //switch (cell.getCellType()) {
                        //   case Cell.CELL_TYPE_STRING: //handle string columns
                        //  sql_statement.setString(1, cell.getStringCellValue());
                        //     break;
                        //case Cell.CELL_TYPE_NUMERIC: //handle double data
                        //sql_statement.setString(2, cell.getStringCellValue());
                        //  break;
                        //}
                        count++;
                        vj++;
                    }
                    //out.println("<br>");  //end of column cells
                    //-->>finalstr=finalstr;
                   
                    //we can execute the statement before reading the next row
                    //sql_statement.executeUpdate();
                    //  input_document.close();
                    vi++;
                } //end of row cells
              
            } catch (Exception e) {
                out.println(e);
            }
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wpproject", "root", "");
            PreparedStatement preparedStatement = null;
            for(int i1=1;i1<vi;i1++)
            {
                
                /*for(int j1=0;j1<vj;j1++)
                {
                    //if(values[i1][j1]!=null){
                    System.out.print(values[i1][j1]+" ");
                }//}
                System.out.println("");
            }  	*/

		String insertTableSQL = "insert into sample1"
				+ "(name,rollno,wp,es) values"
				+ "(?,?,?,?)";

		try {
			
			preparedStatement = conn.prepareStatement(insertTableSQL);
                        
			preparedStatement.setString(1, values[i1][0]);
			preparedStatement.setString(2, values[i1][1]);
			preparedStatement.setString(3, values[i1][2]);
			preparedStatement.setString(4, values[i1][3]);
                       

			// execute insert SQL stetement
			preparedStatement.executeUpdate();
                        System.out.println(values[i1][0]+" "+values[i1][1]+" "+values[i1][2]+" ");
			System.out.println("Record is inserted into college table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
                
                /*for(int j1=0;j1<vj;j1++)
                {
                    System.out.print(values[i1][j1]);
                }*/
            } 
                //out.println(finalstr);
                
                // String str1,str2;
                //str1=finalstr.substring(0, finalstr.length()/2);
                //str2=finalstr.substring( finalstr.length()/2+1,finalstr.length()-1);
               // out.flush();
           ////       try 
           //// {
                  //out.print(str1);
                 // out.flush();
                  //out.println(finalstr);
/* ////            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp_hostgvp", "root", "tiger");
            //Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp_hostgvp", "root", "tiger");
           PreparedStatement statement1=conn.prepareStatement("insert into proceeding values(?,?,?,?)");
            PreparedStatement statement = conn.prepareStatement("insert into s_feereim values(?,?,?,?,?,?,?,?,?,?,?,?)");
            Statement stmt=conn.createStatement();
            //ResultSet rs=null;
       //  String finalstr;
        //String str1 = (String) request.getAttribute("str1");
         //finalstr = (String) request.getAttribute("finalstr");
       //  finalstr=str1+str2; 
      
        
        StringTokenizer st=new StringTokenizer(finalstr,":");
        System.out.println("final String"+finalstr);
        String str=st.nextToken();
        String proceeding_no="",proceeding_dt="",schol_type="",release_dt="";
        //while(st.hasMoreTokens())
        //{
            
            str=st.nextToken();
            StringTokenizer st1=new StringTokenizer(str);
            proceeding_no=st1.nextToken();
            //st.nextToken();
            str=st.nextToken();
            st1=new StringTokenizer(str);
            proceeding_dt=st1.nextToken();
            
            str=st.nextToken();
            st1=new StringTokenizer(str);
            schol_type=st1.nextToken();
            str=st.nextToken();
            st1=new StringTokenizer(str,";");
            release_dt=st1.nextToken();
            out.println(proceeding_no+" "+proceeding_dt+" "+schol_type+" "+release_dt);
            statement1.setString(1,release_dt);
            statement1.setString(2,proceeding_dt);
            statement1.setString(3,proceeding_no);
            statement1.setString(4,soc_cat);
            statement1.executeUpdate();
            
       // } 
            String remaining=str;
            ///out.println("<br>"+remaining);
            st1=new StringTokenizer(remaining,";");
            for(int i=0;i<12;i++)
                st1.nextToken();
            int counter=1;
            String sno="",appno="",name="",course="",branch="",year="",rel_from="",rel_to="",months="",tut_fee="",spec_fee="",other_fee="";
             String regno="hello";
            while(st1.hasMoreTokens())
            {    
               regno="demo"+Integer.toString(counter++);
             sno=st1.nextToken();
             appno=st1.nextToken();
            name=st1.nextToken();
            name=name.trim();
           
            String course1=st1.nextToken();
            if(course1.contains("("))
            {
                System.out.println("In course"+course1);
            course=course1.substring(0,(course1.indexOf("(")));
             branch=course1.substring(course1.indexOf("(")+1,course1.indexOf(")"));
            year=course1.substring(course1.lastIndexOf("/")+1);
             course=course.trim();
            System.out.println("In btech1"+course);
           
            if(course.equals("BTECH")){
                  System.out.println("In btech2"+course);
             ResultSet rs=stmt.executeQuery("select s_plus2hallticket from hostgvp where s_name ='"+name+"'");
           
            if(rs.next()){
                 regno=rs.getString(1);
            }
            }
            else
            {
            ResultSet rs1=stmt.executeQuery("select s_adminno from gvp_pg where s_name = '"+name+"'");
           
            if(rs1.next()){
                 regno=rs1.getString(1);
            }
                
            }
            //Thread.sleep(2000);
            }
            else if(course1.contains("/"))
            {
            course=course1.substring(0,(course1.indexOf("/")));
             branch="MCA";
            year=course1.substring(course1.lastIndexOf("/")+1);
             ResultSet rs=stmt.executeQuery("select s_adminno from gvp_pg where s_name = '"+name+"'");
           
            while(rs.next()){
                 regno=rs.getString(1);  
            }
            }
            else
            {
                regno="broken";
                 break;
            }
            out.println(course+"--"+year+"--"+branch+"--"+regno+"--"+name+"--");
            System.out.println(course+"--"+year+"--"+branch+"--"+regno+"--"+name+"--");
            rel_from=st1.nextToken();
            rel_to=st1.nextToken();
            months=st1.nextToken();
            tut_fee=st1.nextToken();
            spec_fee=st1.nextToken();
            other_fee=st1.nextToken();    //////     */
            /*if(regno.equals(null)){
            regno="demo"+Integer.toString(counter++);
            }*/
        /*    ////////     statement.setString(1,regno);
            statement.setString(2,proceeding_no);
            statement.setString(3,appno);
            statement.setString(4,course);
            statement.setString(5,branch);
            statement.setString(6,year);
            statement.setString(7,rel_from);
            statement.setString(8,rel_to);
            statement.setString(9,months);
            statement.setString(10,tut_fee);
            statement.setString(11,spec_fee);
            statement.setString(12,other_fee);
            statement.executeUpdate();
            sno=st1.nextToken();
            
            }
          
            }
            catch ( IOException e) {
            out.println(e+"Exception occured at this point");
            }
          
             out.println("Content Inserted Successfully");   
                
                ///////   */
                
               // String str1,str2;
                //str1=finalstr.substring(0, finalstr.length()/2);
                //str2=finalstr.substring( finalstr.length()/2+1,finalstr.length()-1);
                    //RequestDispatcher rd = request.getRequestDispatcher("Split_content.jsp");
                    //request.setAttribute("finalstr",finalstr);
                    //request.setAttribute("fpath", filePath);
                   // request.setAttribute("str1",str1);
                   // request.setAttribute("str2", str2);
                    //rd.forward(request, response);
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
