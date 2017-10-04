package Ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

@WebServlet("/index")
public class ApiTest extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mod = request.getParameter("mod");
		String STR = request.getParameter("str");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Mod", mod);
		jsonObject.put("str", STR);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(jsonObject.toJSONString());

	}
}
