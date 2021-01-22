package com.hcl.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.web.dao.JewelryDAO;
import com.hcl.web.model.Jewelry;

/**
 * Servlet implementation class GetJewelryController
 */
public class GetJewelryController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		JewelryDAO dao = new JewelryDAO();
		Jewelry j1 = dao.getJewelry(id);

		HttpSession session = request.getSession();
		session.setAttribute("jewelry", j1);

		response.sendRedirect("showJewelry.jsp");

	}


}
