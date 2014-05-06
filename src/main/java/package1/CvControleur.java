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
    Cv cv = new Cv("Jouenne", "passepartout", "Homme", 0,  "Recrutement", "Licence, Université du havre 2012-2013, IUT du havre 2011-2012, IUT du havre 2010-2011","stage en infographie, stage java a l université de rouen, stage web/base de donnée à l'université de rouen","JAVA, C, SQL","motivé!");
    Cv cv1 = new Cv("Jouenne", "Nicolas", "Homme", 1, "Recrutement", "Licence, Université du havre 2012-2013, IUT du havre 2011-2012, IUT du havre 2010-2011","stage en infographie, stage java a l université de rouen, stage web/base de donnée à l'université de rouen","JAVA, C, SQL","motivé!");
    Cv cv2 = new Cv("Jouenne", "Nicolas", "Homme", 2, "Recrutement", "Licence, Université du havre 2012-2013, IUT du havre 2011-2012, IUT du havre 2010-2011","stage en infographie, stage java a l université de rouen, stage web/base de donnée à l'université de rouen","JAVA, C, SQL","motivé!");


    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getCvInXML(@PathVariable int id)
    {
        ResumeList r2 = new ResumeList();

       if(cv.getId() == id)  r2.cv.add(cv);
       else if(cv1.getId() == id)  r2.cv.add(cv1);
       else if(cv2.getId() == id)  r2.cv.add(cv2);

       return r2;
    }


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getCvInXML()
    {
        ResumeList rl = new ResumeList();
        rl.cv.add(cv);
        rl.cv.add(cv1);
        rl.cv.add(cv2);

        return rl;
    }

    @RequestMapping(value="{name}", method = RequestMethod.PUT)
    public @ResponseBody
    ResumeList putCvInXML(@PathVariable String name)
    {
        ResumeList r3 = new ResumeList();

        Cv cv2 = new Cv(name,"", "", 0, "", "","","","");

        return r3;
    }

}