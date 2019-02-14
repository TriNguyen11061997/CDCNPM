<%-- 
    Document   : sanpham_Add
    Created on : Jan 17, 2019, 2:29:51 PM
    Author     : Trí Nguyễn
--%>

<%@page import="Bean.SanPhamBean"%>
<%@page import="Bean.NSXBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%SanPhamBean spBean = (SanPhamBean) request.getAttribute("sanpham");
            if (spBean != null) {
        %>
        <form action="/SanPham_Add_Update" method="post">
            <input name="ID_SP" value="<%=spBean.getID_SP()%>" type="text" hidden="">
            <label>Tên sản phẩm</label>
            <input name="Name_SP" value="<%=spBean.getName_SP()%>" type="text">
            <br><br>
            <label>Ngày sản xuất</label>
            <input name="Date_NSX" value="<%=spBean.getDate_NSX()%>" type="date">
            <br><br>
            <label>Trạng thái</label>
            <select name="Status">

                <option value="Còn hàng">Còn hàng</option>
                <option value="Hết hàng">Hết hàng</option>
            </select>
            <br><br>
            <label>Nhà sản xuất</label>
            <select name="NSX">
                <% List<NSXBean> list = (List<NSXBean>) request.getAttribute("listNSX");
                    for (NSXBean item : list) {
                %> 
                <option value="<%=item.getID_NSX()%>"><%=item.getName_NSX()%></option>               
                <% }%>
            </select>
            <input type="submit" value="SUBMIT">
        </form>
        <% } else {%>

        <form action="/SanPham_Add_Update" method="post">
            <label>Tên sản phẩm</label>
            <input name="Name_SP" type="text">
            <br><br>
            <label>Ngày sản xuất</label>
            <input name="Date_NSX" type="date">
            <br><br>
            <label>Trạng thái</label>
            <select name="Status">
                <option value="Còn hàng">Còn hàng</option>
                <option value="Hết hàng">Hết hàng</option>
            </select>
            <br><br>
            <label>Nhà sản xuất</label>
            <select name="NSX">
                <% List<NSXBean> list = (List<NSXBean>) request.getAttribute("listNSX");
                    for (NSXBean item : list) {
                %> 
                <option value="<%=item.getID_NSX()%>"><%=item.getName_NSX()%></option>               
                <% }%>
            </select>
            <input type="submit" value="SUBMIT">
        </form>
        <% }%>
    </body>
</html>
