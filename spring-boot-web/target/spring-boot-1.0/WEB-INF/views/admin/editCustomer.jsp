<%--
  Created by IntelliJ IDEA.
  User: cuncon
  Date: 12/14/2020
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="http://localhost:8080/admin/edit"/>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Edit Custormer</title>
</head>
<body>
<!-- PAGE CONTENT BEGINS -->
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
                <li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
                </li>
                <li class="active">EditCustomer</li>
            </ul>
            <!-- /.breadcrumb -->


        </div>

        <div class="page-content">

            <form:form commandName="modelSearch" action="http://localhost:8080/admin/editCustomer"
                       id="listForm2" method="GET">

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"
                           for="fullname"> Tên Khách hàng </label>
                    <div class="col-sm-9">
                        <input type="text" id="fullname" class="form-control" name="fullname"
                               value="${findoneCustomer.fullname}"/>
                        <input type="hidden" id="id"
                               name="id" class="form-control" value="${findoneCustomer.id}"/>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"
                           for="phone"> Số ĐT</label>
                    <div class="col-sm-9">
                        <input type="text" id="phone"
                               name="phone" class="form-control" value="${findoneCustomer.phone}"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"
                           for="email"> Email</label>
                    <div class="col-sm-9">
                        <input type="text" id="email"
                               name="email" class="form-control" value="${findoneCustomer.email}"/>
                    </div>
                </div>


                <div class="form-group">
                    <div class="col-sm-12">
                        <c:if test="${not empty findoneCustomer.id}">
                            <input type="button" class="btn btn-white btn-warning btn-bold" value="Cập nhật thông tin Khách" id="btnUpdateCustomer"/>
                        </c:if>
                        <c:if test="${empty findoneCustomer.id}">
                            <input type="button" class="btn btn-white btn-warning btn-bold" value="Thêm khách hàng" id="btnInsertCustomer"/>
                        </c:if>
                    </div>
                </div>




             <%--   <div class="row">
                    <div class="col-xs-12">
                        <button type="button" class="btn btn-primary" id="btnthemtoanhaspringform">Cập nhật thông tin khách hàng
                        </button>
                    </div>
                </div>
                <br>

                <div class="row">
                    <div class="col-xs-12">
                        <button type="button" class="btn btn-primary" id="btnThemToaNha">Thêm khách hàng API
                        </button>
                    </div>
                </div>--%>


            </form:form>


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




    $('#btnUpdateCustomer').click(
        function (e) {
            var data = {};
            data['fullname'] = $('#fullname').val();
            data['phone'] = $('#phone').val();
            data['email'] = $('#email').val();
            data['id'] = $('#id').val();
            updateCustomer(data);
        });






    $('#btnInsertCustomer').click(function (e) {
        e.preventDefault();
        var data = {};
        data['fullname'] = $('#fullname').val();
        data['phone'] = $('#phone').val();
        data['email'] = $('#email').val();

        InsertBuilding(data);

    });


    function updateCustomer(data) {
        $.ajax({
            type: "PUT",
            //				url : "http://192.168.1.3:8080/spring/api/new",
            // url: "http://10.5.2.227:8080/spring/api/new",
            // url: "http://10.5.2.228:8080/spring/api/new",
            url: "http://localhost:8080/api/customer",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "http://localhost:8080/admin/customer";
            },
            error: function (response) {
                console.log('failed');
                window.location.href = "http://localhost:8080/admin/customer";
                console.log(response);
            }
        });

    }


    function InsertBuilding(data) {
        $.ajax({
            type: "POST",
            //				url : "http://192.168.1.3:8080/spring/api/new",
            // url: "http://10.5.2.227:8080/spring/api/new",
            // url: "http://10.5.2.228:8080/spring/api/new",
            url: "http://localhost:8080/api/customer",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "http://localhost:8080/admin/customer";
            },
            error: function (response) {
                console.log('failed');
                window.location.href = "http://localhost:8080/admin/customer";
                console.log(response);
            }
        });

    }



</script>


</body>
</html>
