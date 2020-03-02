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
		//���ñ����ʽ
		req.setCharacterEncoding("UTF-8");
		//����ҳ������
		String sno=req.getParameter("sno");
		//����һ��service��Ķ���
		StudentServiceImpl ss=new StudentServiceImpl();
		int result =ss.del(sno);
		if(result>0) {
			//ɾ���ɹ�
			resp.sendRedirect("Index");
		}else {
			req.getRequestDispatcher("Index").forward(req, resp);
		}
	}

}
