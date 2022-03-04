package immutability;

public class ImmutablePerson {

    private Integer id;
    private String firstName;
    private String lastName;
    private Age age;

    public ImmutablePerson() {

    }

    public ImmutablePerson(Integer id, String firstName, String lastName, Age age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Age getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Age age) {
        this.age = age;
    }
}
