<%--
  Created by IntelliJ IDEA.
  User: cuncon
  Date: 12/18/2020
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="/admin/edit"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>User</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="/admin/listuser">User</a>
                </li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="widget-box">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="widget-header">
                            <h4 class="widget-title">Tìm Kiếm</h4>

                            <div class="widget-toolbar">
                                <a href="#" data-action="collapse"> <i
                                        class="ace-icon fa fa-chevron-up"></i>
                                </a>
                            </div>
                        </div>

                        <div class="widget-body">
                            <div class="widget-main">

                                <form:form commandName="modelSearch" action="/admin/listuser"
                                           id="listForm" method="GET">
                                    <div class="row">

                                        <div class="col-sm-6">


                                            <div>
                                                <label for="name">Tài khoản đăng nhập</label> <input
                                                    type="text" id="name" name="name"
                                                    class="form-control" value="${modelSearch.userName}"/>
                                            </div>

                                        </div>

                                        <div class="col-sm-6">
                                            <div>
                                                <label for="floorarea">Tên nhân viên</label> <input
                                                    type="number" id="floorarea" name="floorarea"
                                                    value="${modelSearch.fullName}" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-sm-4">
                                            <div>
                                                <label for="phone">phone</label> <input
                                                    type="text" id="phone" name="phone" value="${modelSearch.phone}"
                                                    class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="status">status</label> <input
                                                    type="number" id="status" name="status"
                                                    value="${modelSearch.status}"
                                                    class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div>
                                                <label for="email">email</label> <input
                                                    type="text" id="email" name="email" value="${modelSearch.email}"
                                                    class="form-control"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-xs-12">
                                            <button type="button" class="btn btn-primary" id="btnSearch">Tìm kIếm
                                            </button>
                                        </div>
                                    </div>


                                </form:form>


                            </div>

                        </div>
                    </div>
                </div>
                <!-- PAGE CONTENT ENDS -->
            </div>


            <div class="row">
                <!-- dung 2 nút phía bên phải -->
                <div class="btn-group pull-right">

                    <a flag="info"
                       class="dt-buttons buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                       title='thêm user' href="/admin/edituser">
						<span>
							<i class="fa fa-plus-circle bigger-110 purple"></i>
						</span>
                    </a>


                    <button class="btn btn-white btn-info btn-bold"
                            data-toggle="tooltip" title="Xóa user" id="btnDeleteUser">
                        <i class="fa fa-trash"></i>
                    </button>
                </div>
            </div>
            <br/>


            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">

                        <table class="table table-bordered" id="staffList2">
                            <thead>
                            <tr>
                                <th><input type="checkbox" id="checkAll"></th>
                                <th>Tài khoản</th>
                                <th>Tên</th>
                                <th>email</th>
                                <th>status</th>
                                <th>thao tác</th>

                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="item" items="${model}" varStatus="loop">

                                <tr>
                                    <td><input type="checkbox" id="checkbox_${item.id}"
                                               value="${item.id}">

                                    <td>${item.userName}</td>
                                    <td>${item.fullName}</td>
                                    <td>${item.email}</td>
                                    <td>${item.status}</td>


                                    <td>

                                        <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
                                           title='chinhr sửa nhân viên'
                                           href="/admin/edituser?id=${item.id}"><i
                                                class="fa fa-pencil-square-o">
                                        </i>
                                        </a>


                                    </td>

                                </tr>

                            </c:forEach>
                            <%--  </form:form>--%>
                            </tbody>
                        </table>

                    </div>
                </div>
            </div>


        </div>
    </div>
</div><!-- /.main-content -->


<script>

    if ("${status}" == "capnhatok") {

        alert("Cập nhật tòa nhà thành công");
    }

    if ("${status}" == "giaook") {

        alert("Giao tòa nhà thành công");
    }

    if ("${status}" == "insertok") {

        alert("Thêm tòa nhà thành công");
    }

</script>
</body>
</html>
