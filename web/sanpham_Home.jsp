<%-- 
    Document   : SanPham_Home
    Created on : Jan 17, 2019, 2:09:51 PM
    Author     : Trí Nguyễn
--%>

<%@page import="Bean.NSXBean"%>
<%@page import="java.util.List"%>
<%@page import="Bean.SanPhamBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="/SanPhamAdd"><button>+</button></a>
        <div>
            <form action="/StudentSearch" method="post">
                <%
                    String name = "";
                    if (session.getAttribute("info") != null) {
                        name = (String) session.getAttribute("info");
                    }%>
                <table>
                    <tr>
                        <th><input type="text" name="info" value="<%=name%>" /></th>
                        <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                    </tr>
                </table>
            </form>
        </div>
        <div style="margin-left:20px;">
            <form action="/StudentSort" method="get">
                <table>
                    <tr>
                        <th>
                            <select name="thongtin_sort">
                                <option value="0">Mã sinh viên</option>
                                <option value="1">Tên sinh viên</option>
                                <option value="2">Lớp</option>
                            </select>
                        </th>
                        <th><button type="submit" class="btn btn-success" style="width:auto;">Sort</button></th>
                    </tr>
                </table>
            </form>
        </div>

        <div style="margin-left:20px;">
            <form action="/StudentSort" method="get">
                <table>
                    <tr>
                        <th>
                            <select name="NSX">
                                <% List<NSXBean> listNSX = (List<NSXBean>) request.getAttribute("listNSX");
                                    for (NSXBean item : listNSX) {
                                %> 
                                <option value="<%=item.getID_NSX()%>"><%=item.getName_NSX()%></option>               
                                <% }%>
                            </select>
                        </th>
                        <th><button type="submit" class="btn btn-success" style="width:auto;">Search</button></th>
                    </tr>
                </table>
            </form>
        </div>

        <table>
            <tr>
                <th>STT</th>
                <th>Tên sản phẩm</th>
                <th>Ngày sản xuất</th>
                <th>Trạng thái</th>
                <th>Tên NSX</th>
                <th>Cập nhật</th>
                <th>Xóa</th>
            </tr>

            <% List<SanPhamBean> list = (List<SanPhamBean>) request.getAttribute("listSanpham");
                for (SanPhamBean item : list) {
            %> 
            <tr>  
                <%
                    session.setAttribute(String.valueOf(item.getID_SP()), item.getID_SP());
                    session.setAttribute(String.valueOf(list.size()), list.size());
                %>
                <td><%=item.getID_SP()%></td>
                <td><%=item.getName_SP()%></td>
                <td><%=item.getDate_NSX()%></td>
                <td><%=item.getStatus()%></td>
                <td><%=item.getNsx().getName_NSX()%></td>
                <td><a href="/SanPhamAdd?ID=<%=item.getID_SP()%>">Cập nhật</a></td>
                <td><a href="/SanPhamDelete?ID=<%=item.getID_SP()%>">Xóa</a></td>
            </tr>
            <% }%>

        </table>
    </body>
</html>
