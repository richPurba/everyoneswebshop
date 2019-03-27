package com.everyone.everyoneswebshop.Entity.Model;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table("Initial_data")
public class InitialData {

    @PrimaryKeyColumn(name="id", ordinal=0, type= PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private UUID id;

    @PrimaryKeyColumn(name="company",ordinal=1,type=PrimaryKeyType.PARTITIONED)
    private String company;

    @PrimaryKeyColumn(name="country", ordinal=2, type=PrimaryKeyType.PARTITIONED)
    private String country;

    @Column
    private String address;

    @Column
    private String businessType;
}
