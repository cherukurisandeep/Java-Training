import com.javatraining.DetailsList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class DetailsListTest extends Mockito {
    @Mock
    private DataSource ds;
    @Mock
    private Connection c;
    @Mock
    private PreparedStatement stmt;
    @Mock
    private ResultSet rs;
    @Mock
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
    HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
    @Before
    public void setUp() throws AssertionError,Exception{
        assertNotNull(ds);
        when(c.prepareStatement(any(String.class))).thenReturn(stmt);
        when(ds.getConnection()).thenReturn(c);
        when(request.getParameter("fname")).thenReturn("shiva");
        when(request.getParameter("email")).thenReturn("Shiva123@gmail.com");
        when(request.getParameter("age")).thenReturn("26");
        when(request.getParameter("mobile")).thenReturn("9988551144");
        when(stmt.executeQuery()).thenReturn(rs);
    }

    @Test
    public void testServlet() throws Exception{

        new DetailsList().doPost(request,response);
        new DetailsList().doGet(request,response);
       // writer.flush(); // it may not have been flushed yet...
        /*assertTrue(stringWriter.toString().contains("My expected string"));*/
    }

}
