package controllor;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Students;
import service.impl.StudentServiceImpl;
@WebServlet("/Index")
public class IndexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//创建一个service层的对象
		StudentServiceImpl ss=new StudentServiceImpl();
		//创建一个集合
		List<Students> student=ss.getAll();
		//将数据存在作用域中
		req.setAttribute("student", student);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
