<%--
  Created by IntelliJ IDEA.
  User: ADP_TOMS
  Date: 12/4/2020
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:url var="buildingListURL" value="/admin/list"/>
<c:url var="buildingEdit" value="http://localhost:8080/admin/edit"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>edit</title>
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
                <li><i class="ace-icon fa fa-home home-icon"></i> <a href="http://localhost:8080/admin/list">Home</a>
                </li>
                <li class="active"><a href="http://localhost:8080/admin/list">Editbuilding</a></li>
            </ul>
            <!-- /.breadcrumb -->


        </div>

        <div class="page-content">

            <form:form commandName="modelSearch" action="http://localhost:8080/api/building"
                       id="listForm2" method="PUT">
                <form id="formEditBuilding">
                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="name"> Tên tòa nhà </label>
                        <div class="col-sm-9">
                            <input type="text" id="name" class="form-control" name="name"
                                   value="${modelSearch.name}"/>
                            <input type="hidden" id="id" class="form-control" name="id"
                                   value="${modelSearch.id}"/>

                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="street"> Đường</label>
                        <div class="col-sm-9">
                            <input type="text" id="street"
                                   name="street" class="form-control" value="${modelSearch.street}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="ward"> Phường</label>
                        <div class="col-sm-9">
                            <input type="text" id="ward"
                                   name="ward" class="form-control" value="${modelSearch.ward}"/>
                        </div>
                    </div>


                    <div class="form-group">

                        <label class="col-sm-3 control-label no-padding-right"
                               for="district"> Quận</label>
                        <div class="col-sm-9">
                            <select class="form-control" id="district" name="district">
                                <option value="">--Chọn quận--</option>
                                <c:forEach var="item" items="${district}">
                                    <option value=${item.codeDistrict} <c:if test="${modelSearch.district == item.codeDistrict }">selected="selected"</c:if>>

                                            ${item.nameDistrict}

                                    </option>
                                </c:forEach>

                            </select>

                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="structure"> Cấu trúc</label>
                        <div class="col-sm-9">
                            <input type="text" id="structure"
                                   name="structure" class="form-control" value="${modelSearch.structure}"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="numberofbasement"> Số tầng hầm</label>
                        <div class="col-sm-9">
                            <input type="number" id="numberofbasement"
                                   name="numberofbasement" class="form-control"
                                   value="${modelSearch.numberofbasement}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="floorarea"> Diện tích sàn</label>
                        <div class="col-sm-9">
                            <input type="number" id="floorarea"
                                   name="floorarea" class="form-control" value="${modelSearch.floorarea}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="direction">Hướng</label>
                        <div class="col-sm-9">
                            <input type="text" id="direction"
                                   name="direction" class="form-control" value="${modelSearch.direction}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="rentprice"> Giá thuê</label>
                        <div class="col-sm-9">
                            <input type="number" id="rentprice"
                                   name="rentprice" class="form-control" value="${modelSearch.rentprice}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="rentpricedescription">Mô tả giá thuê</label>
                        <div class="col-sm-9">
                            <input type="text" id="rentpricedescription"
                                   name="rentpricedescription" class="form-control"
                                   value="${modelSearch.rentpricedescription}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="servicefee">Phí dịch vụ</label>
                        <div class="col-sm-9">
                            <input type="text" id="servicefee"
                                   name="servicefee" class="form-control" value="${modelSearch.servicefee}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="carfee">Phí ô tô</label>
                        <div class="col-sm-9">
                            <input type="text" id="carfee"
                                   name="carfee" class="form-control" value="${modelSearch.carfee}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="motofee">Phí xe máy</label>
                        <div class="col-sm-9">
                            <input type="text" id="motofee"
                                   name="motofee" class="form-control" value="${modelSearch.motofee}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="overtimefee">Phí ngoài giờ</label>
                        <div class="col-sm-9">
                            <input type="text" id="overtimefee"
                                   name="overtimefee" class="form-control" value="${modelSearch.overtimefee}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="waterfee">Tiền nước</label>
                        <div class="col-sm-9">
                            <input type="text" id="waterfee"
                                   name="waterfee" class="form-control" value="${modelSearch.waterfee}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="electricityfee">Tiền điện</label>
                        <div class="col-sm-9">
                            <input type="text" id="electricityfee"
                                   name="electricityfee" class="form-control" value="${modelSearch.electricityfee}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="deposit">tiền đặt cọc</label>
                        <div class="col-sm-9">
                            <input type="text" id="deposit"
                                   name="deposit" class="form-control" value="${modelSearch.deposit}"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="renttime">Thời gian thuê</label>
                        <div class="col-sm-9">
                            <input type="text" id="renttime"
                                   name="renttime" class="form-control" value="${modelSearch.renttime}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="decorationtime">thời gian trang trí</label>
                        <div class="col-sm-9">
                            <input type="text" id="decorationtime"
                                   name="decorationtime" class="form-control" value="${modelSearch.decorationtime}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="brokeragetee">Phí môi giới</label>
                        <div class="col-sm-9">
                            <input type="text" id="brokeragetee"
                                   name="brokeragetee" class="form-control" value="${modelSearch.brokeragetee}"/>
                        </div>
                    </div>

                        <%-- <div class="form-group">
                             <label class="col-sm-3 control-label no-padding-right"
                                    for="note">Ghi chú</label>
                             <div class="col-sm-9">
                                 <input type="text" id="note"
                                        name="note" class="form-control" value="${model.didong}"/>
                             </div>
                         </div>--%>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="linkofbuilding">đường dẫn </label>
                        <div class="col-sm-9">
                            <input type="text" id="linkofbuilding"
                                   name="linkofbuilding" class="form-control" value="${modelSearch.linkofbuilding}"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="map">Bản đồ</label>
                        <div class="col-sm-9">
                            <input type="text" id="map"
                                   name="map" class="form-control" value="${modelSearch.map}"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-3 control-label no-padding-right"
                               for="form-field-1"> Loại tòa nhà </label>
                        <div class="col-sm-9" id="form-field-1" id="">
                            <div class="checkbox" id="listChecbox" , name="type">
                                <c:forEach var="item" items="${buildingrentType}">

                                    <label>
                                        <input name="type" type="checkbox" class="ace"
                                               value="${item.codeBuildingType}"

                                                <c:if test="${fn:contains(modelSearch.type, item.codeBuildingType)}">
                                                    checked
                                                </c:if>

                                        />
                                        <span class="lbl">${item.nameBuildingType}</span>
                                            <%-- <input type="hidden" name="type" value="${item.codeBuildingType}">--%>
                                    </label>
                                </c:forEach>
                            </div>

                        </div>
                    </div>


                    <div class="row" id="renttype">
                        <div class="row">
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right"
                                       for="dientichthue"> Diện tích thuê </label>
                                <div class="col-sm-9" id="dientichthue">
                                    <div class="col-xs-12">
                                            <%--<div class="table-responsive">--%>

                                        <table class="table table-bordered" id="listRentarea">
                                            <thead>
                                            <tr>
                                                <th><input type="checkbox" id="checkAll"></th>
                                                <th>Diện tích thuê</th>

                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="item" items="${rentareaByBuildingId}">
                                                <tr>
                                                    <td><input type="checkbox" id="${item.id}"
                                                               value="${item.id}"> <input type="hidden" name="value"
                                                                                          value="${item.value}">
                                                    </td>

                                                    <td>${item.value}</td>


                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>

                                        <div class="btn-group pull-right">
                                            <button type="button" class="btn btn-white btn-info btn-bold"
                                                    id="DeleteRentArea" data-toggle="tooltip"
                                                    title="Xóa diện tích thuê">
                                                <i class="fa fa-trash"></i>
                                            </button>
                                        </div>

                                        <br>
                                        <br>
                                        <div class="row">
                                            <div class="form-group">
                                                <div class="col-sm-9">
                                                    <input type="number" id="rent"
                                                           name="rent" class="form-control" value=""/>
                                                </div>

                                                <div class="col-sm-3">
                                                    <button type="button" class="btn btn-primary"
                                                            id="btnThemDienTichThue">Thêm diện
                                                        tích thuê
                                                    </button>
                                                </div>

                                            </div>

                                        </div>


                                    </div>
                                </div>
                            </div>
                        </div>

                        <br>
                        <div class="row">
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right"
                                       for="giatoanha"> Giao toa nha cho nhan vien </label>
                                <div class="col-sm-9" id="giatoanha">
                                    <div class="col-xs-12">
                                            <%--<div class="table-responsive">--%>

                                        <table class="table table-bordered" id="listStaffChoosed">
                                            <thead>
                                            <tr>
                                                <th><input type="checkbox" id="checkAll2"></th>
                                                <th>Nhân viên</th>

                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="item" items="${staffs}">
                                                <tr>
                                                    <td><input type="checkbox" id="${item.key}"
                                                               value="${item.key}"

                                                    <c:forEach var="item2" items="${assigmentBuilding}">
                                                    <c:if test="${item2 eq item.key}">
                                                               checked
                                                    </c:if>
                                                    </c:forEach>

                                                    > <input type="hidden" name="value"
                                                             value="${item.key}">
                                                    </td>

                                                    <td>${item.value}</td>


                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>

                                        <div class="row">
                                            <div class="form-group">
                                                <div class="col-sm-9">
                                                    <button type="button" class="btn btn-primary"
                                                            id="updateAssignBuilding">Giao tòa nhà
                                                    </button>
                                                </div>


                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>


                    </div>


                        <%-- <div class="row">
                             <div class="col-xs-12">
                                 <button type="button" class="btn btn-primary" id="btnSearch222">thêm tòa nhà test 2
                                 </button>
                             </div>
                         </div>
                         <br>

                         <div class="row">
                             <div class="col-xs-12">
                                 <button type="button" class="btn btn-primary" id="btnThemToaNha">Thêm Tòa Nhà
                                 </button>
                             </div>
                         </div>--%>
                    <br>
                    <div class="row">
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right"
                                   for="form-field-122"> </label>
                            <div class="col-sm-9" id="form-field-122">
                                <c:if test="${ modelSearch.id != -1}">
                                    <input type="button" class="btn btn-primary"
                                           value="Cập nhật thông tin tòa nhà" id="btnUpdateBuilding"/>
                                </c:if>
                                <c:if test="${modelSearch.id == -1}">
                                    <input type="button" class="btn btn-primary" value="Thêm tòa nhà"
                                           id="btnInsertBuilding"/>
                                </c:if>

                            </div>
                        </div>
                    </div>


                        <%-- <div class="form-group">
                             <div class="col-sm-12">

                             </div>
                         </div>
                         <br>--%>
                        <%--   <div class="form-group">
                               <div class="col-sm-12">
                                   <c:if test="${not empty modelSearch.id}">
                                       <input type="button" class="btn btn-white btn-warning btn-bold"
                                              value="Cập nhật thông tin tòa nhà" id="btnInserOrUpdateBuilding"/>
                                   </c:if>
                                   <c:if test="${empty modelSearch.id}">
                                       <input type="button" class="btn btn-white btn-warning btn-bold" value="Thêm tòa nhà"
                                              id="btnInserOrUpdateBuilding"/>
                                   </c:if>
                               </div>
                           </div>--%>

                </form>
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


    var bientam = "${modelSearch.id}";


    /*   $(document).ready(function () {

           if (bientam === "-1") {
               $('#renttype').hide()
            }
         //  alert("${modelSearch.id}");
    });*/


    if (bientam === "-1") {
        $(document).ready(function () {


            $('#renttype').hide()

            //  alert("${modelSearch.id}");
        });
    }

    if ("${giaonha}" == "ok") {

              alert("giao tòa nhà thành công");
    }

    if ("${giaonha}" == "themdientichok") {

        alert("thêm diện tích thuê thành công");
    }





    $('#btnSearch222').click(
        function (e) {
            e.preventDefault();
            $('#listForm2').submit();
            console.log($('#listForm2'));
            /*   location.href = "http://localhost:8080/admin/list";*/

            /* var data = {};
             data['name'] = $('#name').val();
             searchBuild(data)*/
        });


    $('#btnInserOrUpdateBuilding').click(
        function (e) {
            e.preventDefault();
            $('#listForm2').submit();
            console.log($('#listForm2'));
            /*location.href = "http://localhost:8080/admin/list";*/

            /* var data = {};
             data['name'] = $('#name').val();
             searchBuild(data)*/
        });


    $('#btnThemToaNha').click(function (e) {
        e.preventDefault();
        var data = {};


        data['name'] = $('#name').val();
        data['avatar'] = $('#avatar').val();
        data['brokeragetee'] = $('#brokeragetee').val();
        data['carfee'] = $('#carfee').val();
        data['decorationtime'] = $('#decorationtime').val();
        data['deposit'] = $('#deposit').val();
        data['direction'] = $('#direction').val();
        data['district'] = $('#district').val();
        data['electricityfee'] = $('#electricityfee').val();

        data['floorarea'] = $('#floorarea').val();

        data['level'] = $('#level').val();

        data['linkofbuilding'] = $('#linkofbuilding').val();

        data['motofee'] = $('#motofee').val();
        data['numberofbasement'] = $('#numberofbasement').val();
        data['overtimefee'] = $('#overtimefee').val();
        data['payment'] = $('#payment').val();
        data['rentprice'] = $('#rentprice').val();
        data['rentpricedescription'] = $('#rentpricedescription').val();
        data['renttime'] = $('#renttime').val();
        data['servicefee'] = $('#servicefee').val();
        data['structure'] = $('#structure').val();
        data['type'] = $('#type').val();
        data['ward'] = $('#ward').val();
        data['waterfee'] = $('#waterfee').val();
        data['street'] = $('#street').val();


        InsertBuilding(data);

    });


    $('#btnInsertBuilding').click(function (e) {
        e.preventDefault();
        var data = {};


        data['name'] = $('#name').val();
        data['avatar'] = $('#avatar').val();
        data['brokeragetee'] = $('#brokeragetee').val();
        data['carfee'] = $('#carfee').val();
        data['decorationtime'] = $('#decorationtime').val();
        data['deposit'] = $('#deposit').val();
        data['direction'] = $('#direction').val();
        data['district'] = $('#district').val();
        data['electricityfee'] = $('#electricityfee').val();

        data['floorarea'] = $('#floorarea').val();

        data['level'] = $('#level').val();

        data['linkofbuilding'] = $('#linkofbuilding').val();

        data['motofee'] = $('#motofee').val();
        data['numberofbasement'] = $('#numberofbasement').val();
        data['overtimefee'] = $('#overtimefee').val();
        data['payment'] = $('#payment').val();
        data['rentprice'] = $('#rentprice').val();
        data['rentpricedescription'] = $('#rentpricedescription').val();
        data['renttime'] = $('#renttime').val();
        data['servicefee'] = $('#servicefee').val();
        data['structure'] = $('#structure').val();
        data['type'] = $('#type').val();
        data['ward'] = $('#ward').val();
        data['waterfee'] = $('#waterfee').val();
        data['street'] = $('#street').val();


        InsertBuilding(data);

    });


    $('#btnUpdateBuilding').click(function (e) {

        e.preventDefault();
        var data = {};
        var idmang = '';

        var staffs = $('#listChecbox').find(
            'input[type=checkbox]:checked').map(
            function () {
                return $(this).val();
            }).get();

        staffs.forEach(element => idmang = element + ',' + idmang);


        data['id'] = $('#id').val();
        data['name'] = $('#name').val();
        data['avatar'] = $('#avatar').val();
        data['brokeragetee'] = $('#brokeragetee').val();
        data['carfee'] = $('#carfee').val();
        data['decorationtime'] = $('#decorationtime').val();
        data['deposit'] = $('#deposit').val();
        data['direction'] = $('#direction').val();
        data['district'] = $('#district').val();
        data['electricityfee'] = $('#electricityfee').val();

        data['floorarea'] = $('#floorarea').val();

        data['level'] = $('#level').val();

        data['linkofbuilding'] = $('#linkofbuilding').val();

        data['motofee'] = $('#motofee').val();
        data['numberofbasement'] = $('#numberofbasement').val();
        data['overtimefee'] = $('#overtimefee').val();
        data['payment'] = $('#payment').val();
        data['rentprice'] = $('#rentprice').val();
        data['rentpricedescription'] = $('#rentpricedescription').val();
        data['renttime'] = $('#renttime').val();
        data['servicefee'] = $('#servicefee').val();
        data['structure'] = $('#structure').val();
        data['type'] = $('#type').val();
        data['ward'] = $('#ward').val();
        data['waterfee'] = $('#waterfee').val();
        data['street'] = $('#street').val();
        data['type'] = idmang;

        UpdateBuilding(data);

    });


    function UpdateBuilding(data) {
        $.ajax({
            type: "PUT",
            url: "http://localhost:8080/api/building",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "http://localhost:8080/admin/list?status=capnhatok";
            },
            error: function (response) {
                console.log('failed');
                window.location.href = "http://localhost:8080/admin/list?status=capnhatok";
                console.log(response);
            }
        });

    }


    function InsertBuilding(data) {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/api/building",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');
                window.location.href = "http://localhost:8080/admin/list?status=insertok";
            },
            error: function (response) {
                console.log('failed');
                window.location.href = "http://localhost:8080/admin/list?status=insertok";
                console.log(response);
            }
        });

    }


    $('#btnSearch').click(
        function (e) {
            e.preventDefault();
            $('#listForm').submit();
            console.log($('#listForm'));

            /* var data = {};
             data['name'] = $('#name').val();
             searchBuild(data)*/
        });


    $('#btnAddBuilding').click(function () {
        var data = {};
        var buildingTypes = [];
        var formData = $('#formEdit').serializeArray();
        $.each(formData, function (index, v) {
            if (v.name == 'buildingTypes') {
                buildingType.push(v.value);
            } else {
                data["" + v.name + ""] = v.value;
            }

        });

        data['buildingTypes'] = buildingTypes;

        $.ajax({

            type: "POST",
            url: "http://localhost:8080/api/building",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "http://localhost:8080/admin/list";
            },
            error: function (response) {
                console.log('failed');
                console.log(response);
                window.location.href = "http://localhost:8080/admin/list";
            }
        });
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


    $('#btnThemDienTichThue').click(function (e) {
        e.preventDefault();
        var data = {};


        data['value'] = $('#rent').val();
        data['buildingid'] = ${modelSearch.id};


        themdientichthue(data);

    });


    $('#updateAssignBuilding').click(function (e) {
        e.preventDefault();
        var data = {};



        var staffs = $('#listStaffChoosed').find(
            'tbody input[type=checkbox]:checked').map(
            function () {
                return $(this).val();
            }).get();

        data['idstaff'] = staffs;
        data['buildingid'] = ${modelSearch.id};

        updateAssignmentBuilding(data);

    });


    $('#DeleteRentArea').click(
        function (e) {
            e.preventDefault();
            var data = {};
            //var staffs = [];
            var staffs = $('#listRentarea').find(
                'tbody input[type=checkbox]:checked').map(
                function () {
                    return $(this).val();
                }).get();

            data['mangId'] = staffs;


            DeleteRentarea(data);

        });


    function DeleteRentarea(data) {
        $.ajax({
            type: "DELETE",
            url: "http://localhost:8080/api/rentarea",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "http://localhost:8080/admin/edit?id=${buildingById.id}";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "http://localhost:8080/admin/edit?id=${buildingById.id}";
                console.log(response);
            }
        });


    }

    function updateAssignmentBuilding(data) {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/api/assignment",
            //url: "http://10.5.2.227:8080/spring/api/new",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "http://localhost:8080/admin/edit?id=${modelSearch.id}&status=ok";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "http://localhost:8080/admin/edit?id=${modelSearch.id}&status=ok";
                console.log(response);
            }
        });
    }

    function themdientichthue(data) {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/api/rentarea",
            //url: "http://10.5.2.227:8080/spring/api/new",
            data: JSON.stringify(data),
            dataType: "json",
            contentType: "application/json",
            success: function (response) {
                console.log('SUCCESS');

                window.location.href = "http://localhost:8080/admin/edit?id=${buildingById.id}&status=themdientichok";


            },
            error: function (response) {
                console.log('failed');

                window.location.href = "http://localhost:8080/admin/edit?id=${buildingById.id}&status=themdientichok";
                console.log(response);
            }
        });


    }


</script>


</body>
</html>
