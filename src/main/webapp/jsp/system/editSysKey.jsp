<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
	$(function() {
		parent.$.messager.progress('close');
		$('#form').form({
			url : '${pageContext.request.contextPath}/sysKeyController/modifysyskey.html',
			onSubmit : function() {
				parent.$.messager.progress({
					title : '提示',
					text : '数据处理中，请稍后....'
				});
				var isValid = $(this).form('validate');
				if (!isValid) {
					parent.$.messager.progress('close');
				}
				return isValid;
			},
			success : function(result) {
				parent.$.messager.progress('close');
				result = $.parseJSON(result);
				if (result.success) {
					parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
					parent.$.modalDialog.handler.dialog('close');
				} else {
					parent.$.messager.alert('错误', result.msg, 'error');
				}
			}
		});
	});
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',border:false" title="" style="overflow: hidden;">
		<form id="form" method="post">
		<input type="hidden" id="id" name="id" value="${sysClass.id}">
			<table class="table table-hover table-condensed">
				<tr>
					<th>系统术语：</th>
					<td><input name="keyName" type="text" placeholder="请输入系统术语" class="easyui-validatebox span4" readonly="readonly"  value="${sysKey.keyName}" data-options="required:true" value=""></td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>可选项：</th>
					<td><textarea name=keyValue id="keyValue" placeholder="请输入可选项" class="easyui-validatebox span4" data-options="required:true" rows="15" cols="55" class="text">${sysKey.keyValue}</textarea>
					</td>
					<th></th>
					<td></td>
				</tr>
			</table>
		</form>
	</div>
</div>