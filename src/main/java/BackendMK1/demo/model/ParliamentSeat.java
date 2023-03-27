package BackendMK1.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "constituency")
public class ParliamentSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String constituency;
    private String electedIndividual;
    private String Party;
    private int Age;
    private String Gender;
    private boolean ActiveStatus =true;
    private int score;

    public ParliamentSeat() {
    }

    public ParliamentSeat(Long id, String constituency, String electedIndividual, String party, int age, String gender, boolean activeStatus, int score) {
        this.id = id;
        this.constituency = constituency;
        this.electedIndividual = electedIndividual;
        Party = party;
        Age = age;
        Gender = gender;
        ActiveStatus = activeStatus;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getElectedIndividual() {
        return electedIndividual;
    }

    public void setElectedIndividual(String electedIndividual) {
        this.electedIndividual = electedIndividual;
    }

    public String getParty() {
        return Party;
    }

    public void setParty(String party) {
        Party = party;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public boolean isActiveStatus() {
        return ActiveStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        ActiveStatus = activeStatus;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
