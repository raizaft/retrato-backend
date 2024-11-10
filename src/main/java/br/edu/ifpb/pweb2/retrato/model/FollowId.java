package br.edu.ifpb.pweb2.retrato.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class FollowId implements Serializable {

    private Integer followeeId;
    private Integer followerId;

}
