package com.societe.blog;

import java.io.File;
import java.io.IOException;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.jsfunit.api.InitialPage;
import org.jboss.jsfunit.jsfsession.JSFClientSession;
import org.jboss.jsfunit.jsfsession.JSFServerSession;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
@Ignore
public class MasterDetailsManagedBeanTest {


    @Deployment
    public static WebArchive createDeployment() {
        WebArchive war =
                ShrinkWrap.create(WebArchive.class, "test.war")
                        .setWebXML(new File("src/main/webapp/WEB-INF/web.xml"))
                        .addPackage(Package.getPackage("com.societe.blog")) // my test package
                        .addAsWebResource(new File("src/main/webapp", "pages/master.xhtml"))
                        .addAsWebResource(new File("src/main/webapp", "pages/detail.xhtml"))
                        .addAsWebInfResource(new File("src/main/webapp/WEB-INF/faces-config.xml"), "faces-config.xml");
        System.out.println(war.toString(true)); // for debugging
        return war;
    }

    @Test
    @InitialPage("/master.faces")
    public void testInitialPage(JSFServerSession server, JSFClientSession client) throws IOException {
        
    }
}
