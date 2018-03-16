import com.javatraining.Logout;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class LogoutTest extends Mockito {
    @Mock
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
    HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
    HttpSession session = Mockito.mock(HttpSession.class);

    @Before
    public void setup(){
        session = request.getSession(false);
    }

    @Test
    public void testLogoutServelet() throws ServletException, IOException {
        new Logout().doGet(request,response);
        new Logout().doPost(request,response);
    }
}
