package com.bansach.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bansach.model.bean.LoaiSanPham;
import com.bansach.model.bo.LoaiSanPhamBO;

/**
 * Servlet implementation class doLoaiSanPhamThem
 */
@WebServlet("/doLoaiSanPhamThem")
public class doLoaiSanPhamThem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doLoaiSanPhamThem() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		//lay du lieu
		String tenLSP = (String) request.getParameter("tenLSP");
		String moTaLSP = (String) request.getParameter("moTaLSP");
		
		//them vao database
		LoaiSanPhamBO loaiSanPhamBO = new LoaiSanPhamBO();
		LoaiSanPham loaiSanPham = new LoaiSanPham(tenLSP, moTaLSP);
		loaiSanPhamBO.addLoaiSanPham(loaiSanPham);
		
		//sendredirect
		response.sendRedirect(request.getContextPath()+"/admin/loai-san-pham");
	}

}
