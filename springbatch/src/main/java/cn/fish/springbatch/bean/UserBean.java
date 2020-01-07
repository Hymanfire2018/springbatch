package cn.fish.springbatch.bean;

import javax.validation.constraints.Size;

import lombok.Data;

/**
 * @Description:
 * @Author devin.jiang
 * @CreateDate 2019/5/11 21:34
 */
@Data
public class UserBean {

    private Integer id;

    @Size(min = 2,max = 4)
    private String name;

    private String address;

    private String nation;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
