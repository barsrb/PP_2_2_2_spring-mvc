package web.model;

public class Car {
    private long id;
    private String name;
    private String model;

    public Car(long id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
