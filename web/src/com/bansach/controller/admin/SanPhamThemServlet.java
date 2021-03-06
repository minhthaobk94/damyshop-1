package com.bansach.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bansach.model.bean.LoaiSanPham;
import com.bansach.model.bo.LoaiSanPhamBO;
import com.bansach.utils.MyUtils;

public class SanPhamThemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SanPhamThemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		LoaiSanPhamBO loaiSanPhamBO = new LoaiSanPhamBO();
		ArrayList<LoaiSanPham> arrLoaiSanPham = loaiSanPhamBO.getTatCaLoaiSanPham();
		request.setAttribute("arrLoaiSanPham", arrLoaiSanPham);
		MyUtils.forward(getServletContext(), request, response, "/admin/san-pham-them.jsp");
	}

}
