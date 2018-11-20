package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>简单聊天室</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t// 创建WebSocket对象\n");
      out.write("        <script>\n");
      out.write("\tvar webSocket = new WebSocket(\"ws://localhost:8080/TestWebSocket/chat\");\n");
      out.write("\tvar sendMsg = function() {\n");
      out.write("\t\tvar inputElement = document.getElementById('msg');\n");
      out.write("\n");
      out.write("\t\tif (inputElement.value == '')\n");
      out.write("\t\t\talert(\"输入内容不为空\");\n");
      out.write("\t\telse {\n");
      out.write("\t\t\t// 发送消息\n");
      out.write("\t\t\twebSocket.send(inputElement.value);\n");
      out.write("\t\t\t// 清空单行文本框\n");
      out.write("\t\t\tinputElement.value = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tvar send = function(event) {\n");
      out.write("\t\tif (event.keyCode == 13) {\n");
      out.write("\t\t\tsendMsg();\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\twebSocket.onopen = function() {\n");
      out.write("\n");
      out.write("\t\tn = prompt('请给自己取一个昵称：');\n");
      out.write("\n");
      out.write("\t\tif (n != '' && n != null)\n");
      out.write("\t\t\twebSocket.send(n);\n");
      out.write("\t\telse\n");
      out.write("\t\t\t//设置游客登录\n");
      out.write("\t\t\twebSocket.send(\"游客\" + Math.random() * 100000000000000000);\n");
      out.write("\t\tdocument.getElementById('msg').onkeydown = send;\n");
      out.write("\t\tdocument.getElementById('sendBn').onclick = sendMsg;\n");
      out.write("\t};\n");
      out.write("\t// 为onmessage事件绑定监听器，接收消息\n");
      out.write("\twebSocket.onmessage = function(event) {\n");
      out.write("\t\tvar show = document.getElementById('show')\n");
      out.write("\t\t// 接收、并显示消息\n");
      out.write("\t\tshow.innerHTML += new Date() + \"<br/>\" + event.data + \"<br/>\";\n");
      out.write("\t\t//让聊天框滚动条始终显示新消息\n");
      out.write("\t\tshow.scrollTop = show.scrollHeight;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\twebSocket.onclose = function() {\n");
      out.write("\t\tdocument.getElementById('msg').onkeydown = null;\n");
      out.write("\t\tdocument.getElementById('sendBn').onclick = null;\n");
      out.write("\t\tConsole.log('WebSocket已经被关闭。');\n");
      out.write("\t};\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div\n");
      out.write("\t\tstyle=\"width: 600px; height: 240px; overflow-y: auto; border: 1px solid #333;\"\n");
      out.write("\t\tid=\"show\"></div>\n");
      out.write("\t<input type=\"text\" size=\"80\" id=\"msg\" name=\"msg\" placeholder=\"输入聊天内容\" />\n");
      out.write("\t<input type=\"button\" value=\"发送\" id=\"sendBn\" name=\"sendBn\" />\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
