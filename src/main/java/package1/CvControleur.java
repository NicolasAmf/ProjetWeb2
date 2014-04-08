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
        Cv cv = new Cv(name, "passepartout", "Homme", 22,  "Recrutement", "Licence, Université du havre 2012-2013, IUT du havre 2011-2012, IUT du havre 2010-2011","stage en infographie, stage java a l université de rouen, stage web/base de donnée à l'université de rouen","JAVA, C, SQL","motivé!");
        Cv cv1 = new Cv("Jouenne", "Nicolas", "Homme", 24, "Recrutement", "Licence, Université du havre 2012-2013, IUT du havre 2011-2012, IUT du havre 2010-2011","stage en infographie, stage java a l université de rouen, stage web/base de donnée à l'université de rouen","JAVA, C, SQL","motivé!");
        Cv cv2 = new Cv("Jouenne", "Nicolas", "Homme", 24, "Recrutement", "Licence, Université du havre 2012-2013, IUT du havre 2011-2012, IUT du havre 2010-2011","stage en infographie, stage java a l université de rouen, stage web/base de donnée à l'université de rouen","JAVA, C, SQL","motivé!");
        rl.cv.add(cv);
        rl.cv.add(cv1);
        rl.cv.add(cv2);

        return rl;
    }

}