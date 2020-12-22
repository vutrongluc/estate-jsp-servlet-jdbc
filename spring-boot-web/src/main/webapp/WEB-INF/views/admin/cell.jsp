<%--
  Created by IntelliJ IDEA.
  User: cuncon
  Date: 12/21/2020
  Time: 10:33 PM
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
    <title>SwapCell</title>
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
                <li class="active"><a href="/admin/cell">Tìm CellSwap</a></li>
            </ul>
            <!-- /.breadcrumb -->


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

                                <form:form commandName="modelSearch"
                                           action="/admin/findcell"
                                           id="listForm" method="GET">
                                    <div class="row">

                                        <div class="col-sm-4">


                                            <div>
                                                <label for="d">Một nửa khoảng cách tái sử dụng BSC</label> <input
                                                    type="text" id="d" name="d"
                                                    class="form-control" value="${modelSearch.d}"/>
                                            </div>

                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="bw">Một nửa Độ rộng búp sóng</label> <input
                                                    type="text" id="bw" name="bw"
                                                    value="${modelSearch.bw}" class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">
                                            <div>
                                                <label for="diempv">Số điểm phục vụ tối thiểu của một cell</label>
                                                <input
                                                        type="text" id="diempv" name="diempv"
                                                        value="${modelSearch.diempv}" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                    <br>

                                    <div class="row">

                                        <div class="col-sm-6">
                                            <div>
                                                <label for="tp">Chọn tỉnh thành</label>
                                                <input
                                                        type="text" id="tp" name="tp"
                                                        value="${modelSearch.tp}" class="form-control"/>
                                            </div>
                                        </div>

                                        <div class="col-sm-6">
                                            <div>
                                                <label for="codelando">Chọn mã lần đo</label>
                                                <input
                                                        type="text" id="codelando" name="codelando"
                                                        value="${modelSearch.codelando}" class="form-control"/>
                                            </div>
                                        </div>
                                    </div>

                                    <br>
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

            <br>
            <div class="row" id="tableshow">
                <div class="col-xs-12">
                    <div class="table-responsive">

                        <table class="table table-bordered" id="ListCustomer">
                            <thead>
                            <tr>
                                <th><input type="checkbox" id="checkAll"></th>
                                <th>Tên Trạm</th>
                                <th>Tên Cell</th>
                                <th>Long</th>
                                <th>Lat</th>
                                <th>UARFCN</th>
                                <th>PSC</th>
                                <th>Azimush</th>
                                <th>Góc hướng trung bình</th>
                                <th>Số Mẫu</th>

                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="item" items="${model}">
                                <tr>
                                    <td><input type="checkbox" id="checkbox"
                                               value=""> <%--<input type="hidden" name="buildingId"
                                                                            value="${item.fullname}">--%></td>

                                    <td>${item.nodename}</td>
                                    <td>${item.cellname}</td>
                                    <td>${item.lon}</td>

                                    <td>${item.lat}</td>
                                    <td>${item.uarfcndownlink}</td>
                                    <td>${item.pscrambcode}</td>
                                    <td>${item.azimuth}</td>
                                    <td>${item.angleTB}</td>
                                    <td>${item.diemList.size()}</td>


                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>

                        <ul class="pagination" id="pagination"></ul>

                    </div>
                </div>
            </div>


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

   /* var table = document.getElementById('tableshow');
    table.hide();*/
/*   document.getElementById("tableshow").style.visibility = "hidden";*/
   if(${modelSearch.bw == 0.0}){
       $('#tableshow').hide();
   }

    $('#btnSearch').click(

        function (e) {
           /* $('#tableshow').show();*/
            /*document.getElementById("tableshow").style.visibility = "visible";*/
            e.preventDefault();
            $('#listForm').submit();
            console.log($('#listForm'));


            /* var data = {};
             data['name'] = $('#name').val();
             searchBuild(data)*/
        });


</script>

</body>
</html>
