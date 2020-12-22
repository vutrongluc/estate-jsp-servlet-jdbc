<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="http://localhost:8080/admin/edit"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- <title>Trang chủ</title> -->
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="http://localhost:8080/admin/list">Tòa nhà</a>
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

                                <form:form commandName="modelSearch" action="http://localhost:8080/admin/listserch"
                                           id="listForm" method="GET">
                                    <div class="row">

                                        <div class="col-sm-6">


                                            <div>
                                                <label for="name">Tên tòa nhà</label> <input
                                                    type="text" id="name" name="name"
                                                    class="form-control" value="${modelSearch.name}"/>
                                            </div>

                                        </div>

                                        <div class="col-sm-6">
                                            <div>
                                                <label for="floorarea">Diện tích sàn</label> <input
                                                    type="number" id="floorarea" name="floorarea"
                                                    value="${modelSearch.floorarea}" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-sm-4">
                                            <label for="district">--Quận hiện có--</label>
                                            <select class="form-control" id="district" name="district">
                                                <option value="">--Chọn quận--</option>
                                                <c:forEach var="item" items="${district}">
                                                    <option value=${item.codeDistrict} <c:if test="${modelSearch.district == item.codeDistrict }">selected="selected"</c:if>>

                                                            ${item.nameDistrict}

                                                    </option>
                                                </c:forEach>

                                            </select>
                                                <%--<form:select path="district">

                                                </form:select>--%>

                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="ward">Phường</label> <input
                                                    type="text" id="ward" name="ward" value="${modelSearch.ward}"
                                                    class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="street">Đường</label> <input
                                                    type="text" id="street" name="street" value="${modelSearch.street}"
                                                    class="form-control"/>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-sm-4">


                                            <div>
                                                <label for="numberofbasement">Số tầng hầm</label> <input
                                                    type="text" id="numberofbasement" name="numberofbasement"
                                                    class="form-control" value="${modelSearch.numberofbasement}"/>
                                            </div>

                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="direction">Hướng</label> <input
                                                    type="text" id="direction" name="direction"
                                                    value="${modelSearch.direction}"
                                                    class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="level">Hạng</label> <input
                                                    type="text" id="level" name="level" value="${modelSearch.level}"
                                                    class="form-control"/>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-sm-3">
                                            <div>
                                                <label for="rentareafrom">Diện tích từ</label> <input type="number"
                                                                                                      id="rentareafrom"
                                                                                                      value="${modelSearch.rentareafrom}"
                                                                                                      class="form-control"
                                                                                                      name="rentareafrom"/>
                                            </div>


                                        </div>

                                        <div class="col-sm-3">
                                            <div>
                                                <label for="rentareato">Diện tích đến</label> <input
                                                    type="number" id="rentareato" value="${modelSearch.rentareato}"
                                                    class="form-control"
                                                    name="rentareato"/>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div>
                                                <label for="cost_from">Giá thuê từ</label> <input
                                                    type="number" id="cost_from" value="${modelSearch.cost_from}"
                                                    class="form-control"
                                                    name="cost_from"/>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div>
                                                <label for="cost_to">Giá thuê đến</label> <input
                                                    type="number" id="cost_to" value="${modelSearch.cost_to}"
                                                    class="form-control"
                                                    name="cost_to"/>
                                            </div>
                                        </div>
                                    </div>


                                    <%--   col-xs-12  --%>
                                    <div class="row">
                                        <div class="col-sm-4">


                                            <div>
                                                <label for="ManagerName">Tên Quản Lý</label> <input
                                                    type="text" id="ManagerName" name="ManagerName"
                                                    class="form-control" value=""/>
                                            </div>

                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="ManagerPhone">Điện thoại quản lý</label> <input
                                                    type="text" id="ManagerPhone" name="ManagerPhone" value=""
                                                    class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">

                                            <label for="idstaff">Chọn nhân viên</label>
                                            <select class="form-control" id="idstaff" name="idstaff">
                                                <option value="">--Chọn nhân viên phụ trách--</option>
                                                <c:forEach var="item" items="${staffs}">
                                                    <option value=${item.key} <c:if test="${modelSearch.idstaff == item.key }">selected="selected"</c:if>>
                                                            ${item.value}

                                                    </option>
                                                </c:forEach>

                                            </select>

                                        </div>
                                    </div>

                                    <br>
                                    <div class="row">
                                        <div class="checkbox" id="type" , name="type222">
                                            <c:forEach var="item" items="${buildingrentType}">

                                                <label>
                                                    <input name="type" type="checkbox" class="ace"
                                                           value="${item.codeBuildingType}"/>
                                                    <span class="lbl">${item.nameBuildingType}</span>
                                                        <%-- <input type="hidden" name="type" value="${item.codeBuildingType}">--%>
                                                </label>
                                            </c:forEach>


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
                    <%--<button type="button" class="btn btn-white btn-info btn-bold"
                            id="addEmployee" data-toggle="tooltip" title="Thêm nhân viên">
                        <i class="fa fa-plus-circle"></i>
                    </button>--%>

                    <c:url var="createNewURL" value="/admin/edit"/>

                    <c:url var="timkiem" value="/admin/edit">
                        <c:param name="ten"
                                 value="$(name2222).val()"/>  <%--${name2222.value}--    ${name2222.value}--%>
                    </c:url>

                    <a flag="info"
                       class="dt-buttons buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                       title='thêm tòa nhà' href="/admin/edit?id=-1">
						<span>
							<i class="fa fa-plus-circle bigger-110 purple"></i>
						</span>
                    </a>





                    <button class="btn btn-white btn-info btn-bold"
                            data-toggle="tooltip" title="Xóa Tòa Nhà đã chọn" id="btnDeleteBuilding">
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
                                <th>Tên tòa nhà</th>
                                <th>Đường</th>
                                <th>Phường</th>
                                <th>Thao tác</th>

                            </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${model}" varStatus="loop">

                                    <tr>
                                        <td><input type="checkbox" id="checkbox_${item.id}"
                                                   value="${item.id}">

                                        <td>${item.name}</td>
                                        <td>${item.street}</td>
                                        <td>${item.ward}</td>


                                        <td>
                                            <button class="btn btn-sm btn-primary btn-edit"
                                                    data-toggle="tooltip" title="Giao Tòa Nhà"
                                                    onclick="UpdateInfoEmployee(${loop.index}, ${item.id})" id="nut_${loop.index}" value="${item.staffidlist}">
                                                <i class="ace-icon fa fa-pencil bigger-120"></i>
                                            </button>

                                            <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
                                               title='Chỉnh sửa diện tích thuê'
                                               href="http://localhost:8080/admin/rentarea?id=${item.id}"><i
                                                    class="fa fa-pencil-square-o">
                                            </i>
                                            </a>

                                            <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
                                               title='Cập nhật thông tin tòa nhà'
                                               href="/admin/edit?id=${item.id}"><i
                                                    class="fa fa-pencil-square-o">
                                            </i>
                                            </a>


                                        </td>

                                    </tr>

                                </c:forEach>
                          <%--  </form:form>--%>
                            </tbody>
                        </table>

                        <ul class="pagination" id="pagination"></ul>

                    </div>
                </div>
            </div>


        </div>
    </div>
</div><!-- /.main-content -->

<!--cập nhật giao tòa nhà-->
<div class="modal fade" id="UpdateEmployee" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Danh sách nhân viên</h4>
            </div>
            <div class="modal-body">
                <table id="listStaffChoosed" class="table table-striped table-bordered table-hover">
                    <thead>
                    <tr>

                        <th class="center">Chọn nhân viên</th>
                        <th><input type="hidden" id="idtoanha"
                                   value=""></th>
                    </tr>
                    </thead>

                    <tbody>


                    <c:forEach var="item" items="${ListUser}">

                        <tr>
                            <td><input type="checkbox" id="${item.id}"
                                       value="${item.id}">

                            </td>

                            <td>${item.fullName}</td>

                        </tr>

                    </c:forEach>



                    </tbody>
                </table>
                <input type="hidden" id="buildingId11" name="buildingId" value="">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" id="btnAssignBuilding22" data-dismiss="modal">Giao tòa
                    nhà
                </button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>







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

    function assingmentBuilding(buildingId) {



        openModalAssingmentBuilding();
        $('#name2222').val(buildingId);
        console.log($('#buildingId').val());
    }

    function openModalAssingmentBuilding() {
        $('#assingmentBuildingModal').modal();

    }






    function UpdateInfoEmployee(chiso,idBuilding) {

        var liststaffidassignment= $('#nut_'+chiso).val();

        var listUser=    ${staffs.keySet()};

        $('#idtoanha').val(idBuilding)

        function bocheck(item, index) {

                document.getElementById(item).checked = false;

        }

        listUser.forEach(bocheck);

        function myFunction(item, index) {
            if(liststaffidassignment.includes(item))
            {
                document.getElementById(item).checked = true;
            }
        }

        listUser.forEach(myFunction);

        openUpdateEmployees();

       // e.preventDefault();




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


    $('#btnAssignBuilding22').click(function (e) {
        e.preventDefault();
        var data = {};



        var staffs = $('#listStaffChoosed').find(
            'tbody input[type=checkbox]:checked').map(
            function () {
                return $(this).val();
            }).get();

        data['idstaff'] = staffs;
        data['buildingid'] = $('#idtoanha').val();

        updateAssignmentBuilding(data);

    });

    function updateAssignmentBuilding(data) {
        $.ajax({
            type: "POST",
            url: "/api/assignment",
            //url: "http://10.5.2.227:8080/spring/api/new",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

              window.location.href = "/admin/list?status=giaook";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "/admin/list?status=giaook";
                console.log(response);
            }
        });
    }







    function openUpdateEmployees() {
        $('#UpdateEmployee').modal();
    }


    function openModaladdEmployee() {
        $('#themnhanvien').modal();
    }

    $('#addEmployee').click(function (e) {
        openModaladdEmployee();

    });

    $('#addEmployee2').click(function (e) {
        e.preventDefault();
        var data = {};


        data['tennhanvien'] = $('#nameEmployee').val();
        data['didong'] = $('#phoneEmployee').val();

        data['emaildangnhap'] = $('#emailEmployee').val();

        data['pass'] = $('#passEmployee').val();

        data['diachi'] = $('#addressEmployee').val();

        Insertnhanvien(data);

    });


    function editbuilding(data) {
        $.ajax({
            type: "PUT",

            url: "/spring/api/new",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "/spring/quan-tri/bai-viet/building-list";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "/spring/quan-tri/bai-viet/building-list";
                console.log(response);
            }
        });

    }

    function Insertnhanvien(data) {
        $.ajax({
            type: "POST",
            url: "/spring/api/new",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "/spring/quan-tri/bai-viet/building-list";
            },
            error: function (response) {
                console.log('failed');
                window.location.href = "/spring/quan-tri/bai-viet/building-list";
                console.log(response);
            }
        });

    }


    $('#rentarea').click(
        function (e) {
            e.preventDefault();
            $('#listForm3').submit();
            console.log($('#listForm3'));

            /* var data = {};
             data['name'] = $('#name').val();
             searchBuild(data)*/
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


    function searchBuild(data) {
        $.ajax({
            type: "GET",
            //	url : "http://192.168.1.3:8080/spring/api/new",
            //   url: "http://10.5.2.227:8080/spring/api/new",
            // url: "http://10.5.2.228:8080/spring/api/new",
            url: "/admin/list",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                windows.onload
            },
            error: function (response) {
                console.log('failed');

                console.log(response);
            }
        });
    }

    $('#btnDeleteBuilding').click(
        function (e) {
            if(confirm('Bạn có chắc muốn xóa các tòa nhà?')){

                    e.preventDefault();
                    var data = {};
                    //var staffs = [];
                    var staffs = $('#staffList2').find(
                        'tbody input[type=checkbox]:checked').map(
                        function () {
                            return $(this).val();
                        }).get();
                    data['buildingid'] = staffs;
                    deleteBuilding(data);
                alert("Đã xóa hàng");

            }else{
                window.location.href = "/admin/list";
            }

        });








/*    $('#btnDeleteBuilding').click(
        function (e) {
            e.preventDefault();
            var data = {};
            //var staffs = [];
            var staffs = $('#staffList2').find(
                'tbody input[type=checkbox]:checked').map(
                function () {
                    return $(this).val();
                }).get();
            data['buildingid'] = staffs;
            deleteBuilding(data);

        });*/

    function deleteBuilding(data) {
        $.ajax({
            type: "DELETE",
            //	url : "http://192.168.1.3:8080/spring/api/new",
            //   url: "http://10.5.2.227:8080/spring/api/new",
            // url: "http://10.5.2.228:8080/spring/api/new",
            url: "/api/building",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "/admin/list";
                windows.onload
            },
            error: function (response) {
                console.log('failed');
                window.location.href = "/admin/list";
                console.log(response);
            }
        });

    }
</script>


</body>
</html>