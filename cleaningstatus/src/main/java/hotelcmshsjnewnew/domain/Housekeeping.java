package hotelcmshsjnewnew.domain;

import hotelcmshsjnewnew.CleaningstatusApplication;
import hotelcmshsjnewnew.domain.CleaningStatusUpdated;
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

    private Boolean cleaned;

    private Long roomId;

    @PostPersist
    public void onPostPersist() {
        CleaningStatusUpdated cleaningStatusUpdated = new CleaningStatusUpdated(
            this
        );
        cleaningStatusUpdated.publishAfterCommit();
    }

    public static HousekeepingRepository repository() {
        HousekeepingRepository housekeepingRepository = CleaningstatusApplication.applicationContext.getBean(
            HousekeepingRepository.class
        );
        return housekeepingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateAssigningStatus(
        HousekeeperAssigned housekeeperAssigned
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Housekeeping housekeeping = new Housekeeping();
        repository().save(housekeeping);

        */

        /** Example 2:  finding and process
        
        repository().findById(housekeeperAssigned.get???()).ifPresent(housekeeping->{
            
            housekeeping // do something
            repository().save(housekeeping);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
