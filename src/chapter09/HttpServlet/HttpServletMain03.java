package chapter09.HttpServlet;

public class HttpServletMain03 {

	public static void main(String[] args) {
		Service(new LoginService());
		Service(new FileDownloadService());

	}
	public static void Service(HttpServlet hp) {
		hp.service();
	}

}
