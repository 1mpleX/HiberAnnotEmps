package hibernate_many_to_many.entity;

import com.sun.xml.bind.v2.runtime.Name;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public Section() {
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "child_section"
            , joinColumns = @JoinColumn(name = "section_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Children> children;

    public Section(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void addChild(Children child) {
        if(children==null){
            children = new ArrayList<>();
        }
        children.add(child);
    }
}
