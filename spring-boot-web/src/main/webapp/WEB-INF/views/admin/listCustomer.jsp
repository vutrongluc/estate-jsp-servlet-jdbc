<%--
  Created by IntelliJ IDEA.
  User: ADP_TOMS
  Date: 12/10/2020
  Time: 8:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="http://localhost:8080/admin/edit"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Khách hàng</title>
</head>
<body>

<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Khách Hàng</a>
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

                                <form:form commandName="modelSearchcus"
                                           action="http://localhost:8080/admin/listserchcustomer"
                                           id="listForm" method="GET">
                                    <div class="row">

                                        <div class="col-sm-4">


                                            <div>
                                                <label for="fullname">Tên Khách Hàng</label> <input
                                                    type="text" id="fullname" name="fullname"
                                                    class="form-control" value="${modelSearchcus.fullname}"/>
                                            </div>

                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="phone">Số Điện thoại</label> <input
                                                    type="text" id="phone" name="phone"
                                                    value="${modelSearchcus.phone}" class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="email">Email</label> <input
                                                    type="text" id="email" name="email"
                                                    value="${modelSearchcus.email}" class="form-control"/>
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


                    <c:url var="createNewURL" value="/admin/edit"/>

                    <c:url var="timkiem" value="/admin/edit">
                        <c:param name="ten"
                                 value="$(name2222).val()"/>  <%--${name2222.value}--    ${name2222.value}--%>
                    </c:url>


                    <a flag="info"
                       class="dt-buttons buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                       title='Thêm Khách Hàng' href="http://localhost:8080/admin/editCustomer">
						<span>
							<i class="fa fa-plus-circle bigger-110 purple"></i>
						</span>
                    </a>


                    <button class="btn btn-white btn-info btn-bold"
                            data-toggle="tooltip" title="Xóa Khách hàng" id="btnDeleteKhachHang">
                        <i class="fa fa-trash"></i>
                    </button>
                </div>
            </div>
            <br/>


            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">

                        <table class="table table-bordered" id="ListCustomer">
                            <thead>
                            <tr>
                                <th><input type="checkbox" id="checkAll"></th>
                                <th>Tên Khách Hàng</th>
                                <th>Email</th>
                                <th>Số ĐT</th>
                                <th>Thao tác</th>

                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="item" items="${model}">
                                <tr>
                                    <td><input type="checkbox" id="checkbox_${item.id}"
                                               value="${item.id}"> <%--<input type="hidden" name="buildingId"
                                                                            value="${item.fullname}">--%></td>

                                    <td>${item.fullname}</td>
                                    <td>${item.email}</td>
                                    <td>${item.phone}</td>

                                    <td>
                                        <button class="btn btn-sm btn-primary btn-edit"
                                                data-toggle="tooltip" title="Cập nhật thông tin"
                                                onclick="UpdateInfoEmployee(${item.id})" value="${item}"
                                                id="bnt_${item.id}">
                                            <i class="ace-icon fa fa-pencil bigger-120"></i>
                                        </button>

                                        <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
                                           title='cập nhật nhan vien nhay trang 2'
                                           href="http://localhost:8080/admin/editCustomer?id=${item.id}"><i
                                                class="fa fa-pencil-square-o">
                                        </i>
                                        </a>
                                    </td>

                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>

                        <ul class="pagination" id="pagination"></ul>

                    </div>
                </div>
            </div>


        </div>
    </div>
</div><!-- /.main-content -->


<!--Modal-->
<div class="modal fade" id="UpdateEmployee" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Danh sách nhân viên</h4>
            </div>
            <div class="modal-body">
                <table id="staffList"
                       class="table table-striped table-bordered table-hover">
                    <thead>
                    <tr>

                        <th class="center">Chọn nhân viên</th>
                        <th>Tên nhân viên</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td class="center"><input type="checkbox" value="2"
                                                  id="checkbox_2"/></td>
                        <td>Lực đẹp trai</td>
                    </tr>

                    <tr>
                        <td class="center"><input type="checkbox" value="3"
                                                  id="checkbox_3"/></td>
                        <td>Lực chim to</td>
                    </tr>

                    <tr>
                        <td class="center"><input type="checkbox" value="4"
                                                  id="checkbox_4"/></td>
                        <td>Lực giàu có</td>
                    </tr>
                    </tbody>
                </table>
                <%--<input type="hidden" id="buildingId" name="buildingId" value="">--%>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary"
                        id="btnAssignBuilding" data-dismiss="modal">Giao tòa nhà
                </button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>


<script>
    function assingmentBuilding(buildingId) {
        openModalAssingmentBuilding();
        $('#name2222').val(buildingId);
        console.log($('#buildingId').val());
    }

    function openModalAssingmentBuilding() {
        $('#assingmentBuildingModal').modal();

    }


    function UpdateInfoEmployee(idEmployee) {
        $('#name2222').val();
        console.log($('#idEmployee').val());
        console.log($('#name2222').val());
        console.log($('#bnt_1').val());


        //var staffs = [];

        var staffs = $('#dong_' + idEmployee).find(
            'input[type=hidden]').map(
            function () {
                return $(this).val();
            }).get();

        $('#nameEmployee1').val(staffs[1]);
        $('#phoneEmployee1').val(staffs[2]);
        $('#emailEmployee1').val(staffs[3]);
        $('#addressEmployee1').val(staffs[4]);
        $('#passEmployee1').val(staffs[5]);
        $('#idEmployee').val(staffs[0]);


        openUpdateEmployees();

        ///editbuilding(idEmployee);

        //window.location.href = "http://10.5.2.227:8080/spring/quan-tri/bai-viet/building-edit";


    }

    $('#UpdateEmployee2').click(function (e) {
        e.preventDefault();
        var data = {};


        data['tennhanvien'] = $('#nameEmployee1').val();
        data['didong'] = $('#phoneEmployee1').val();

        data['emaildangnhap'] = $('#emailEmployee1').val();

        data['pass'] = $('#passEmployee1').val();

        data['diachi'] = $('#addressEmployee1').val();
        data['id'] = $('#idEmployee').val();
        editbuilding(data);

    });


    function openUpdateEmployees() {
        $('#UpdateEmployee').modal();
    }


    function openModaladdEmployee() {
        $('#themnhanvien').modal();
    }

    $('#addEmployee').click(function (e) {
        openModaladdEmployee();

    });




    $('#btnSearch').click(
        function (e) {
            e.preventDefault();
            $('#listForm').submit();
            console.log($('#listForm'));

            /* var data = {};
             data['name'] = $('#name').val();
             searchBuild(data)*/
        });




    $('#btnDeleteKhachHang').click(
        function (e) {
            e.preventDefault();
            var data = {};
            //var staffs = [];
            var staffs = $('#ListCustomer').find(
                'tbody input[type=checkbox]:checked').map(
                function () {
                    return $(this).val();
                }).get();
            data['listid'] = staffs;
            deleteBuilding(data);
        });

    function deleteBuilding(data) {
        $.ajax({
            type: "DELETE",
            url: "http://localhost:8080/api/customer",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "http://localhost:8080/admin/customer";
                windows.onload
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
