package router;

import controllers.AuthController;
import controllers.ContactController;

public class Router {
    private AuthController authController;
    private ContactController contactController;

    public Router(AuthController authController, ContactController contactController) {
        this.authController = authController;
        this.contactController = contactController;
    }

    public String handleRequest(String route, String method, String body) {
        switch (route) {
            case "/contacts":
                if ("GET".equals(method)) {
                    return contactController.getAllContacts().toString();
                }
                break;
            case "/login":
                // Handle login route
                break;
            default:
                return "404 Not Found";
        }
        return "500 Internal Server Error";
    }
}
