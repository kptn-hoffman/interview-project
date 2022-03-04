package immutability;

public final class ImmutablePerson {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final Age age;


    public ImmutablePerson(Integer id, String firstName, String lastName, Age age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        this.age = new Age(
                age.getDay(),
                age.getMonth(),
                age.getYear()
        );
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
        return new Age(
                age.getDay(),
                age.getMonth(),
                age.getYear()
        );
    }
}
