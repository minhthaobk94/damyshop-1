package com.bansach.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bansach.model.bean.KhachHang;
import com.bansach.model.bo.KhachHangBO;
import com.bansach.utils.MyUtils;

public class DonHangThemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DonHangThemServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//lay danh sach khach hang
		KhachHangBO khachHangBO = new KhachHangBO();
		ArrayList<KhachHang> arrKhachHang = khachHangBO.getTatCaKhachHang();
		request.setAttribute("arrKhachHang", arrKhachHang);
		MyUtils.forward(getServletContext(), request, response, "/admin/don-hang-them.jsp");
	}

}
