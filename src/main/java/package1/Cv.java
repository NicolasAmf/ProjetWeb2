package package1; /**
 * Created by jouenni1 on 01/04/14.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cv")
public class Cv {

    String name;
    String firstname;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstname;
    }

    @XmlElement
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public Cv(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public Cv() {
    }

}