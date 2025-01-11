package Access_Modifiers2;
import Access_Modifiers.*;
public class C {

    // since this has no modifier this is only visible within this package and can only be accessed if the main method
    // is in this package
    String defaultMessage = "This is a default message.";

    public String publicMessage = "This is a public message";

    protected String protectedMessage = "this is a protected message";


}
