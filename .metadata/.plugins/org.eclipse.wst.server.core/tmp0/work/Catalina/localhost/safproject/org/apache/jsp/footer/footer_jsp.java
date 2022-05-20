/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-19 15:24:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.footer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/footer.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <footer class=\"footer-container\" style=\"background-color: #F9F9F9; color: #BDBDBD\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("                <div class=\"row footer-detail\">\r\n");
      out.write("                    <div class=\"col content-1\">\r\n");
      out.write("                        <p class=\"content-detail\">\r\n");
      out.write("                            <span class=\"content-detail-1 font-weight-bold\">(사)애니멀스트릿파인더</span>\r\n");
      out.write("                            <span class=\"content-detail-1\">서울특별시 강남구 테헤란로 146 (우)06236</span>\r\n");
      out.write("                            <span class>대표 : 일조가일냈조</span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"content-detail\">\r\n");
      out.write("                    <span class=\"content-detail-1\">\r\n");
      out.write("                        GITHUB: \r\n");
      out.write("                        <a href=\"https://github.com/1jomadeit/teamproject\" style=\"color: #BDBDBD\">https://github.com/1jomadeit/teamproject</a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"content-detail-1\">\r\n");
      out.write("                        TEL:\r\n");
      out.write("                        <a href=\"tel:1588-5890\" style=\"color: #BDBDBD\">tel:1588-5890</a>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class>사업자등록번호: 아직없음</span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"content-detail\">COPYRIGHT 2022 STREET ANIMAL FINDER</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col content-2\">\r\n");
      out.write("                    <p class=\"content-detail-2 text-right\">\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/instagram.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/youtube.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/facebook.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/twitter.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/blog.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/kakaostory.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a target=\"_blink\" href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/footer/image/happybean.png\" class=\"img-box\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"content-detail-2\">\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a href=\"#!\" class=\"content-underline\" style=\"color: #BDBDBD\">이용약관</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-2\">\r\n");
      out.write("                            <a href=\"#!\" class=\"content-underline\" style=\"color: #BDBDBD\">개인정보처리방침</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span class=\"content-detail-1\">\r\n");
      out.write("                            <a href=\"#!\" class=\"content-underline\" style=\"color: #BDBDBD\">이메일수집거부</a>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </footer>\r\n");
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