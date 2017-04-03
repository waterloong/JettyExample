import org.eclipse.jetty.server.Server;

public class OneHandler
{
    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);
//        server.setHandler(new HelloHandler());
        server.setHandler(new PythagoreanHandler());
        server.start();
        server.join();
    }
}