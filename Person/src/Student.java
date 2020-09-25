
public class Student {
    private String name,id,group,email;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public String getId(){
        return id;
    }
    public void setId(String n){
        this.id = n;
    }

    public String getGroup(){
        return group;
    }
    public void setGroup(String n){
        this.group = n;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String n){
        this.email = n;
    }

    public String getInfo(){
        String a = this.name + " - " + this.id + " - " + this.group+" - "+this.email;
        return a;
    }

    public Student(){
       this.name = "Student";
       this.id = "000";
       this.group = "K62CB";
       this.email = "uet@vnu.edu.vn";
    }

    public Student(String _name,String _id,String _email){
        this.name = _name;
        this.id = _id;
        this.email = _email;
        this.group = "K62CB";
    }

    public Student(Student s){
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

}


