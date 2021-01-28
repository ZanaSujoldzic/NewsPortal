
package news.view;

import java.util.List;
import news.model.NewsPortal;
import news.model.business.NewsPortalFacadeLocal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewsPortalManagedBeanIT {
    
    public NewsPortalManagedBeanIT() {
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
     * Test of getNewsPortal method, of class NewsPortalManagedBean.
     */
    @Test
    public void testGetNewsPortal() {
        System.out.println("getNewsPortal");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        NewsPortal expResult = null;
        NewsPortal result = instance.getNewsPortal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewsPortal method, of class NewsPortalManagedBean.
     */
    @Test
    public void testSetNewsPortal() {
        System.out.println("setNewsPortal");
        NewsPortal newsPortal = null;
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        instance.setNewsPortal(newsPortal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewsPortalFacadeLocal method, of class NewsPortalManagedBean.
     */
    @Test
    public void testGetNewsPortalFacadeLocal() {
        System.out.println("getNewsPortalFacadeLocal");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        NewsPortalFacadeLocal expResult = null;
        NewsPortalFacadeLocal result = instance.getNewsPortalFacadeLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewsPortalFacadeLocal method, of class NewsPortalManagedBean.
     */
    @Test
    public void testSetNewsPortalFacadeLocal() {
        System.out.println("setNewsPortalFacadeLocal");
        NewsPortalFacadeLocal newsPortalFacadeLocal = null;
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        instance.setNewsPortalFacadeLocal(newsPortalFacadeLocal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class NewsPortalManagedBean.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class NewsPortalManagedBean.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody method, of class NewsPortalManagedBean.
     */
    @Test
    public void testGetBody() {
        System.out.println("getBody");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        String expResult = "";
        String result = instance.getBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody method, of class NewsPortalManagedBean.
     */
    @Test
    public void testSetBody() {
        System.out.println("setBody");
        String body = "";
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        instance.setBody(body);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class NewsPortalManagedBean.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class NewsPortalManagedBean.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class NewsPortalManagedBean.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        NewsPortal newsPortal = null;
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        String expResult = "";
        String result = instance.add(newsPortal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class NewsPortalManagedBean.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        NewsPortal newsPortal = null;
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        instance.delete(newsPortal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class NewsPortalManagedBean.
     */
    @Test
    public void testEdit_NewsPortal() {
        System.out.println("edit");
        NewsPortal newsPortal = null;
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        String expResult = "editNews";
        String result = instance.edit(newsPortal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class NewsPortalManagedBean.
     */
    @Test
    public void testEdit_0args() {
        System.out.println("edit");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        String expResult = "";
        String result = instance.edit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllNews method, of class NewsPortalManagedBean.
     */
    @Test
    public void testGetAllNews() {
        System.out.println("getAllNews");
        NewsPortalManagedBean instance = new NewsPortalManagedBean();
        List<NewsPortal> expResult = null;
        List<NewsPortal> result = instance.getAllNews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
