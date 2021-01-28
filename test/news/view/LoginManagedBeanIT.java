
package news.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginManagedBeanIT {
    
    public LoginManagedBeanIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isLoggedIn method, of class LoginManagedBean.
     */
    @Test
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        LoginManagedBean instance = new LoginManagedBean();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoggedIn method, of class LoginManagedBean.
     */
    @Test
    public void testSetLoggedIn() {
        System.out.println("setLoggedIn");
        boolean isLoggedIn = false;
        LoginManagedBean instance = new LoginManagedBean();
        instance.setLoggedIn(isLoggedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class LoginManagedBean.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        LoginManagedBean instance = new LoginManagedBean();
        String expResult = "John";
        String result = instance.getUsername();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getPassword method, of class LoginManagedBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginManagedBean instance = new LoginManagedBean();
        String expResult = "john123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getMessage method, of class LoginManagedBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        LoginManagedBean instance = new LoginManagedBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class LoginManagedBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        LoginManagedBean instance = new LoginManagedBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class LoginManagedBean.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        LoginManagedBean instance = new LoginManagedBean();
        String expResult = "";
        String result = instance.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class LoginManagedBean.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        LoginManagedBean instance = new LoginManagedBean();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
