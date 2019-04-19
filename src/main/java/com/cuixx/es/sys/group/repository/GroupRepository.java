package com.cuixx.es.sys.group.repository;

import com.cuixx.es.common.repository.BaseRepository;
import com.cuixx.es.sys.group.entity.Group;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupRepository extends BaseRepository<Group, Long> {

    @Query("select id from Group where defaultGroup=true and show=true")
    List<Long> findDefaultGroupIds();

}
