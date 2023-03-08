package web.model;

public class Car {
    private String name;
    private String model;
    private Integer age;

    public Car(String name, String model, Integer age) {
        this.name = name;
        this.model = model;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getName() != null ? !getName().equals(car.getName()) : car.getName() != null) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        return getAge() != null ? getAge().equals(car.getAge()) : car.getAge() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }
}
