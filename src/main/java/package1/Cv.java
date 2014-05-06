package package1; /**
 * Created by jouenni1 on 01/04/14.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cv")
public class Cv {

    String name;
    String firstname;
    String sexe;
    int age;
    String objectif;
    String educations;
    String experiences;
    String languageInfoConnus;
    String motivation;
    int id;
    static int cpt = 1;

    public String getName() {
        return name;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public void setAge( int age) {
        this.age = age;
    }
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }
    public void setEducations(String educations) {
        this.educations = educations;
    }
    public void setLanguageInfoConnus(String languageInfoConnus) {
        this.languageInfoConnus = languageInfoConnus;
    }
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }
    public void setId(int id) {
        this.id = id;
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

    public String getSexe() {
        return sexe;
    }
    public int getAge() {return age;}
    public int getId() {return id;}
    public String getObjectif() {return objectif;}
    public String getEducations() {
        return educations;
    }
    public String getExperiences() {
        return experiences;
    }
    public String getLanguageInfoConnus() {
        return languageInfoConnus;
    }

    public String getMotivation() {
        return motivation;
    }


    public Cv(String name, String firstname,
            String sexe,
            int age,
            String objectif,
            String educations ,
            String experiences,
            String languageInfoConnus,
            String motivation)
    {
        this.id = cpt;
        cpt++;
        this.name = name;
        this.firstname = firstname;
        this.sexe= sexe;
        this.age= age;
        this.objectif= objectif;
        this.educations= educations;
        this.experiences= experiences;
        this.languageInfoConnus= languageInfoConnus;

        this.motivation= motivation;
    }

    public Cv() {}

}