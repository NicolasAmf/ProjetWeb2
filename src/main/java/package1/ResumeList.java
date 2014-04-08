package package1;

/**
 * Created by jouenni1 on 01/04/14.
 */

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="cv")
public class ResumeList
{
    public List<Cv> cv = new ArrayList<Cv>();

}
