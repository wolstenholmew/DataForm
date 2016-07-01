package inputFormBean;
import java.util.Hashtable;

/**
 *
 * @author WayneWolstenholme
 */
public class FormBean {
    
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Hashtable errors;
    
    public boolean validate() {
        boolean allOk = true;
        if (this.firstName.equals("")) {
            errors.put("firstName", "Please enter your first name");
            this.firstName = "";
            allOk = false;
        }
        if (this.lastName.equals("")) {
            errors.put("lastName", "Please enter your last name");
            this.lastName = "";
            allOk = false;
        }
        if (this.emailAddress.equals("")) {
            errors.put("emailAddress", "Please enter your email address");
            this.emailAddress = "";
            allOk = false;
        }
        return allOk;
    }
    
    public String getErrorMsg(String s) {
        String error = (String) this.errors.get(s);
        return (null == error) ? "" : error;
    }
    
    public FormBean() {
        this.title = "";
        this.firstName = "";
        this.lastName = "";
        this.emailAddress = "";
        this.errors = new Hashtable();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
}
