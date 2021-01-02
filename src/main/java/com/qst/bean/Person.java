package com.qst.bean;

public class Person {
    private int person_id;
    private String person_pn;
    private String person_pd;

    public Person(int person_id, String person_pn, String person_pd) {
        this.person_id = person_id;
        this.person_pn = person_pn;
        this.person_pd = person_pd;
    }
    public Person(){}

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_pn() {
        return person_pn;
    }

    public void setPerson_pn(String person_pn) {
        this.person_pn = person_pn;
    }

    public String getPerson_pd() {
        return person_pd;
    }

    public void setPerson_pd(String person_pd) {
        this.person_pd = person_pd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", person_pn='" + person_pn + '\'' +
                ", person_pd='" + person_pd + '\'' +
                '}';
    }
}
