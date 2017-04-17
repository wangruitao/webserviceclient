package org.template.com.wsimportclient;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.soap.SOAPFaultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.template.com.service.User;

import com.template.org.service.UserService;
import com.template.org.service.UserServiceImplService;

public class WSClient {

	 private static final Logger LOG = LoggerFactory.getLogger(WSClient.class);

	    private static final String USER_NAME = "admin";
	    private static final String PASS_WORD = "pass";

	    public static void main(String[] args) {
	        
	        //方式二：通过wsimport生成客户端代码
	    	UserServiceImplService impl = new UserServiceImplService();
	        impl.setHandlerResolver(new HandlerResolver() {
	            @SuppressWarnings("rawtypes")
				@Override
	            public List<Handler> getHandlerChain(PortInfo portInfo) {
	                List<Handler> handlerList = new ArrayList<Handler>();
	                handlerList.add(new ClientHandler(USER_NAME, PASS_WORD));
	                return handlerList;
	            }
	        });
	        try {
	            UserService userService = impl.getUserServiceImplPort();
	            User user = userService.findByUserId(19L);
	            System.out.println("用户名称：" + user.getUserName());
	        } catch (SOAPFaultException e) {
	            LOG.error("SOAPFaultException occurs:{}", e.getMessage());
	        }
	    }
}
