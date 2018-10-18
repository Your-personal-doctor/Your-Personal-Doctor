package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Register Page</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("h1{text-align:center;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t//alert(\"check jQuery work or not\");\r\n");
      out.write("\t\t$(\"#form1\").submit(function(){\r\n");
      out.write("\t\t\tvar name=$(\"#name\").val();//get the value \r\n");
      out.write("\t\t\tif(name.length==0){// to check the name is not null\r\n");
      out.write("\t\t\t\t$(\"#nameError\").html(\"Please enter the username\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//password cannot be null\r\n");
      out.write("\t\t\tvar password=$(\"#password\").val();//get the password value \r\n");
      out.write("\t\t\tif(password.length==0){\r\n");
      out.write("\t\t\t\t$(\"#passwordError\").html(\"Please enter the password\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//check the password\r\n");
      out.write("\t\t\tvar relpassword=$(\"#relpassword\").val();//get the password value \r\n");
      out.write("\t\t\tif(relpassword.length==0){\r\n");
      out.write("\t\t\t\t$(\"#relpasswordError\").html(\"Please re-type the password\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(password!=relpassword){\r\n");
      out.write("\t\t\t\t$(\"#relpasswordError\").html(\"The password is different\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"user/userregister\" method=\"post\" id=\"form1\">\r\n");
      out.write("\t<h1>Register</h1>\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t<table align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>*Username：</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"name\" id=\"name\"/>\r\n");
      out.write("\t\t\t\t<div id=\"nameError\" style=\"display:inline;color:red;\"></div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>*Password：</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\">\r\n");
      out.write("\t\t\t\t<div id=\"passwordError\" style=\"display:inline;color:red;\"></div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>*Re-type the password：</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"relpassword\" id=\"relpassword\">\r\n");
      out.write("\t\t\t\t<div id=\"relpasswordError\" style=\"display:inline;color:red;\"></div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Phone number：</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"phone\" id=\"phone\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>*Email：</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"email\" id=\"email\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"1\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"submit\"/>\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"reset\"/>\r\n");
      out.write("\t\t\t\t<a href=\"login.jsp\" target=\"_blank\">Login</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
