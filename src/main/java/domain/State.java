package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
public class State implements BaseEntity {

    @Id
    @GeneratedValue(generator = "estado_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id_estado")
    private Long id;
    @Column(name = "nome")
    private String name;

    @OneToMany(mappedBy="state")
    private List<City> items;

    public State() {}


    public State(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<City> getItems() {
        return items;
    }

    public void setItems(List<City> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
