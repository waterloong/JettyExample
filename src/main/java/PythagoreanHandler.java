import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PythagoreanHandler extends AbstractHandler
{

    public void handle( String target,
                        Request baseRequest,
                        HttpServletRequest request,
                        HttpServletResponse response ) throws IOException,
            ServletException
    {
        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

        PrintWriter out = response.getWriter();

        double adjacent = Double.parseDouble(request.getParameter("adjacent"));
        double opposite = Double.parseDouble(request.getParameter("opposite"));
        double hypotenuse = Math.sqrt(adjacent * adjacent + opposite * opposite);
        out.println("<h1>" + hypotenuse + "</h1>");

        baseRequest.setHandled(true);
    }
}
