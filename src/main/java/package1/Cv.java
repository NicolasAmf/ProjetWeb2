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
    String educationPremiere;
    String educationDeuxieme;
    String educationTroisieme;
    String experiencePremiere;
    String experienceDeuxieme;
    String experienceTroisieme;
    String languageInfoConnu1;
    String languageInfoConnu2;
    String languageInfoConnu3;
    String motivation;

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
    public void seteducationPremiere(String educationPremiere) {
        this.educationPremiere = educationPremiere;
    }
    public void seteducationDeuxieme(String educationDeuxieme) {
        this.educationDeuxieme = educationDeuxieme;
    }
    public void setEducationTroisieme(String educationTroisieme) {
        this.educationTroisieme = educationTroisieme;
    }
    public void setLanguageInfoConnu1(String languageInfoConnu1) {
        this.languageInfoConnu1 = languageInfoConnu1;
    }
    public void setLanguageInfoConnu2(String languageInfoConnu2) {
        this.languageInfoConnu2 = languageInfoConnu2;
    }
    public void setLanguageInfoConnu3(String languageInfoConnu3) {
        this.languageInfoConnu3 = languageInfoConnu3;
    }
    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }
    public void setExperiencePremiere(String experiencePremiere) {
        this.experiencePremiere = experiencePremiere;
    }
    public void setexperienceDeuxieme(String experienceDeuxieme) {
        this.experienceDeuxieme = experienceDeuxieme;
    }
    public void setExperienceTroisieme(String experienceTroisieme) {
        this.experienceTroisieme = experienceTroisieme;
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
    public String getObjectif() {return objectif;}
    public String getEducationPremiere() {
        return educationPremiere;
    }
    public String getEducationDeuxieme() {
        return educationDeuxieme;
    }
    public String getEducationTroisieme() {
        return educationTroisieme;
    }
    public String getExperiencePremiere() {
        return experiencePremiere;
    }
    public String getExperienceDeuxieme() {
        return experienceDeuxieme;
    }
    public String getExperienceTroisieme() {
        return experienceTroisieme;
    }
    public String getLanguageInfoConnu1() {
        return languageInfoConnu1;
    }
    public String getLanguageInfoConnu2() {
        return languageInfoConnu2;
    }
    public String getLanguageInfoConnu3() {
        return languageInfoConnu3;
    }
    public String getMotivation() {
        return motivation;
    }


    public Cv(String name, String firstname,  String sexe, int age,
            String objectif,
            String educationPremiere ,String educationDeuxieme,
            String educationTroisieme,
            String experiencePremiere,
            String experienceDeuxieme,
            String experienceTroisieme,
            String languageInfoConnu1,
            String languageInfoConnu2,
            String languageInfoConnu3,
            String motivation)
    {
        this.name = name;
        this.firstname = firstname;
        this.sexe= name;
        this.age= age;
        this.objectif= objectif;
        this.educationPremiere= educationPremiere;
        this.educationDeuxieme= educationDeuxieme;
        this.educationTroisieme= educationTroisieme;
        this.experiencePremiere= experiencePremiere;
        this.experienceDeuxieme= experienceDeuxieme;
        this.experienceTroisieme= experienceTroisieme;
        this.languageInfoConnu1= languageInfoConnu1;
        this.languageInfoConnu2= languageInfoConnu2;
        this.languageInfoConnu3= languageInfoConnu3;
        this.motivation= motivation;
    }

    public Cv() {}

}