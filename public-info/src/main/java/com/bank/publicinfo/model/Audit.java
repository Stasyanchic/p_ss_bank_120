package com.bank.publicinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit", schema = "public_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "entity_type", length = 40)
    private String entityType;

    @Column(name = "operation_type")
    private String operationType;

    @Column(name = "created_by")
    private String createdBy;

    @NotNull
    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @NotNull
    @Column(name = "modfied_at", nullable = false)
    private LocalDateTime modifiedAt;

    @NotNull
    @Column(name = "new_entity_json", columnDefinition = "text", nullable = false)
    private String newEntityJson;

    @Column(name = "entity_json", columnDefinition = "text", nullable = false)
    private String entityJson;

}
