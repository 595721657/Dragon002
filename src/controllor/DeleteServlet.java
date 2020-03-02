package controllor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.impl.StudentServiceImpl;
@SuppressWarnings("serial")
@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置编码格式
		req.setCharacterEncoding("UTF-8");
		//接收页面数据
		String sno=req.getParameter("sno");
		//创建一个service层的对象
		StudentServiceImpl ss=new StudentServiceImpl();
		int result =ss.del(sno);
		if(result>0) {
			//删除成功
			resp.sendRedirect("Index");
		}else {
			req.getRequestDispatcher("Index").forward(req, resp);
		}
	}

}
