package javacodechecker;
public class RedirectWithoutExit {
   public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        	 logger.info("doing some more things here after the redirect");
        	 logger.info("doing some more things here after the redirect");
		response.sendRedirect("/test");
		Logger.info("doing some more things here after the redirect");
	}
}
