package Test.models;

public class Proveedor {

    private String id = null;
    private String name = null;

    public Proveedor() {
    }

    public Proveedor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
