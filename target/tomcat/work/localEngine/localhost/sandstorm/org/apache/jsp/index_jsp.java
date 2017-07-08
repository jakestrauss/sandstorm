package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" \t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/styles/main.css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\t\ttd\n");
      out.write("\t\t{\n");
      out.write("    \t\tpadding:0 5px 0 5px;\n");
      out.write("\t\t}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \t<h1>sandstorm</h1>\n");
      out.write("    \t<h3>Choose songs to add to a playlist to sandstorm</h3>\n");
      out.write("    \t<br>\n");
      out.write("    \t<table>\n");
      out.write("    \t\t<tr>\n");
      out.write("\t\t\t\t<th>Search for song</th>\n");
      out.write("\t\t\t\t<th>Search for artist</th>\n");
      out.write("\t\t\t\t<th>Search for album</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t    \t\t<td class=\"paddingBetweenCols\">\n");
      out.write("\t        \t\t<form method=\"post\" action=\"SongSearcher\">\n");
      out.write("\t        \t\t\t<div>\n");
      out.write("\t        \t\t\t\t<input type = \"text\" name=\"Song name\"><br>\n");
      out.write("\t        \t\t\t\t<input type = \"submit\" value=\"Search\">\n");
      out.write("\t        \t\t\t</div>\n");
      out.write("\t        \t\t</form>\n");
      out.write("\t        \t</td>\n");
      out.write("        \t\n");
      out.write("\t        \t<td class=\"paddingBetweenCols\">\n");
      out.write("\t        \t\t<form method=\"post\" action=\"ArtistSearcher\">\n");
      out.write("\t        \t\t\t<div>\n");
      out.write("\t        \t\t\t\t<input type = \"text\" name=\"Artist name\"><br>\n");
      out.write("\t        \t\t\t\t<input type = \"submit\" value=\"Search\">\n");
      out.write("\t        \t\t\t</div>\n");
      out.write("\t        \t\t</form>\n");
      out.write("\t        \t</td>\n");
      out.write("        \t\n");
      out.write("\t        \t<td class=\"paddingBetweenCols\">\n");
      out.write("\t        \t\t<form method=\"post\" action=\"AlbumSearcher\">\n");
      out.write("\t        \t\t\t<div>\n");
      out.write("\t        \t\t\t\t<input type = \"text\" name=\"Album name\"><br>\n");
      out.write("\t        \t\t\t\t<input type = \"submit\" value=\"Search\">\n");
      out.write("\t        \t\t\t</div>\n");
      out.write("\t        \t\t</form>\n");
      out.write("\t        \t</td>\n");
      out.write("\t        </tr>\n");
      out.write("       </table>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
