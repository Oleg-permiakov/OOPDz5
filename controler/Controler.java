package controler;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class Controler {
    public List<User> userList = new ArrayList<>();
    public void printOnConsole(User user){
        System.out.println(user);
    }
    private int getFreeId(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int Id = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                Id = ((Teacher) user).getIdTeacher();
            }
            if (user instanceof Student && itsStudent) {
                Id = ((Student) user).getIdStudent(); 
            }
            return Id;
        }
    }
   
}
