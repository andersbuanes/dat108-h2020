package c_logginnutil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoggInnUtil {

    public static boolean isLoggetInn(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        return (session != null) && (session.getAttribute("user") != null);
    }

    public static void loggInn(HttpServletRequest request, Deltager deltager) {

        // Invalidate old session
        loggUt(request);

        // Create new fresh session
        HttpSession sesjon = request.getSession(true);

        // Store user with pre-validated username in session.
        // A "user" in the session is how we see that we have a logged in user
        sesjon.setAttribute("user", deltager);
    }

    public static void loggUt(HttpServletRequest request) {

        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
    }

}
