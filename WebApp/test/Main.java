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
public class Main extends Mockito {
    @Mock
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
    HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
    HttpSession session = Mockito.mock(HttpSession.class);

    @Before
    public void setup(){
        session = request.getSession(false);
    }
    @Test
    public void Main() throws Exception {
        new LoginTest().testLodinServlet();
        new LogoutTest().testLogoutServelet();
        new DetailsListTest().testServlet();

    }
}
