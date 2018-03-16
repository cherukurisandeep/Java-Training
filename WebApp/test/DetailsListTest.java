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
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class DetailsListTest extends Mockito {
    @Mock
    DataSource mockDataSource;
    @Mock
    Connection mockConn;
    @Mock
    PreparedStatement mockPreparedStmnt;
    @Mock
    ResultSet mockResultSet;
    @Mock
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
    HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
    @Before
    public void setUp() throws AssertionError,SQLException {
        assertNotNull(mockDataSource);
        when(mockDataSource.getConnection(anyString(), anyString())).thenReturn(mockConn);
        doNothing().when(mockConn).commit();
        when(request.getParameter("fname")).thenReturn("thaman");
        when(request.getParameter("email")).thenReturn("thaman@gmail.com");
        when(request.getParameter("age")).thenReturn("26");
        when(request.getParameter("mobile")).thenReturn("864483888");
        when(mockPreparedStmnt.execute()).thenReturn(Boolean.TRUE);
        when(mockResultSet.next()).thenReturn(Boolean.TRUE, Boolean.FALSE);
    }

    @Test
    public void testServlet() throws Exception{

        new DetailsList().doPost(request,response);
        new DetailsList().doGet(request,response);
       // writer.flush(); // it may not have been flushed yet...
        /*assertTrue(stringWriter.toString().contains("My expected string"));*/
    }

}
