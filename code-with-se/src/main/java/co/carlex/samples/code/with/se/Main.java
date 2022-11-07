package co.carlex.samples.code.with.se;


import java.util.List;
import javax.ws.rs.core.Application;
import org.jboss.resteasy.plugins.server.netty.NettyJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

/**
 *
 * @author Carlex
 */
public class Main extends Application {
    
    public static void main(String[] args) throws Exception {
        NettyJaxrsServer netty = new NettyJaxrsServer();
        ResteasyDeployment deployment = new ResteasyDeployment();
        deployment.setSecurityEnabled(true);
        deployment.setApplication(new Main());
        deployment.setResourceClasses(List.of(GreetingResource.class.getName()));
        netty.setDeployment(deployment);
        netty.setPort(8089);
        netty.start();
    }
    
}
