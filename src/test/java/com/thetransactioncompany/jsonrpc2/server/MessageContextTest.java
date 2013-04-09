package com.thetransactioncompany.jsonrpc2.server;


import java.net.URL;
import java.net.URLConnection;

import junit.framework.TestCase;


/**
 * Tests the message context class.
 *
 * @author Vladimir Dzhuvinov
 */
public class MessageContextTest extends TestCase {


	public void testConstuctFromURLConnection()
		throws Exception {

		URL url = new URL("https://google.com/");

		URLConnection con = url.openConnection();
		con.getHeaderFields();
		con.getInputStream();

		MessageContext mctx = new MessageContext(con);

		System.out.println("Message Context: " + mctx);

		assertNotNull(mctx.getClientHostName());
		assertTrue(mctx.isSecure());
		assertNotNull(mctx.getPrincipal());
	}
}