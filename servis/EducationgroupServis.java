package servis;

import java.util.ArrayList;
import java.util.List;
import model.Educationalgroup;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class EducationgroupServis {

    public List<Educationalgroup> createEducationalgroup(Teacher teacher, List<Student> student){
        List<Educationalgroup> eduGroup = new ArrayList<>();
        for (User user : eduGroup) {
            if (user instanceof Student) {
                eduGroup.add(student);
            }
            else eduGroup.add(teacher);
        }
        return eduGroup;    
    }
   
    
}

