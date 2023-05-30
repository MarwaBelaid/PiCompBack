package tn.esprit.picompback.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Favoris implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_favoris ;

    Date date_favoris ;

}