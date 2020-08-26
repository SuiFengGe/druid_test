package cn.itcast.domain;
/*
封装Emp表数据的javaBean
 */
public class Emp {
    private  int id;
    private int job_id;
    private String ename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", job_id=" + job_id +
                ", ename='" + ename + '\'' +
                '}';
    }
}
