/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-01-05 05:02:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1483591471492L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-jstl-1.2.jar", Long.valueOf(1483592186825L));
    _jspx_dependants.put("jar:file:/E:/HotelScanner/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hotelScanner/WEB-INF/lib/jstl-jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />       \r\n");
      out.write("        <title>jQuery UI</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.jsdelivr.net/bootstrap/3.3.2/css/bootstrap.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\"/>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("         <!-- datepicker 한국어로 -->\r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/i18n/datepicker-ko.js\"></script>\r\n");
      out.write("        <style> <!-- css file -->\r\n");
      out.write("          div #fromDate, #toDate {\r\n");
      out.write("          \twidth: 200px;\r\n");
      out.write("          }\r\n");
      out.write("          div#checkCal_fDate {\r\n");
      out.write("          \tfloat: left;\r\n");
      out.write("          \tposition: relative;\r\n");
      out.write("\r\n");
      out.write("          }\r\n");
      out.write("          div#checkCal_tDate {\r\n");
      out.write("          \tfloat: left;\r\n");
      out.write("          \tposition: relative;\r\n");
      out.write("          \tleft: 10px;\r\n");
      out.write("          }\r\n");
      out.write("        </style> \r\n");
      out.write("        <script> <!-- js file-->\r\n");
      out.write("            $(function() {\r\n");
      out.write("            \tvar fromDate = document.getElementById(\"fromDate\");\r\n");
      out.write("            \tvar toDate = document.getElementById(\"toDate\");\r\n");
      out.write("                //오늘 날짜를 출력\r\n");
      out.write("                $(\"#today\").text(new Date().toLocaleDateString());\r\n");
      out.write("                $.datepicker.regional['ko']= {\r\n");
      out.write("                        closeText:'닫기',\r\n");
      out.write("                        prevText:'이전달',\r\n");
      out.write("                        nextText:'다음달',\r\n");
      out.write("                        currentText:'오늘',\r\n");
      out.write("                        monthNames:['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],\r\n");
      out.write("                        monthNamesShort:['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],\r\n");
      out.write("                        dayNames:['일','월','화','수','목','금','토'],\r\n");
      out.write("                        dayNamesShort:['일','월','화','수','목','금','토'],\r\n");
      out.write("                        dayNamesMin:['일','월','화','수','목','금','토']};\r\n");
      out.write("                //datepicker 한국어로 사용하기 위한 언어설정\r\n");
      out.write("                $.datepicker.setDefaults($.datepicker.regional['ko']); \r\n");
      out.write("                // 시작일(fromDate)은 종료일(toDate) 이후 날짜 선택 불가\r\n");
      out.write("                // 종료일(toDate)은 시작일(fromDate) 이전 날짜 선택 불가\r\n");
      out.write("                //시작일.\r\n");
      out.write("                $('#fromDate').datepicker({\r\n");
      out.write("                    dateFormat: \"yy-mm-dd\", // 날짜의 형식\r\n");
      out.write("                    minDate: 0,  // 선택할수있는 최소날짜, ( 0 : 오늘 이전 날짜 선택 불가)\r\n");
      out.write("                    onClose: function( selectedDate ) {    \r\n");
      out.write("                        // 시작일(fromDate) datepicker가 닫힐때\r\n");
      out.write("                        // 종료일(toDate)의 선택할수있는 최소 날짜(minDate)를 선택한 시작일로 지정        \t\r\n");
      out.write("                        \tif(isNull(toDate.value)){\r\n");
      out.write("                        \t\t$('#toDate').datepicker( \"option\", \"minDate\", selectedDate );\r\n");
      out.write("                        \t\t$('#toDate').focus();\t\r\n");
      out.write("                        \t} else \r\n");
      out.write("                        \t\t$('#toDate').datepicker( \"option\", \"minDate\", selectedDate ); \r\n");
      out.write("                        \t\t\t\r\n");
      out.write("                    }                \r\n");
      out.write("                });\r\n");
      out.write("                //종료일\r\n");
      out.write("                $('#toDate').datepicker({\r\n");
      out.write("                    dateFormat: \"yy-mm-dd\",\r\n");
      out.write("                    minDate: 0, // 오늘 이전 날짜 선택 불가\r\n");
      out.write("                    onClose: function( selectedDate ) { // 종료일(toDate) datepicker가 닫힐때\r\n");
      out.write("                   \t if(isNull(fromDate.value)){\r\n");
      out.write("            \t        \t$('#fromDate').datepicker( \"option\", \"maxDate\", selectedDate );\r\n");
      out.write("           \t\t         \t$('#fromDate').focus();\r\n");
      out.write("            \t        } else\r\n");
      out.write("                    \t \t// 시작일(fromDate)의 선택할수있는 최대 날짜(maxDate)를 선택한 종료일로 지정 \r\n");
      out.write("                 \t      \t$('#fromDate').datepicker( \"option\", \"maxDate\", selectedDate );\r\n");
      out.write("                    }                \r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("            function isNull(obj) {\r\n");
      out.write("            \treturn (typeof obj != \"undefined\" && obj != null && obj != \"\") ? false : true;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\"> \r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script> \r\n");
      out.write("<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/hotelScanner/resources/css/stlye.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/hotelScanner/resources/css/Custom.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   div#header_mainlogo {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop: -20px;\r\n");
      out.write("\t\tmargin-top: 0px;\r\n");
      out.write("   }\r\n");
      out.write("   nav#top_navbar {\r\n");
      out.write("   margin-left: 0px;\r\n");
      out.write("   margin-right: 0px;\r\n");
      out.write("   border-radius: 0px;\r\n");
      out.write("   \tbackground-color: white;\r\n");
      out.write("   }\r\n");
      out.write("   div img#mainlogo_img {\r\n");
      out.write("   \t  position: relative;\r\n");
      out.write("   \t  top: -40px;\r\n");
      out.write("   \t  left: -30px;\r\n");
      out.write("      width: 300px;\r\n");
      out.write("      height: 100px;\r\n");
      out.write("   }\r\n");
      out.write("   div#main_topmenu_back {\r\n");
      out.write("   \t  float: right;\r\n");
      out.write("   \t  margin: 0 10px 0 0;\r\n");
      out.write("   }\r\n");
      out.write("   div#main_topmenu_back ul li {\r\n");
      out.write("   \t  float: left;\r\n");
      out.write("   \t  padding: 0 10px 0 0;\r\n");
      out.write("      list-style: none;\r\n");
      out.write("   }\r\n");
      out.write("   div#main_topmenu_back ul li a{\r\n");
      out.write("   \t  \r\n");
      out.write("   \t  text-decoration : none;\r\n");
      out.write("   }\r\n");
      out.write("   .clear {\r\n");
      out.write("   \t  clear: both;\r\n");
      out.write("   }\r\n");
      out.write("   ul.menu { margin: 0px auto 0 auto; }\r\n");
      out.write("</style> \r\n");
      out.write("<body>\r\n");
      out.write("   <header>\r\n");
      out.write("      <nav id=\"top_navbar\" class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("     <div class=\"container-fluid\">\r\n");
      out.write("<!--header section -->\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("               <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("               <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("               <span class=\"icon-bar\"></span>\r\n");
      out.write("               <span class=\"icon-bar\"></span>\r\n");
      out.write("               <span class=\"icon-bar\"></span>\r\n");
      out.write("               </button>\r\n");
      out.write("               <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("               \t\t<img  id=\"mainlogo_img\" src=\"/hotelScanner/resources/images/main_logo.png\" alt=\"Home Logo\">\r\n");
      out.write("               </a>\r\n");
      out.write("          </div>\r\n");
      out.write("<!-- menu section -->\r\n");
      out.write("          <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("               <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("               <li><a href=\"# \">공지사항</a></li>\r\n");
      out.write("               <li><a href=\"# \">로그인</a></li>\r\n");
      out.write("               <li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("               <li><a href=\"#\">사업자등록</a></li>\r\n");
      out.write("               </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("     </div>\r\n");
      out.write("</nav>\r\n");
      out.write("   </header>   \r\n");
      out.write("</body>\r\n");
      out.write("</header>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    <!-- calendar -->\r\n");
      out.write("\t\t\t<div id=\"checkCal_fDate\" class=\"form-group has-feedback has-feedback-left\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"fromDate\">체크인 </label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"fromDate\" id=\"fromDate\" />\r\n");
      out.write("\t\t\t\t<i class=\"form-control-feedback glyphicon glyphicon-calendar\" ></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"checkCal_tDate\" class=\"form-group has-feedback has-feedback-right\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label\" for=\"toDate\">체크아웃 </label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"toDate\" id=\"toDate\" />\r\n");
      out.write("\t\t\t\t<i class=\"form-control-feedback glyphicon glyphicon-calendar\" ></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("    </body>\r\n");
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
