import com.javatraining.LoginServlet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@RunWith(MockitoJUnitRunner.class)
public class LoginTest  extends Mockito{
    @Mock
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
    HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
    HttpSession session = Mockito.mock(HttpSession.class);
    @Before
    public void setUp(){
        session = request.getSession();
        when(request.getParameter("userName")).thenReturn("sandeep");
        when(request.getParameter("userPassword")).thenReturn("123");
        when(request.getSession(false)).thenReturn(session);
        //session.setAttribute("username","sandeep");
    }

    @Test
    public void testLodinServlet() throws Exception{
        new LoginServlet().doGet(request,response);
        new LoginServlet().doPost(request,response);
       // session.setAttribute("username","sandeep");

    }
}
