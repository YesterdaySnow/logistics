<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>手动调度 - 物流管理系统</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<link href="<%=basePath +  "style/all.css"%>" rel="stylesheet"/>
	<link href="<%=basePath +  "style/jquery/ui.all.css"%>" rel="stylesheet"/>
	<script type="text/javascript" src="<%=basePath +  "script/jquery-1.3.2.min.js"%>"></script>
	<script type="text/javascript" src="<%=basePath +  "script/jquery-ui-personalized-1.6rc6.min.js"%>"></script>
	<script type="text/javascript" src="<%=basePath +  "script/date.js"%>"></script>
	<script type="text/javascript" src="<%=basePath +  "script/common.js"%>"></script>
	<script type="text/javascript">
		$(function(){
			datepicker('.date-two');
		});
	</script>
</head>
<body style="background: none">
	<div class="top-bar">
		<h1>手动调度</h1>
		<div class="breadcrumbs">
			<div class="button-bar">
				<input type="button" name="Submit" value="帮助" class="button" onclick="help('物流管理系统')"/>
				<input type="button" name="Submit" value="查询" class="button"/>
			</div>
			<a href="../../index.html" target="_top">首页</a> 
			<a href="../index.html" target="_top">调度中心</a>
		</div>
	</div>
		  <div class="select-bar">
			<table class="select-table">
				<tr>
					<th>期望投递日期</th>
					<td style="white-space:nowrap"><input type='text' style='width:75px' class="date-two text" name='' readonly/>to<input type='text' style='width:75px' class="date-two text" name='' readonly/></td>
					<th>订单类型</th>
					<td>
			     <select style='width:auto'>
				  <option>全部</option>
				  <option>新订</option>
				  <option>换货</option>
				  <option>退货</option>
				  <option>退订</option>
				  <option>货到付款</option>
				  <option>上门收费</option>
				</select></td>
				</tr>
			</table>
		  </div>
		  <div align='right'>

			<input type="button" name="Submit" value="手动调度" onclick="checkType('manualAction!query.action');" class="button"/>			
		  <strong><input type="checkbox" name="myname" onclick="mycheckall()">全选 </strong> &nbsp; &nbsp;
		</div>
			<div class="table">
				<img src="../../style/img/bg-th-left.gif" width="8" height="7" alt="" class="left" />
				<img src="../../style/img/bg-th-right.gif" width="7" height="7" alt="" class="right" />
			<form action='' method='post' name='formTable'>
				<table class="listing" cellpadding="0" cellspacing="0">
				
			<tr>
				<th class="first">订单号</th>
				<th>客户</th>
				<th>订单产生日期</th>
				<th>期望投递日期</th>
				<th>订单类型</th>
				<th >订单状态</th>
				<th>投递地址</th>
				<th class="last">操作</th>
			</tr>
			<s:iterator value="page.orderforms">
				<tr class="bg">
					<td><s:property value="orderid" /></td>
					<td><s:property value="customer.name" /></td>
					<td><s:property value="createdate" /></td>
					<td><s:property value="completedate" /></td>
					<td><s:property value="ordertype" /></td>
					<td><s:property value="state" /></td>
					<td><s:property value="deliveradress" /></td>
					<td id='td-list'>
					
					<input type="hidden" id="a<s:property value="orderid" />" value="<s:property value="state" />"/>
					
					<input type="checkbox" name="state" value="<s:property value="orderid" />">
					
					<img onclick="to('linkman.html');" title="订单详情" src="../../style/img/detail-ico.png"  />
					</td>
				</tr>
			</s:iterator>
		</table>
		</form>
		<div class='pager'>
			<a href="queryOrderform?pageSize=3&iCurrPageNo=1">第一页</a>
			<a href="queryOrderform?pageSize=3&iCurrPageNo=${page.iCurrPageNo - 1}">上一页</a>
			<a href="queryOrderform?pageSize=3&iCurrPageNo=${page.iCurrPageNo + 1}">下一页</a>
			<a href="queryOrderform?pageSize=3&iCurrPageNo=${page.pageCount}">最后一页</a>
        </div>
	</div>
</body>
</html>
