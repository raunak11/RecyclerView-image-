package Model;

public class User {
    private String name, desc;
    private Integer image_id;

    public User(String name, String desc, Integer id) {
        this.name = name;
        this.desc = desc;
        this.image_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getImage_id() {
        return image_id;
    }

    public void setImage_id(Integer id) {
        this.image_id = id;
    }
}
