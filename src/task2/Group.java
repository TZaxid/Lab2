package task2;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> students;
    private int gid;
    private String gname;

    public Group(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
        students = new ArrayList<Student>();
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void showStudents() {
        System.out.println("Group #" + gid + " " + gname + " " + students.size() + " students");
        for (Student st : students) {
            st.show();
        }
    }

    public boolean isStudentPresent(Student inSt) {
        for (Student st : students) {
            if (st.getId() == inSt.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(Student st) {
        if (!isStudentPresent(st)) {
            students.add(st);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeStudent (Student st) {
        if (isStudentPresent(st)) {
            students.remove(st);
            return true;
        } else {
            return false;
        }
    }
}
