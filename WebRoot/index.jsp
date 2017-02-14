<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>首页 - 物流管理系统</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<style media="all" type="text/css">@import "style/all.css";</style>
</head>
<body>
<div id="main">
	<div id="header">
		<a href="index.html" class="logo"><img src="style/img/logo.gif" width="200" height="29" alt="" /></a>
		<ul id="top-navigation">
			<li class="active"><span><span>首页</span></span></li>
			<li><span><span><a href="cus_server/index.html">客户服务中心</a></span></span></li>
			<li><span><span><a href="sch_hub/index.jsp">调度中心</a></span></span></li>
			<li><span><span><a href="sub_dept/index.html">分站管理</a></span></span></li>
			<li><span><span><a href="depot_manage/index.html">库房管理</a></span></span></li>
			<li><span><span><a href="dist_hub/index.html">配送中心</a></span></span></li>
			<li><span><span><a href="finance_manage/index.html">财务管理</a></span></span></li>
		</ul>
		<div id="operator"class="active">操作员&nbsp;<span>admin</span>&nbsp;<a href="#">退出</a></div>
	</div>
	<div id="middle" style="text-align: center;">
		<img src="style/img/home.gif" border="0" usemap="#Map" style="margin: 0;padding: 0;border: 0;"/>
		<map name="Map" id="Map">
			<area title="配送中心" shape="circle" coords="380,274,28" href="dist_hub/index.html" />
			<area title="客户服务中心" shape="rect" coords="238,136,290,188" href="cus_server/index.html" />
			<area title="调度中心" shape="rect" coords="198,298,248,356" href="sch_hub/index.html" />
			<area title="分站管理" shape="poly" coords="377,398,354,419,354,455,400,455,401,419" href="sub_dept/index.html" />
			<area title="库房管理" shape="poly" coords="494,136,466,146,466,178,493,191,520,180,521,147" href="depot_manage/index.html" />
			<area title="财务管理" shape="poly" coords="530,298,567,297,564,346,514,363,504,327,529,321" href="finance_manage/index.html" />
		</map>
	</div>
	<div id="footer"></div>
</div>
<div id="copyright">Copyright &copy;2009 长沙牛耳第二小组</div>
</body>
</html>
