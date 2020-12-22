<%--
  Created by IntelliJ IDEA.
  User: cuncon
  Date: 12/18/2020
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="/admin/edit"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>useredit</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try {
                    ace.settings.check('breadcrumbs', 'fixed')
                } catch (e) {
                }
            </script>

            <ul class="breadcrumb">
                <li><i class="ace-icon fa fa-home home-icon"></i> <a href="/admin/list">Home</a>
                </li>
                <li class="active"><a href="/admin/listuser">EditUser</a></li>
            </ul>
            <!-- /.breadcrumb -->


        </div>

        <div class="page-content">
            <form id="formEditUser">
                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="userName"> Tên đăng nhập</label>
                        <div class="col-sm-9">
                            <input type="text" id="userName" class="form-control" name="userName"
                                   value="${modelbyId.userName}"/>
                            <input type="hidden" id="id" class="form-control" name="id"
                                   value="${modelbyId.id}"/>
                        </div>
                    </div>
                </div>

                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="fullName"> fullname</label>
                        <div class="col-sm-9">
                            <input type="text" id="fullName"
                                   name="fullName" class="form-control" value="${modelbyId.fullName}"/>
                        </div>
                    </div>
                </div>

                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="phone"> phone</label>
                        <div class="col-sm-9">
                            <input type="text" id="phone"
                                   name="phone" class="form-control" value="${modelbyId.phone}"/>
                        </div>
                    </div>
                </div>

                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="email"> email</label>
                        <div class="col-sm-9">
                            <input type="text" id="email"
                                   name="email" class="form-control" value="${modelbyId.email}"/>
                        </div>
                    </div>
                </div>

                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="status"> status</label>
                        <div class="col-sm-9">
                            <input type="number" id="status"
                                   name="status" class="form-control"
                                   value="${modelbyId.status}"/>
                        </div>
                    </div>
                </div>

                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="password">password</label>
                        <div class="col-sm-9">
                            <input type="text" id="password"
                                   name="password" class="form-control"
                                   value="${modelbyId.password}"/>
                        </div>
                    </div>
                </div>
                <br>


                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="form-field-1"> Phân Quyền </label>
                        <div class="col-sm-9" id="form-field-1" id="">
                            <div class="checkbox" id="listChecbox" , name="listChecbox">
                                <c:forEach var="item" items="${role}">

                                    <label>
                                        <input name="type" type="checkbox" class="ace"
                                               value="${item.id}"
                                                <c:forEach var="user_roleByIditem" items="${user_roleById}">
                                                    <c:if test="${item.id == user_roleByIditem.role_id}">
                                                        checked
                                                    </c:if>
                                                </c:forEach>
                                        />
                                        <span class="lbl">${item.code}</span>
                                            <%-- <input type="hidden" name="type" value="${item.codeBuildingType}">--%>
                                    </label>
                                </c:forEach>
                            </div>

                        </div>
                    </div>
                </div>


                <br>
                <div class="row">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="form-field-122"> </label>
                        <div class="col-sm-9" id="form-field-122">
                            <c:if test="${ modelbyId.id != null}">
                                <input type="button" class="btn btn-primary"
                                       value="Cập nhật thông tin user" id="btnUpdateUser"/>
                            </c:if>
                            <c:if test="${modelbyId.id==null}">
                                <input type="button" class="btn btn-primary" value="Thêm user"
                                       id="btnUpdateUser"/>
                            </c:if>

                        </div>
                    </div>
                </div>
            </form>
        </div>
        <!-- /.page-content -->
    </div>

</div>

<!-- /.main-content -->


<%-- 	<%@ include file="/common/admin/footer.jsp"%> --%>

<a href="#" id="btn-scroll-up"
   class="btn-scroll-up btn btn-sm btn-inverse"> <i
        class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
</a>


<!-- page specific plugin scripts -->

<%-- 	<script src="<c:url value='/template/admin/assets/js/jquery.mobile.custom.min.js'/>"></script>	 --%>


<script>


    $('#btnUpdateUser').click(function () {
        var data = {};
        var listcheckbok = [];
        var formData = $('#formEditUser').serializeArray();
        $.each(formData, function (index, v) {
            if (v.name == 'listChecbox') {
                listcheckbok.push(v.value);
            } else {
                data["" + v.name + ""] = v.value;
            }

        });

        data['listRole'] = listcheckbok;

        $.ajax({

            type: "POST",
            url: "/api/user",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "/admin/listuser";

            },
            error: function (response) {
                console.log('failed');
                console.log(response);
                window.location.href = "/admin/listuser";
            }
        });
    });


</script>


</body>
</html>
