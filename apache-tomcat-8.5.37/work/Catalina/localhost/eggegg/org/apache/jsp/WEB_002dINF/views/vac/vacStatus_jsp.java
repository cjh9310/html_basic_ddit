/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-01-25 06:29:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vac;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vacStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ cPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ cPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/list.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ cPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/status.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("\t\t<span id=\"title\">휴가현황</span>\r\n");
      out.write("\t\t<hr color=\"#F1F4FF\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"main-table\">\r\n");
      out.write("\t\t<p id=\"statusTitle\">휴가현황</p>\r\n");
      out.write("\t\t<table id=\"list-table\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>휴가코드</th>\r\n");
      out.write("\t\t\t\t\t<th>휴가일자</th>\r\n");
      out.write("\t\t\t\t\t<th>사번</th>\r\n");
      out.write("\t\t\t\t\t<th>사원명</th>\r\n");
      out.write("\t\t\t\t\t<th>부서명</th>\r\n");
      out.write("\t\t\t\t\t<th>직위/직급</th>\r\n");
      out.write("\t\t\t\t\t<th>휴가구분</th>\r\n");
      out.write("\t\t\t\t\t<th>휴가일수</th>\r\n");
      out.write("\t\t\t\t\t<th>적요</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody></tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"bottom\">\r\n");
      out.write("\t\t<hr color=\"#F1F4FF\">\r\n");
      out.write("\t\t<input type=\"button\" id=\"excel\" value=\"Excel다운로드\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form id=\"searchForm\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div id=\"background\"></div>\r\n");
      out.write("<input type=\"hidden\" id=\"code\">\r\n");
      out.write("<input type=\"hidden\" id=\"nm\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ cPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/paging.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ cPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.form.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//검색 초기화\r\n");
      out.write("\t\t$(document).ajaxComplete(function(event, xhr, options){\r\n");
      out.write("\t\t\tvar vacstusCount = 0;\r\n");
      out.write("\t\t\t$(\".vacstusCount\").each(function(){\r\n");
      out.write("\t\t\t\tvacstusCount += parseInt($(this).html());\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\".sum\").html(vacstusCount);\r\n");
      out.write("\t\t\tsearchForm.get(0).reset();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tlet tbody = $(\"#list-table tbody\");\r\n");
      out.write("\t\tlet searchForm = $(\"#searchForm\").paging().ajaxForm({\r\n");
      out.write("\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ cPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/vac/vacStatus.do\",\r\n");
      out.write("\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\tsuccess: function(pagingVO){\r\n");
      out.write("\t\t\t\ttbody.empty();\r\n");
      out.write("\t\t\t\tlet vacStusList = pagingVO.dataList;\r\n");
      out.write("\t\t\t\tlet trTags = [];\r\n");
      out.write("\t\t\t\tif(vacStusList.length > 0){\r\n");
      out.write("\t\t\t\t\t$(vacStusList).each(function(idx, vacStus){\r\n");
      out.write("\t\t\t\t\t\ttrTags.push(\r\n");
      out.write("\t\t\t\t\t\t\t$(\"<tr>\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.vacstusCode),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.vacstusPeriod),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.emplNo),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.empl.emplNm),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.empl.dept.deptNm),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.empl.position.pstNm),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.vacation.vcatnNm),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td class='vacstusCount'>\").html(vacStus.vacstusCount),\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<td>\").html(vacStus.vacstusSumry)\r\n");
      out.write("\t\t\t\t\t\t\t)\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\ttrTags.push(\r\n");
      out.write("\t\t\t\t\t\t$(\"<tr>\").append(\r\n");
      out.write("\t\t\t\t\t\t\t$(\"<td>\").html(\"합계\").attr(\"colspan\", \"7\"),\r\n");
      out.write("\t\t\t\t\t\t\t$(\"<td class='sum'>\").html(\"&ensp;\"),\r\n");
      out.write("\t\t\t\t\t\t\t$(\"<td>\").html(\"&ensp;\")\r\n");
      out.write("\t\t\t\t\t\t).css(\"background\", \"#FCFCFE\")\r\n");
      out.write("\t\t\t\t\t)\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\ttrTags.push(\r\n");
      out.write("\t\t\t\t\t\t$(\"<tr>\").append(\r\n");
      out.write("\t\t\t\t\t\t\t$(\"<td>\").attr(\"colspan\", \"9\").html(\"조건에 맞는 휴가신청내역이 없습니다.\")\r\n");
      out.write("\t\t\t\t\t\t)\r\n");
      out.write("\t\t\t\t\t)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\ttbody.append(trTags);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(xhr){\r\n");
      out.write("\t\t\t\talert(xhr.status);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).submit();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}