package com.cuixx.es.sys.permission.repository;

import com.cuixx.es.common.repository.BaseRepository;
import com.cuixx.es.sys.permission.entity.Role;
import com.cuixx.es.sys.permission.entity.RoleResourcePermission;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends BaseRepository<Role, Long> {

    @Query("from RoleResourcePermission where role=?1 and resourceId=?2")
    RoleResourcePermission findRoleResourcePermission(Role role, Long resourceId);
}
