public class StudentManagement{
    Student[] students = new Student[100];
    int dem = 0;
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup().equals(s2.getGroup())){
            return true;
        }
        else return false;
    }
    public void addStudent(Student newStudent){
        students[dem] = newStudent;
        dem++;
    }
    public void removeStudent(String id){
        for (int i = 0; i < dem;i++){
            if (students[i].getId()==id){
                for (int j = i; j < dem-1; j++){
                    students[j] = students[j+1];
                }
                dem--;
            }
        }
    }
    public String studentsByGroup(){
        String a = "";
        String[] groups = new String[100];
        for(int i = 0;i < dem;i++){
            groups[i] = students[i].getGroup();
        }
        int n = dem;
        for(int i = 0;i <n-1;i++){
            for(int j = i+1;j < n;j++){
                if(groups[j]==groups[i]){
                    for(int k = j+1;k < n;k++){
                        groups[k-1] = groups[k];
                    }
                    n--;
                }
            }
        }
        for(int i = 0;i < n; i++){
            a = a+groups[i]+"\n";
            for(int j = 0;j < dem;j++){
                if(students[j].getGroup()==groups[i]){
                    a= a+students[j].getInfo()+"\n";
                }
            }
        }
        return a;
    }
    public static void main(String[] args){

    }
}