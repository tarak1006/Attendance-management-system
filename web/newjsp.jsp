
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">



<%@page import= "java.text.SimpleDateFormat"%>
<%@page import= "org.apache.poi.ss.usermodel.DateUtil"%>
<%@page import= "java.math.BigDecimal"%>
<%@page import= "org.apache.poi.ss.util.CellRangeAddress"%>
<%@page import= "org.apache.poi.hssf.util.CellRangeAddress8Bit"%>
<%@page import= "java.util.ArrayList"%>
<%@page import= "java.util.Iterator"%>
<%@page import= " java.util.List"%>

<%//@page buffer="15000kb" autoFlush="true" %>
<%//@page import= "org.apache.commons.lang3.StringUtils" %>
<%@page import= " java.lang.IllegalStateException"%>
<%@page import= "org.apache.poi.xssf.streaming.SXSSFWorkbook"%>
<%@page import= "org.apache.poi.ss.usermodel.Sheet"%>
<%@page import= "org.apache.poi.ss.usermodel.Workbook"%>
<%@page import= "org.apache.poi.xssf.*"%>
<%@page import= "org.apache.poi.xssf.usermodel.XSSFSheet"%>
<%@page import= "org.apache.poi.xssf.usermodel.XSSFWorkbook"%>
<%@page import= "org.apache.poi.xssf.usermodel.XSSFCell"%>
<%@page import= "org.apache.poi.xssf.usermodel.XSSFRow"%>
<%@page import= "java.io.FileOutputStream" %>
<%@page import= "org.apache.poi.hssf.usermodel.HSSFCell"%>
<%@page import= "org.apache.poi.hssf.usermodel.HSSFRow"%>
<%@page import= "org.apache.poi.poifs.filesystem.POIFSFileSystem"%>
<%@page import= "org.apache.poi.ss.usermodel.Cell"%>
<%@page import= "org.apache.poi.ss.usermodel.Row"%>
<%@ page import ="java.io.*" %>
<%@ page import= "org.apache.poi.hssf.usermodel.HSSFWorkbook" %>
<%@ page import= "org.apache.poi.hssf.usermodel.HSSFSheet" %>
<%@ page import= "org.apache.poi.ss.*" %>
<%@ page import= "java.util.*" %>
<%@ page import= "java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Student Info</title>
    </head>
    <body>
        <%
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
                String fname = "SAMPLE2.xlsx";   //(String) request.getAttribute("fname");
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
                    Row row = rowIterator.next();
                    int i = 0;
                    int j=0;
                    Iterator<Cell> cellIterator = row.cellIterator();
                    count=0; 
                     String t1 = "";
                    int counter=0;
                    vj=0;
                    while (cellIterator.hasNext()) 
                    {
                        Cell cell = cellIterator.next();
                         if(count>0 && cell.getRowIndex()== cell.getColumnIndex() && cell.getRowIndex()== j)
                        //out.println("<br/>"+cell.getCellType());
                        for (Iterator<CellRangeAddress> it = regionsList.iterator(); it.hasNext();) {
                            CellRangeAddress region = it.next();

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
                       
                        count++;
                        vj++;
                    }
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
		String insertTableSQL = "insert into wpproject1"
				+ "(regno,name,wp,es,flat,ooad,se,ai) values"
				+ "(?,?,?,?,?,?,?,?)";

		try {
			
			preparedStatement = conn.prepareStatement(insertTableSQL);
                        
			preparedStatement.setString(1, values[i1][0]);
			preparedStatement.setString(2, values[i1][1]);
			preparedStatement.setString(3, values[i1][2]);
			preparedStatement.setString(4, values[i1][3]);
                        preparedStatement.setString(5, values[i1][4]);
			preparedStatement.setString(6, values[i1][5]);
			preparedStatement.setString(7, values[i1][6]);
                        preparedStatement.setString(8, values[i1][7]);
		
                        

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
                
                
            } 
                
                     response.sendRedirect("newhtml.html");
        %>
    </body>
</html>



