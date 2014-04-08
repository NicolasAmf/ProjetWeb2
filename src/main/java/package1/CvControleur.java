package package1; /**
 * Created by jouenni1 on 01/04/14.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cv")
public class CvControleur
{

    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getCvInXML(@PathVariable String name)
    {
        ResumeList rl = new ResumeList();
        Cv cv = new Cv(name, "Bob");
        Cv cv2 = new Cv("Solylok", "Personne");
        rl.cv.add(cv);
        rl.cv.add(cv2);

        return rl;
    }

}