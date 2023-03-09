public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        if (this.name == null || this.surname == null || this.age == 0 || this.address == null) {
            throw new IllegalStateException("Не достаточно данных");
        }
        return new Person(this.name,
                this.surname,
                this.age,
                this.address);
    }
}
