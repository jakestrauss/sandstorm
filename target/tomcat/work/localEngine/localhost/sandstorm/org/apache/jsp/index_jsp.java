package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    \t<meta charset=\"utf-8\">\n");
      out.write("    \t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    \t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write(" \t\t<!-- Bootstrap -->\n");
      out.write("    \t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>sandstorm home</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\t\ttd\n");
      out.write("\t\t{\n");
      out.write("    \t\tpadding:0 5px 0 5px;\n");
      out.write("\t\t}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /index.jsp(23,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sandstorm}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t    \t<h1 style=\"font-family:Condiment\">sandstorm</h1>\n");
        out.write("\t    \t<h3>Choose songs to add to a playlist to sandstorm</h3>\n");
        out.write("\t    \t<br>\n");
        out.write("\t    \t<div class=\"container\">\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t\t\t<div class=\"row\">\n");
        out.write("\t\t\t\t\t<form method=\"post\" action=\"SongSearcher\">\n");
        out.write("\t\t\t    \t\t<div class=\"col-md-3 form-group\">\n");
        out.write("\t\t\t    \t\t\t<label for=\"Song name\">Search for song</label>\n");
        out.write("\t\t\t    \t\t\t<input type=\"text\" class=\"form-control\" name=\"Song name\" placeholder=\"Song name\">\n");
        out.write("\t\t\t        \t\t<button type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
        out.write("\t\t\t        \t</div>\n");
        out.write("\t\t        \t</form>\n");
        out.write("\t        \t\n");
        out.write("\t        \t\t<form method=\"post\" action=\"ArtistSearcher\">\n");
        out.write("\t\t        \t\t<div class=\"col-md-3 form-group\">\n");
        out.write("\t\t\t    \t\t\t<label for=\"Artist name\">Search for artist</label>\n");
        out.write("\t\t\t    \t\t\t<input type=\"text\" class=\"form-control\" name=\"Artist name\" placeholder=\"Artist name\">\n");
        out.write("\t\t\t        \t\t<button type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
        out.write("\t\t\t        \t</div>\n");
        out.write("\t\t        \t</form>\n");
        out.write("\t        \t\n");
        out.write("\t\t        \t<form method=\"post\" action=\"AlbumSearcher\">\n");
        out.write("\t\t        \t\t<div class=\"col-md-3 form-group\">\n");
        out.write("\t\t\t    \t\t\t<label for=\"Album name\">Search for artist</label>\n");
        out.write("\t\t\t    \t\t\t<input type=\"text\" class=\"form-control\" name=\"Album name\" placeholder=\"Album name\">\n");
        out.write("\t\t\t        \t\t<button type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
        out.write("\t\t\t        \t</div>\n");
        out.write("\t\t        \t</form>\n");
        out.write("\t\t        </div>\n");
        out.write("\t       </div>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /index.jsp(57,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sandstorm}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<h3><font color=\"#BCB028\">Your playlist has been successfully \n");
        out.write("\t\t\tsandstormed! Would you like to:</font></h3>\n");
        out.write("\t\t\t<table>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<form method=\"post\" action=\"ExportToSpotify\">\n");
        out.write("\t\t\t\t\t\t\t<button type=\"submit\"><font color=\"#BCB028\">Add this playlist to \n");
        out.write("\t\t\t\t\t\t\tyour Spotify account</font></button>\n");
        out.write("\t\t\t\t\t\t</form>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td><font color=\"#BCB028\">or</font></td>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<form method=\"post\" action=\"StartOver\">\n");
        out.write("\t\t\t\t\t\t\t<button type=\"submit\"><font color=\"#BCB028\">Start a new playlist</font></button>\n");
        out.write("\t\t\t\t\t\t</form>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t\t\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
