package CoreJava.collectionPrograms;
/*
 * Comparable is an interface used to compare objects based on one of its properties.
 * When we want to sort collection of userdefined objects using sort method of the collections
 * class we need to specify how the objects have to be compared before sorting.
 * 
 * This is done with the help of Comparable interface.
 * We implement Comparable interface on our userdefined class and implement compareTo method
 * to specify the property on which comparison has to be done.
 */
public class Person implements Comparable<Person> {
    private Integer personId;
    private String pname;
    private boolean adult;
    private Integer age;
    private String nationality;

    public Person(Integer personId, String pname, boolean adult, Integer age, String nationality) {
        this.personId = personId;
        this.pname = pname;
        this.adult = adult;
        this.age = age;
        this.nationality = nationality;
    }

    public Integer getPersonId() {
        return personId;
    }
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public boolean isAdult() {
        return adult;
    }
    public void setAdult(boolean adult) {
        this.adult = adult;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Person()
    {
        super();
    }

    @Override
    public String toString() {
        return "Person [personId=" + personId + ", pname=" + pname + ", adult=" + adult + ", age=" + age
                + ", nationality=" + nationality + "]";
    }

    @Override
    public int compareTo(Person o) 
    {
        return this.personId.compareTo(o.personId);
    }
    
}
