package hotelcmshsjnewnew.domain;

import hotelcmshsjnewnew.AssigningstatusApplication;
import hotelcmshsjnewnew.domain.HousekeeperAssigned;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Housekeeping_table")
@Data
//<<< DDD / Aggregate Root
public class Housekeeping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long housekeepingId;

    private Long accomodationId;

    private Long housekeeperId;

    private Long roomId;

    @PostPersist
    public void onPostPersist() {
        HousekeeperAssigned housekeeperAssigned = new HousekeeperAssigned(this);
        housekeeperAssigned.publishAfterCommit();
    }

    public static HousekeepingRepository repository() {
        HousekeepingRepository housekeepingRepository = AssigningstatusApplication.applicationContext.getBean(
            HousekeepingRepository.class
        );
        return housekeepingRepository;
    }
}
//>>> DDD / Aggregate Root
