package br.edu.ifpb.pweb2.retrato.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_follow")
public class Follow {
    @EmbeddedId
    private FollowId id;
}
