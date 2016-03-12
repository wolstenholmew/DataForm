package freshstart.forms;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 *
 * @author WayneWolstenholme
 */
public class MailConfigurator {
    
    private Properties props;
    private Authenticator auth;
    private Session session;
    
    public void loadProperties(String hostName, String portNumber, String smtpAuth) {
        this.props = new Properties();
        this.props.setProperty("mail.host", hostName);
        this.props.setProperty("mail.smtp.port", portNumber);
        this.props.setProperty("mail.smtp.auth", smtpAuth);
    }
    
    public void passwordAuthentication(String userName, String password) {
        this.auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
    }
    
    public Session getSession() {
        this.session = Session.getDefaultInstance(this.props, this.auth);
        return this.session;
    }
    
}
